package queues;
import javax.swing.*;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DrawStuff {
	
	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("crappy draw thing");
	    final int FRAME_WIDTH = 800;
	    final int FRAME_HEIGHT = 800;
	    Canvas c = new Canvas();
	    c.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Graphics g = c.getGraphics();
	    g.setColor(new Color(255, 255, 255));
	    Queue<Line2D> q = new LinkedList<Line2D>();
	    int x1 = (int)Math.random() * 800;
    	int y1 = (int)Math.random() * 800;
	    try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	    for(int x = 0; x < 10; x++)
	    { 
	    	int x2 = (int)Math.random() * 800;
	    	int y2 = (int)Math.random() * 800;
	    	q.offer(new Line2D.Double(x1, y1, x2 , y2));
	    	g.drawLine(x1,  y2, x2, y2);
	    	x1 = x2;
	    	y1 = y2;
	    	Thread.sleep(500);
	    }
	    g.setColor(new Color(0, 0, 0));
	    
	    
	}
}
