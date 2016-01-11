//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -
package priorityQueue;
import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class MonsterPQ  
{
	private Queue<Monster> q;

	public MonsterPQ()
	{
		q = new PriorityQueue<Monster>();
	}

	public void add(Monster obj)
	{
		q.offer(obj);
	}
	
	public Object getMin()
	{
		return q.peek();
	}
	
	public Object removeMin()
	{
		return q.poll();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!q.isEmpty())
		{
			output += q.poll().toString();
		}
		return output;		
	}

	//write a toString method
}