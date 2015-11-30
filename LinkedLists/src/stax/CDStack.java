package stax;
import java.util.Iterator;
import java.util.Stack;
public class CDStack {
	Stack<String> myStack;
	
	public CDStack()
	{
		initialize();
	}
	private void initialize()
	{
		myStack = new Stack<String>();
		myStack.push("Journey");
		myStack.push("Iggy pop");
		myStack.push("Hall and Oates");
		myStack.push("Genesis");
		myStack.push("Foreigner");
		myStack.push("Eagles");
		myStack.push("Deep Purple");
		myStack.push("Cheap Trick");
		myStack.push("Beatles");
		myStack.push("Aerosmith");
	}
	
	public String nextCd()
	{
		return myStack.peek();
	}
	
	public String playNextCd()
	{
		return myStack.pop();
	}
	public void printCdManual()
	{
		//method 1
		while(!myStack.empty())
		{
			System.out.println(myStack.pop() + " ");
		}
	}
	public void printCdIterator()
	{
		initialize();
				Iterator<String> i = myStack.iterator();
				while(i.hasNext())
					System.out.println(i.next());
	}
	
	public void printCdForEach()
	{
		initialize();
				for(String s : myStack)
					System.out.println(s);
	}
	
	public void printCdRecursive()
	{
		initialize();
		recur();		
	}
	public void recur()
	{
		if(myStack.empty())
			return;
		else
		{
			System.out.println(myStack.pop());
			recur();
		}
	}
	
	public void reverseStack()
	{
		initialize();
		System.out.println(myStack);
		Stack<String> temp = new Stack();
		while(!myStack.empty())
		{
			temp.push(myStack.pop());
		}
		System.out.println(temp);
	}
	
}
