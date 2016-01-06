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
			g.setColor(Color.WHITE);
			int x1 = (int) (Math.random() * (801));
			int y1 = (int) (Math.random() * (801));
			Queue<Point> lines = new LinkedList<Point>();
			
			for (int ii = 0; ii < 10; ii++) {
				g.setColor(Color.BLACK);
				int x2 = (int) (Math.random() * (801));
				int y2 = (int) (Math.random() * (801));
				lines.offer(new Point(x1, y1));
				lines.offer(new Point(x2, y2));
				g.drawLine(x1, y1, x2, y2);
				x1 = x2;
				y1 = y2;
				Thread.sleep(500);
			}

			g.setColor(Color.WHITE);
			while (!lines.isEmpty()) {
				Point start = lines.poll();
				Point end = lines.poll();
				g.drawLine(start.x, start.y, end.x, end.y);
				Thread.sleep(500);
			}
			}
	}
}
