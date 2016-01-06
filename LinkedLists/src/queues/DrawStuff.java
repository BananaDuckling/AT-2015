package queues;
import javax.swing.*;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class DrawStuff extends Canvas {
	
	public static void main(String[] args) throws InterruptedException
	{
		
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(800, 800);

			Canvas c = new Canvas();
			c.setSize(800, 800);

			frame.add(c);
			frame.setVisible(true);

			Graphics g = c.getGraphics();
			while(true) {
			g.setColor(new Color(255, 0, 0));
			int x1 = (int) (Math.random() * (801));
			int y1 = (int) (Math.random() * (801));
			Queue<Point> lines = new LinkedList<Point>();
			
			for (int ii = 0; ii <= 10; ii++) {
				g.setColor(Color.BLACK);
				int x2 = (int) (Math.random() * (801));
				int y2 = (int) (Math.random() * (801));
				lines.offer(new Point(x1, y1));
				lines.offer(new Point(x2, y2));
				g.drawLine(x1, y1, x2, y2);
				x1 = x2;
				y1 = y2;
				Thread.sleep(250);
			}

			g.setColor(Color.WHITE);
			while (!lines.isEmpty()) {
				Point start = lines.poll();
				Point end = lines.poll();
				g.drawLine(start.x, start.y, end.x, end.y);
				Thread.sleep(250);
			}
			}
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(800, 800);
//
//		Canvas c = new Canvas();
//		c.setSize(800, 800);
//
//		frame.add(c);
//		frame.setVisible(true);
//
//		Graphics g = c.getGraphics();
//	    while(true)
//	    {
//		    g.setColor(new Color(255, 0, 0));
//		    Queue<Point> q = new LinkedList<Point>();
//		    
//		    int x1 = (int)Math.random() * 801;
//	    	int y1 = (int)Math.random() * 801;
//	
//	    	g.setColor(Color.WHITE);
//		    for(int x = 0; x < 10; x++)
//		    { 
//		    	int x2 = (int)Math.random() * 801;
//		    	int y2 = (int)Math.random() * 801;
//		    	q.offer(new Point(x1, y1));
//		    	q.offer(new Point(x2, y2));
//		    	g.drawLine(x1,  y2, x2, y2);
//		    	x1 = x2;
//		    	y1 = y2;
//		    	Thread.sleep(250);
//		    }
//		    g.setColor(Color.BLACK);
//		    while(!q.isEmpty())
//		    {
//		    	Point start = q.poll();
//		    	Point end = q.poll();
//		    	g.drawLine(start.x, start.y, end.x, end.y);
//		    }
//		    
//	    }
	    
	}
	private static Color getRandomColor() {
		Random randomNumber = new Random();
	    return new Color(randomNumber.nextFloat(),
	            randomNumber.nextFloat(), randomNumber.nextFloat());
	}
}
