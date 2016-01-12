package priorityQueue;
import java.util.*;
public class LiverTransplantQueue {
	private ArrayList a;
	public LiverTransplantQueue()
	{
		a = new ArrayList();
	}
	
	public boolean isEmpty()
	{
		return a.isEmpty();
	}
	
	public void add(Object o)
	{
		 for(int x = 0; x < a.size(); x++)
		 {
			 if(a.get(x).compareTo(o));
		 }
	}
	
	public Object poll()
	{
		
	}
	
	public Object peek()
	{
		
	}
	
	public int size();
	{
		
	}
}
