//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -  
package listNode2;
import static java.lang.System.*;
import listNode2.ListNode;

public class ListFunHouseTwo
{
	private ListNode theList = null;
	
	public void add(Comparable data)
	{
		
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		ListNode list = theList;
		int count=0;
		while(theList != null)
		{
			count++;
			list = list.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode list = theList;
		list.setNext(new ListNode(list.getValue(), list.getNext()));
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode list = theList;
		while(list.getNext() != null )
		{
			list = list.getNext();
		}
		list.setNext(new ListNode(list.getValue(), null));
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{



	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{



	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{


	
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	String output="";




   	return output;
   }			
	
}