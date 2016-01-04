package queues;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class DrawStuff {
	private myQueue q = new myQueue();
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
	    final int FRAME_WIDTH = 800;
	    final int FRAME_HEIGHT = 1000;
	    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.setTitle("crappy draw thing");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void draw(Graphics2D gr)
	{
		ArrayList a = new ArrayList();
		Graphics2D g = gr;
		int x1, x2, y1, y2;
		a.add(x1);
		a.add(x2);
		a.add(y1);
		a.add(y2);
		
		for(Object i : a)
		{
			i = Math.random()
		}
		g.draw(new Line2D.Double(1, 1, 1, 1));
	}
	
}
