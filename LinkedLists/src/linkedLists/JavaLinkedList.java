package linkedLists;
import java.util.LinkedList;
import static java.lang.System.*;
import java.util.ListIterator;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		for(int num : list)
			total += num;
		return total;
	}

	public double getAvg(  )
	{
		int numTerms = 0;
		double d = this.getSum();
		for(int num : list)
			numTerms++;
		return d/numTerms;
	}

	public int getLargest()
	{
		ListIterator iter = list.listIterator();
		int largest = (int)iter.next();
		while(iter.hasNext())
		{
			int previous = (int)iter.previous();
			iter.next();
			int next = (int)iter.next();
			if(next > previous)
				largest = next;
		}
		return largest;
	}

	public int getSmallest()
	{
		ListIterator iter = list.listIterator();
		int smallest = (int)iter.next();
		while(iter.hasNext())
		{
			int previous = (int)iter.previous();
			iter.next();
			int next = (int)iter.next();
			if(next < previous)
				smallest = next;
		}
		return smallest;
	}

	public String toString()
	{
		String output="";
		output += "SUM: "+getSum()+
				"\nAVERAGE: "+getAvg()+
				"\nSMALLEST: "+getSmallest()+
				"\nLARGEST: "+getLargest();
		return output;
	}
}