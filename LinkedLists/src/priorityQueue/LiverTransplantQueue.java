package priorityQueue;
import java.util.*;
public class LiverTransplantQueue {
	private ArrayList<Patient> a;
	public LiverTransplantQueue()
	{
		a = new ArrayList<Patient>();
	}
	
	public boolean isEmpty()
	{
		return a.isEmpty();
	}
	
	public void add(Patient p)
	{
		 for(int x = 0; x < a.size(); x++)
		 {
			 if(a.get(x).compareTo(p)>0);
			 	a.add(x, p);
		 }
	}
	
	public Patient poll()
	{
		return a.remove(0);
	}
	
	public Patient peek()
	{
		return a.get(0);
	}
	
	public int size()
	{
		return a.size();
	}
}
