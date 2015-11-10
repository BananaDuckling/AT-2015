package listNode2;

import listNode.Linkable;

public class ListNode
{
	private Comparable listNodeValue;
	private ListNode nextListNode, previousListNode;

	public ListNode(Comparable value, ListNode next)
	{
		listNodeValue=value;
		nextListNode=next;
		
//		if(nextListNode == null)
//			nextListNode = this;
//		while(nextListNode.getNext() != null)
//		{
//			previousListNode = nextListNode.getNext();
//		}
	}

	public Comparable getValue()
	{
		return listNodeValue;
	}

	public ListNode getNext()
	{
	   return nextListNode;
	}
	

	public void setValue(Comparable value)
	{
		listNodeValue = value;
	}

	public void setNext(ListNode next)
	{
		nextListNode = (ListNode)next;
	}
}