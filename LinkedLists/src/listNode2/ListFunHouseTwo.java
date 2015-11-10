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
	
	//this method will return a String containing the entire list
	public String toString()
	{
		String output="";
		ListNode temp = theList;
		
		while(temp.getNext() != theList)
		{
			output += temp.getValue()+", ";
			temp = temp.getNext();
		}
		return output;
  	}		
	   
	public void add(Comparable data)
	{
		if(theList == null)
		{
			theList = new ListNode(data, null);
			theList.setNext(theList);
		}
		else
		{
			ListNode first = theList, last = theList;
			
			theList = theList.getNext();
			while(theList != first)
			{
				last = theList;
				theList = theList.getNext();
			}
			last.setNext(new ListNode(data, first));
		}
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		ListNode temp = theList;
		int count=1;
		
		while(theList != temp.getNext())
		{
			count++;
			temp = temp.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		theList.setNext(new ListNode(theList.getValue(), theList.getNext()));
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode first = theList, last = theList;
		first = first.getNext();
		while(first != theList)
		{
			last = first;
			first = first.getNext();
		}
		last.setNext(new ListNode(last.getValue(), theList));
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
		removeXthNode(2);
	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		int count = 0;
		ListNode temp = theList.getNext();
		while(temp != theList)
		{
			if(count %x == 0)
				temp.setValue(value);
			temp = temp.getNext();
			count++;
		}

	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		int count = 0;
		ListNode temp = theList.getNext();
		ListNode previous = null;
		while(temp != theList)
		{
			if(count == x)
				previous.setNext(temp.getNext());
			previous = temp;
			temp = temp.getNext();
			count++;
		}
	}			
	
}