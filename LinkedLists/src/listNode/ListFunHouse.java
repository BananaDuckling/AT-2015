package listNode;
import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   while(list.getNext() != null)
	   {
		   System.out.println(list.getValue());
		   list.setNext(list.getNext());
	   }
   }
	   
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count=0;
		while(list.getNext() != null)
		{
			count++;
			//TODO
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		ListNode duplicate = new ListNode(list.getValue(), list.getNext());
		list.setNext(duplicate);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		ListNode prev = list;
		while(list.getNext() != null)
		{
			prev=list.getNext();
		}
		prev.setNext(new ListNode(prev.getValue(), null));
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
		int count=1;
		while(list.getNext() != null)
		{
			if(count == x)
				list.setValue(value);
			count++;
		}
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		int count=1;
	}		
}