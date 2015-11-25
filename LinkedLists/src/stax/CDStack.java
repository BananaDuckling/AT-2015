package stax;
import java.util.Iterator;
import java.util.Stack;
public class CDStack {
	Stack<String> myStack;
	
	public CDStack()
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
	public void printCd()
	{
		CDStack stack = new CDStack();
		while(stack.isEmpty())
		{
			System.out.println(stack.playNextCd());
		}
	}
	
	public static void main(String[] args)
	{
		
	}
}
