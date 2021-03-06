package listNode;

public class ListNode implements Linkable
{
	private Comparable listNodeValue;
	private ListNode nextListNode, previousListNode;

	public ListNode()
	{
		listNodeValue = null;
		nextListNode = null;
	}

	public ListNode(Comparable value, ListNode next)
	{
		listNodeValue=value;
		nextListNode=next;
	}

	public Comparable getValue()
	{
		return listNodeValue;
	}
	
	public ListNode getPrevious()
	{
		return previousListNode;
	}

	public ListNode getNext()
	{
	   return nextListNode;
	}

	public void setValue(Comparable value)
	{
		listNodeValue = value;
	}

	public void setNext(Linkable next)
	{
		nextListNode = (ListNode)next;
	}
	
	public void setPrevious(ListNode previous)
	{
		previousListNode = previous;
	}
	
	public String toString()	
	{
		if(nextListNode == null)
			return  "This: "+(String)listNodeValue+", "+"Next: null";
		return "This: "+(String)listNodeValue+", "+"Next: "+(String)nextListNode.getValue();
	}
}