package queues;
import javax.swing.*;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class DrawStuff extends JComponent {
	private myQueue q = new myQueue();
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
	    final int FRAME_WIDTH = 800;
	    final int FRAME_HEIGHT = 800;
	    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.setTitle("crappy draw thing");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void draw(Graphics2D gr)
	{
		Graphics2D g = (Graphics2D) gr;
		ArrayList a = new ArrayList();
		int x1= 0, x2=0, y1=0, y2=0;
		a.add(x1);
		a.add(x2);
		a.add(y1);
		a.add(y2);
		
		for(Object i : a)
		{
			i = Math.random()*800;
		}
		g.draw(new Line2D.Double(x1, x2, y1, y2));
	}
	public void draw(Graphics2D gr, int x1, int y1)
	{
		ArrayList a = new ArrayList();
		Graphics2D g = gr;
		int x2=0, y2=0;
		a.add(x2);
		a.add(y2);
		
		for(Object i : a)
		{
			i = Math.random()*800;
		}
		g.draw(new Line2D.Double(x1, x2, y1, y2));
	}
}
