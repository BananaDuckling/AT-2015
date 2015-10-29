package linkedLists;
import java.util.LinkedList;
import java.util.ListIterator;
public class WorksheetProblems {
	
	public static void main (String[] args)
	{
		LinkedList<String> staff = new LinkedList<String>();
		staff.add("A");
		staff.add("B");
		staff.add("D");
		staff.add("F");
		staff.add("L");
		
		//reverseList(staff);
		//duplicate(staff);
		//repeat(staff);
		//delete(staff, "B");
		//insert(staff, "Z");
	}
	
	public static void reverseList(LinkedList<String> staff)
	{
		ListIterator iter = staff.listIterator();
		while(iter.hasNext())
		{
			iter.next();
		}
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
	}
	
	public static void duplicate(LinkedList<String> staff)
	{
		ListIterator iter = staff.listIterator();
		while(iter.hasNext())
		{
			iter.add(iter.next());
		}
		iter = staff.listIterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
	
	public static void repeat(LinkedList<String> staff)
	{
	ListIterator iter = staff.listIterator();
	while(iter.hasNext())
		System.out.println(iter.next());
	iter = staff.listIterator();
	while(iter.hasNext())
		System.out.println(iter.next());
	
	iter = staff.listIterator();
	while(iter.hasNext())
		System.out.println(iter.next());
	}
	
	public static void delete(LinkedList staff, String searchFor)
	{
		ListIterator iter = staff.listIterator();
		while(iter.hasNext())
		{
			String result = (String)iter.next();
			if(result.equalsIgnoreCase(searchFor))
				iter.remove();
		}
			iter = staff.listIterator();
			while(iter.hasNext())
				System.out.println(iter.next());
	}
	
	public static void insert(LinkedList<String> staff, String insertion)
	{
		boolean added = false;
		ListIterator<String> iter = staff.listIterator();
		while(iter.hasNext())
		{
			String result = iter.next();
			if(result.toLowerCase().compareTo(insertion.toLowerCase()) >= 0)
			{
				added = true;
				iter.previous();
				iter.add(insertion);
				break;
			}
		}
		if(!added)
			iter.add(insertion);
		
		iter = staff.listIterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
}
