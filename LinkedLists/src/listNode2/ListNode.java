package listNode2;

import listNode.Linkable;

public class ListNode implements Linkable
{
	private Comparable listNodeValue;
	private ListNode nextListNode, previousListNode;

	public ListNode()
	{
		listNodeValue = null;
		nextListNode = null;
	}
	
	//This constructor will often be used as the first in the cyclic nodeList
	public ListNode(Comparable value, ListNode next)
	{
		listNodeValue = value;
		nextListNode = next;
		previousListNode = null;
	}

	public ListNode(Comparable value, ListNode previous, ListNode next)
	{
		listNodeValue=value;
		previousListNode = previous;
		nextListNode=next;
	}
	
	private void HandleCyclic()
	{
		ListNode temp = nextListNode;
		if(previousListNode == null)
			while(nextListNode != null)
				temp = nextListNode.getNext();
		previousListNode = temp;
	}

	public Comparable getValue()
	{
		HandleCyclic();
		return listNodeValue;
	}
	
	public ListNode getPrevious()
	{
		HandleCyclic();
		return previousListNode;
	}

	public ListNode getNext()
	{
		HandleCyclic();
	   return nextListNode;
	}

	public void setValue(Comparable value)
	{
		HandleCyclic();
		listNodeValue = value;
	}

	public void setNext(Linkable next)
	{
		HandleCyclic();
		nextListNode = (ListNode)next;
	}
}