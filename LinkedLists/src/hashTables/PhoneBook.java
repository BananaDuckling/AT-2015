package hashTables;
import java.util.*;
import java.io.*;
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
			int temp = i;
			System.out.println("Last name first letter:"+(char)temp);
		}
	}
	public int lookupNumber(String name) 
	{
		
	}
	
	public int getSize()
	{
		int ret = 0;
		for(int i : h.keySet())
		{
			for(PhoneEntry p : h.get(i))
				ret++;
		}
		return ret;
	}
	
	public void load(File f) throws FileNotFoundException
	{
		Scanner k = new Scanner(f);
		while(k.hasNextLine())
		{
			Scanner k1 = new Scanner(k.nextLine());
			PhoneEntry entry = new PhoneEntry(k.next(), Integer.parseInt(k.next()));
		}
	}
	
	public int getNumberNulls()
	{
		int numNulls = 0;
		for(int i : h.keySet())
		{
			if(h.get(i) == null)
				numNulls ++;
		}
		return numNulls;
	}
	
	public int getLongestList()
	{
		int longestSize = 0;
		for(int i : h.keySet())
		{
			if(h.get(i).size() > longestSize)
				longestSize = h.get(i).size();
		}
		return longestSize;
	}
	
	public String lookup(String lookFor)
	{
		for(int i : h.keySet())
		{
			for(PhoneEntry e : h.get(i))
			{
				if(e.getName().equalsIgnoreCase(lookFor))
					return e.getNumber()+"";
			}
				
		}
		return "not found";
	}
	
	public boolean changeNumber(String lookFor, String newNum)
	{
		for(int i : h.keySet())
		{
			for(PhoneEntry e : h.get(i))
			{
				if(e.getName().equalsIgnoreCase(lookFor))
				{
					e.setNumber(Integer.parseInt(newNum));
					return true;
				}
			}
				
		}
		return false;
	}
}

