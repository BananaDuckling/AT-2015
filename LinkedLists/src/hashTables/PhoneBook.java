package hashTables;
import java.util.*;
public class PhoneBook {
	
	private int numSlots;
	private Hashtable<Integer, LinkedList<PhoneEntry>> h;
	public PhoneBook()
	{
		h = new Hashtable<Integer, LinkedList<PhoneEntry>>();
	}
	
	public PhoneBook(int numSlots)
	{
		this.numSlots = numSlots;
	}
	
	public void add(Object o)
	{
		try {
			if(h.containsKey(o.hashCode()))
				h.get(o.hashCode()).add((PhoneEntry)o);
			else
			{
				LinkedList l = new LinkedList<PhoneEntry>();
				l.add((PhoneEntry) o);
				h.put(o.hashCode(), l);
			}
		} catch (ClassCastException e) {
			System.out.println("lol u can't enter an object of that type");
		}		
	}
	
	public void display()
	{
		for(Integer i :h.keySet())
		{
			System.out.println("Last name first letter:"+h.get);
		}
	}
	
	public int getCapacity()
	{
		
	}
	
	public int getSize()
	{
		
	}
	
	public void load()
	{
		
	}
	
	public int getNumberNulls()
	{
		
	}
	
	public int getLongestList()
	{
		
	}
	
	public String lookup(String lookFor)
	{
		
	}
	
	public boolean changeNumber(String lookFor, String newNum)
	{
		
	}
}

