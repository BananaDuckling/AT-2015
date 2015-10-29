package linkedLists;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStart {
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		list.addLast("Priya");
		list.addLast("Dan");
		list.addFirst("Jason");
		list.addFirst("Vishal");
		list.addLast("Teja");
		
		System.out.println(list);
		
		//add method adds new entries to the end
		list.add("Ashay");
		System.out.println(list);
		
		//remove removes the first by default with no parameter
//		System.out.println(list.remove());
//		System.out.println(list);
		
		System.out.println(list.removeLast());
		System.out.println(list);
		
		
		ListIterator<String> iter = list.listIterator();
		iter.add("Koushik");
		System.out.println(list);
		iter.add("viren");
		System.out.println(list);
		iter.add("Aditya");
		
		System.out.println(list);
		
		System.out.println(iter.next());
		System.out.println(iter.previous());
		
		System.out.println();
		
		iter = list.listIterator();
		while(iter.hasNext())
		{
			iter.next();
		}
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
	}
}
