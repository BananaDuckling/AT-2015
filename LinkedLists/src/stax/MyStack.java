package stax;
import java.util.ArrayList;
import java.util.Stack;
public class MyStack {
	public static void main(String[] args)
	{
		MyStack tc = new MyStack();
		System.out.println(tc.push("quarter"));
		System.out.println(tc.push("dime"));
		System.out.println(tc.push("nickel"));
		System.out.println(tc.push("penny"));
		System.out.println( "toString() " + tc);
		System.out.println( "peek() " + tc.peek());
		System.out.println( "search for dime " + tc.search("dime"));
		System.out.println( "search for euro " + tc.search("euro"));
		System.out.println( "Size " + tc.size());
		System.out.println("pop() and isEmpty()");
		while (!tc.isEmpty())
			System.out.println(tc.pop());
	}
	
	private ArrayList<Object> list = new ArrayList<Object>();
	
	public Object push(Object item)
	{
		list.add(item);
		return item;
	}
	public Object pop()
	{
		Object o = list.get(list.size()-1);
		list.remove(list.size()-1);
		return o;
	}
	
	public Object peek()
	{
		return list.get(list.size()-1);
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public int size()
	{
		return list.size();
	}
	
	public int search(Object o)
	{
		for(int x = 0; x < list.size() ; x ++)
		{
			if(o.equals(list.get(x)))
				return list.size() - x;
		}
		return -1;
	}
	
	public String toString()
	{
		String s = "";
		for(Object o : list)
			s += o+" ";
		return s;
	}
}
