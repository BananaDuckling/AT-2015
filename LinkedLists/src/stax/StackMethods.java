package stax;
import java.util.Stack;
import java.util.ArrayList;
public class StackMethods {
	public static void main(String[] args){

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
		             System.out.println("ayy");
		             display(alternateStack(b,c));

		System.out.println();

		Stack<String> d = new Stack<String>(); 
		d.push("six");
		d.push("seven");
		d.push("eight");
		d.push("nine");
		d.push("ten");
		System.out.println("lmao");
		display(removeEveryOther(d));
		}
	public static double getAverage(Stack<Integer> one)
	{
		int count = 0;
		double ret = 0;
		while(!one.isEmpty())
		{
			ret += one.pop();
			count++;
		}
		return ret/count;
	}
	
	public static Stack<String> alternateStack(Stack<String> one, Stack<String> two)
	{
		int maxSize, count = 0;
		Stack ret = new Stack();
		if(one.size() >= two.size())
			maxSize = one.size();
		else
			maxSize = two.size();
		
		for(int x = 0; x < maxSize; x++)
		{
			if(one.isEmpty())
				ret.push(two.pop());
			else if(two.isEmpty())
				ret.push(one.pop());
			else
			{
				if(count / 2 == 0)
				{
					count ++;
					ret.push(one.pop());
				}
				else
				{
					count--;
					ret.push(two.pop());
				}
			}
		}
		return ret;
	}
	
	public static Stack<String> removeEveryOther(Stack<String>one)
	{
		Stack ret = new Stack();
		ArrayList<String> a = new ArrayList<String>();
		int count = 0;
		while(!one.isEmpty())
		{
			if(count / 2 == 0)
			{
				count ++;
				a.add(one.pop());
			}
			else
			{
				count--;
				one.pop();
			}
		}
		for(int x = one.size()-1; x >= 0; x--)
		{
			ret.push(a.get(x));
			System.out.println(a.get(x));
		}
		return ret;
	}
	
	public static void display(Stack<String> one)
	{
		while(!one.isEmpty())
		{
			System.out.println(one.pop());
			
		}
	}
}