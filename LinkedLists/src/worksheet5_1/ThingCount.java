//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -   
//Lab  -
package worksheet5_1;

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
	}
	
	public ThingCount(Object thang, int cnt)
	{
		thing = thang;
		count = cnt;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int cnt)
	{
		count = cnt;
	}

	public void setThing(Object obj)
	{
		thing = obj;
	}	
	
	public Object getThing()
	{
		return thing;
	}
	
	public boolean equals(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		return other.getCount() == count;
	}
	
	public int compareTo(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if(count < other.getCount())
			return 1;
		else if(count > other.getCount())
			return -1;
		else
			return 0;
	}
	
	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}