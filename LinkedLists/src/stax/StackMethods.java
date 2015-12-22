package stax;

import java.util.Stack;
import java.util.ArrayList;

public class StackMethods
{
	public static void main(String[] args)
	{

		Stack<Integer> a = new Stack<Integer>();
		a.push(5);
		a.push(2);
		a.push(7);
		Stack<String> b = new Stack<String>();
		b.push("one");
		b.push("two");
		Stack<String> c = new Stack<String>();
		c.push("three");
		c.push("four");
		c.push("five");
		display(alternateStack(b, c));

		System.out.println();

		Stack<String> d = new Stack<String>();
		d.push("six");
		d.push("seven");
		d.push("eight");
		d.push("nine");
		d.push("ten");

		display(removeEveryOther(d));
	}

	public static double getAverage(Stack<Integer> one)
	{
		int count = 0;
		double ret = 0;
		while (!one.isEmpty()) {
			ret += one.pop();
			count++;
		}
		return ret / count;
	}

	public static Stack<String> alternateStack(Stack<String> one, Stack<String> two)
	{
		int maxSize = one.size() + two.size(), count = 0;
		Stack ret = new Stack();
		while(!one.isEmpty() || !two.isEmpty()) //while both are not empty
		{
			if(count % 2 == 0)//even number
			{
				count ++;
				if(!one.isEmpty())
					ret.push(one.pop());
			}
			else //count is odd number
			{
				count --;
				if(!two.isEmpty())
					ret.push(two.pop());
			}
		}

		return ret;
	}

	public static Stack<String> removeEveryOther(Stack<String> one)
	{
		Stack ret = new Stack(), temp = new Stack();
		int count = 0;
		
		while (!one.isEmpty()) {
			if (count % 2 == 0) //if count is even
			{
				count++;
				temp.push(one.pop());
			} 
			else //count is odd
			{
				count++;
				one.pop();
			}
		}
		while(!temp.isEmpty())
		{
			ret.push(temp.pop());
		}
		return ret;
	}

	public static void display(Stack<String> one)
	{
		while (!one.isEmpty()) {
			System.out.println(one.pop());

		}
	}
}
