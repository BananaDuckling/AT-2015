package listNode;
import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   while(list != null)
	   {
		   System.out.println(list.getValue());
		   list = list.getNext();
	   }
   }
	   
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count=0;
		while(list != null)
		{
			count++;
			list = list.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		list.setNext(new ListNode(list.getValue(), list.getNext()));
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		while(list.getNext() != null)
		{
			list = list.getNext();
		}
		list.setNext(new ListNode(list.getValue(), null));
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		ListNode newNext;
		while(list.getNext() != null)
		{
			if(list.getNext().getNext() != null)
			{
				newNext = list.getNext().getNext();
				list.setNext(newNext);
			}
			else
				list.setNext(null);
		}
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		//sets another reference to ListNode list
		ListNode l = list;
		
		int count=1;
		
		while(list.getNext() != null)
		{
			if(count % x == 0)
				l.setValue(value);
			l = l.getNext();
			count++;
		}
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		int count=1;
		ListNode l = list;
		ListNode previous = null;
		
		while(list != null)
		{
			if(count % x == 0)
				previous.setNext(list.getNext());
		}
		previous = list;
		list = list.getNext();
		count++;
	}		
}