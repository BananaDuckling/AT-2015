package heaps;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;
import priorityQueue.Monster;

public class YourPQ
{
	private PriorityQueue pq;

	public YourPQ()
	{
		pq = new PriorityQueue();
	}

	public void add(Object obj)
	{
		pq.add(obj);
	}
	
	public Object getMin()
	{
		return pq.peek();
	}
	
	public Object removeMin()
	{
		return pq.poll();
	}
	
	public String getNaturalOrder()
	{
		PriorityQueue temp = new PriorityQueue();
		String output="";
		while(!pq.isEmpty())
		{
			Object o = pq.poll();
			output += o.toString();
			temp.add(o);
		}
		pq = temp;
		return output;		
	}

	//write a toString method
	public String toString()
	{
		String ret = getNaturalOrder();
		return ret;
	}
	
}