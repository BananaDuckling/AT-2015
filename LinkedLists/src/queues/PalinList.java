// PalinLins.java
package queues;

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
	private String[] s;

	public PalinList()
	{
		setList("");
		s = new String[1];
	}

	public PalinList(String list)
	{
		queue = new LinkedList();
		stack = new Stack();
		setList(list);
	}

	public void setList(String list)
	{
		s = list.split(" ");
		for(int x = 0; x < s.length; x++)
		{
			queue.offer(String.valueOf(s[x]));
			stack.push(String.valueOf(s[x]));
		}
	}

	public boolean isPalin()
	{
		boolean isPalin = true;
		while(!queue.isEmpty())
		{
			if(!queue.poll().equals(stack.pop()))
				isPalin = false;
		}
		return isPalin;
	}

	public String toString()
	{
		String ret = "";
		for(int x = 0; x < s.length; x++)
		{
			ret += s[x] + " "; 
		}
		return ret;
	}
	//write a toString method
}