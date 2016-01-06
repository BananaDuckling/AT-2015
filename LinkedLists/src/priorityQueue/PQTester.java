//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue = new PriorityQueue();

	public PQTester(String list)
	{
		this.setPQ(list);
	}

	public void setPQ(String list)
	{
		Arrays.stream(list.split(" ")).forEach(pQueue::add);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!pQueue.isEmpty())
		{
			output += pQueue.poll();
		}
		return output;		
	}
	public String toString()
	{
		return pQueue.toString();
	}
}