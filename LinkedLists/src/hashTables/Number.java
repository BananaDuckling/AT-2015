package hashTables;
public class Number
{
	private int theValue;
	
	public Number(int value)
	{
		theValue = value;
	}	
	
	public int getValue()
	{
		return theValue;
	}
	
	public boolean equals(Number obj)
	{
		return obj.getValue() == theValue;
	} 
	
	public int hashCode()
	{
//		int ret = 0;
//		int temp = theValue;
//		while(temp != 0)
//		{
//			int lastdig = temp % 10;
//			int restnum = temp / 10;
//			if(lastdig % 2 == 0)
//			{
//				if(lastdig >= 5)
//					ret = ret * 10 + 3;
//				else
//					ret = ret * 10+ 2;
//			}
//			else
//			{
//				if(lastdig >= 5)
//					ret = ret * 10 + 1;
//				else
//					ret = ret * 10;
//			}
		return Integer.hashCode(theValue);			
	}

	public String toString()
	{
		return theValue+"";
	}	
}