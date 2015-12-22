package queues;
import java.util.ArrayList;
public class myQueue {
	public static void main(String[] args){
		myQueue tc = new myQueue ();
		System.out.println(tc.offer("quarter"));
		System.out.println(tc.offer("dime"));
		System.out.println(tc.offer("nickel"));
		System.out.println(tc.offer("penny"));
		System.out.println( "toString():" + tc);
		System.out.println( "peek" + tc.peek());
		System.out.println("search for dime "+ tc.search("dime"));
		System.out.println( "search for euro "+ tc.search("euro"));
		System.out.println("size "+tc.size());
		System.out.println("poll() and isEmpty()");
		while (!tc.isEmpty())

		System.out.println(tc.poll());
	}
	
	private ArrayList<String> a = new ArrayList<String>();
	public Object offer(Object item)
	{
		a.add((String)item);
		return item;
	}
	
	public Object poll()
	{
		Object o = a.get(0);
		a.remove(0);
		return o;
	}
	
	public Object peek()
	{
		return a.get(0);
	}
	
	public boolean isEmpty()
	{
		return a.size() == 0;
	}
	
	public int size()
	{
		return a.size();
	}
	
	public int search(Object o)
	{
		for(int x = 0; x < a.size(); x++)
		{
			if(a.get(x).equals(o))
				return x+1;
		}
		return -1;
	}
	
	public String toString()
	{
		String s = "";
		for(Object o : a)
			s += o+" ";
		return s;
	}
}

