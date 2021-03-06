package music;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.instruments.WaveShapingVoice;
import com.jsyn.scope.AudioScope;
import com.jsyn.swing.ExponentialRangeModel;
import com.jsyn.swing.JAppletFrame;
import com.jsyn.swing.PortControllerFactory;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryTextController;
import com.jsyn.unitgen.Add;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.LinearRamp;
import com.jsyn.unitgen.SineOscillator;
import com.jsyn.unitgen.UnitOscillator;
import com.jsyn.util.PseudoRandom;
import com.jsyn.util.VoiceAllocator;
import com.softsynth.jsyn.EqualTemperedTuning;
import com.softsynth.shared.time.TimeStamp;

/*
 * Play notes using a WaveShapingVoice. Allocate the notes using a
 * VoiceAllocator.
 */
public class RandomMusic extends JApplet implements Runnable
{
	//private static final long serialVersionUID = -7459137388629333223L;
	private Synthesizer synth;
	private Add mixer;
	private LineOut lineOut;
	private AudioScope scope;
	private volatile boolean go = false;
	private PseudoRandom pseudo = new PseudoRandom();
	private final static int MAX_VOICES = 8;
	private final static int MAX_NOTES = 5;
	private VoiceAllocator allocator;
	private final static int[] scale = {0,2,4,7,9}; // major pentatonic scale
	//private final static int[] scale = {0,3,5,7,10};	//minor pentatonic scale/ gapped blues
	//private final static int[] scale = {0,2,5,4,7,9};	//major scale (Ionian)
	//private final static int[] scale = {0,2,3,5,7,8};	//minor scale (Aeolian)
	
	private WaveShapingVoice voice;
	private LinearRamp lag;

	// Can be run as either an application or as an applet. 
	public static void main( String args[] )
	{
		RandomMusic applet = new RandomMusic();
		JAppletFrame frame = new JAppletFrame( "Random Music", applet );
		frame.setSize(400,300);
		frame.setVisible( true );
		frame.test();
	}
	public void init()
	{
		synth = JSyn.createSynthesizer();
		setLayout( new GridLayout( 0, 1 ) );
		// Add a tone generator.
		//synth.add( osc = new SineOscillator() );
		// Add a lag to smooth out amplitude changes and avoid pops.
		//synth.add( lag = new LinearRamp() );
		// Add an output mixer.
		synth.add( lineOut = new LineOut() );
		// Connect the oscillator to the output.
		//osc.output.connect( 0, lineOut.input, 0 );
		
		// Set the minimum, current and maximum values for the port.
//		lag.output.connect( osc.amplitude );
//		lag.input.setup( 0.0, 0.25, 1.0 );
//		lag.time.set(0.2);

		// Arrange the faders in a stack.

//		ExponentialRangeModel amplitude = PortModelFactory.createExponentialModel( lag.input );
//		RotaryTextController knob = new RotaryTextController( amplitude, 5 );
//		JPanel knobPanel = new JPanel();
//		knobPanel.add( knob );
//		add( knobPanel );

//		osc.frequency.setup( 50.0, 300.0, 10000.0 );
//		add( PortControllerFactory.createExponentialPortSlider( osc.frequency ) );
//		validate();
	}


	/*
	 * Setup synthesis.
	 */
	public void start()
	{


//		ExponentialRangeModel amplitude = PortModelFactory.createExponentialModel( lag.input );
//		RotaryTextController knob = new RotaryTextController( amplitude, 5 );
//		JPanel knobPanel = new JPanel();
//		knobPanel.add( knob );
//		add( knobPanel );
		
//		voice.frequency.setup( 50.0, 300.0, 10000.0 );
//		add( PortControllerFactory.createExponentialPortSlider( voice.frequency ) );
//		validate();


	

		// Use a submix so we can show it on the scope.
		mixer = new Add();
		synth.add(mixer);
		synth.add(lineOut);
		
		//two line outs so we can hear in stereo. 0 is left channel, 1 is right channel
		mixer.output.connect( 0, lineOut.input, 0 );
		mixer.output.connect( 0, lineOut.input, 1 );

		WaveShapingVoice[] voices = new WaveShapingVoice[MAX_VOICES];
		for( int i = 0; i < MAX_VOICES; i++ )
		{
			voice = new WaveShapingVoice();
			synth.add(voice);
			voice.usePreset(0);
			
			voice.getOutput().connect(mixer.inputA);
			voices[i] = voice;
			validate();
		}
		add( PortControllerFactory.createExponentialPortSlider( voice.frequency ) );
		allocator = new VoiceAllocator( voices );
		
		// Start synthesizer using default stereo output at 44100 Hz.
		synth.start();
		lineOut.start();

		// Use a scope to show the mixed output.
		scope = new AudioScope( synth );
		scope.addProbe( mixer.output );
		scope.setTriggerMode( AudioScope.TriggerMode.NORMAL );
		scope.getView().setControlsVisible(true);
		add( BorderLayout.CENTER, scope.getView() );
		scope.start();

		/* Synchronize Java display. */
		getParent().validate();
		getToolkit().sync();

		// start thread that plays notes
		Thread thread = new Thread( this );
		go = true;
		thread.start();

	}

	public void stop()
	{
		// tell song thread to finish
		go = false;
		removeAll();
		synth.stop();
	}

	double indexToFrequency( int index )
	{
		int octave = index / scale.length;
		int temp = index % scale.length;
		int pitch = scale[temp] + (12 * octave);
		return EqualTemperedTuning.getMIDIFrequency( (int) (pitch + 16) );
	}

	private void noteOff( double time, int noteNumber )
	{
		allocator.noteOff( noteNumber, new TimeStamp( time ) );
	}
	private void noteOn( double time, int noteNumber )
	{
		double frequency = indexToFrequency( noteNumber );
		double amplitude = 0.1;
		TimeStamp timeStamp = new TimeStamp( time );
		
		allocator.noteOn( noteNumber, frequency, amplitude, timeStamp );
		allocator.setPort( noteNumber, "Range" , 0.7, synth.createTimeStamp() );
	}

	public void run()
	{
		// always choose a new song based on time&date
		int savedSeed = (int) System.currentTimeMillis();
		// calculate tempo
		double duration = 0.2;
		// set time ahead of any system latency
		double advanceTime = 0.5;
		// time for next note to start
		double nextTime = synth.getCurrentTime() + advanceTime;
		// note is ON for half the duration
		double onTime = duration / 2;
		int beatIndex = 0;
		try
		{
			do
			{
				// on every measure, maybe repeat previous pattern
				//original bitwise func int was 7
				if( (beatIndex & 7) == 0 )
				{
					if( (Math.random() < (1.0 / 2.0)) )
						pseudo.setSeed( savedSeed );
					else if( (Math.random() < (1.0 / 2.0)) )
						savedSeed = pseudo.getSeed();
				}

				// Play a bunch of random notes in the scale.
				int numNotes = pseudo.choose( MAX_NOTES );
				for( int i = 0; i < numNotes; i++ )
				{
					int noteNumber = pseudo.choose( 30 );
					noteOn( nextTime, noteNumber );
					noteOff( nextTime + onTime, noteNumber );
				}
		
				nextTime += duration;
				beatIndex += 1;

				// wake up before we need to play note to cover system latency
				synth.sleepUntil( nextTime - advanceTime );
			} while( go );
		} catch( InterruptedException e )
		{
			System.err.println( "Song exiting. " + e );
		}
	}
}
