//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;
import priorityQueue.Monster;

public class YourPQ
{
	private BinaryHeap h;

	public YourPQ()
	{
		h = new BinaryHeap();
	}

	public void add(Object obj)
	{
		h.add(obj);
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
		String output="";
		while(!pq.isEmpty())
		{
			output += pq.poll().toString();
		}
		return output;		
	}

	//write a toString method
	public String toString()
	{
		String ret = getNaturalOrder();
		return ret;
	}
	
}