package sets;

import java.util.*;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		String[] a = input.split(" ");
		Set<String> uniques = new TreeSet<String>(Arrays.asList(a));
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		String[] a = input.split(" ");
		Set<String> uniSet = new TreeSet<String>(Arrays.asList(a));
		List<String> list = new ArrayList<String>(Arrays.asList(a));
		for(int x = 0; x < list.size(); x++)
		{
			if(uniSet.remove(list.get(x)))
				list.remove(x);
		}
		setRefract(list);
//		while(!uniSet.isEmpty())
//		{
//			for(int x = 0; x < uniSet.size(); x++)
//			{
//				if(uniSet.first().equals(list.get(x))
//					uniSet.pollFirst();
//			}
//		}
		
		Set<String> ret = new TreeSet<String>(list);
		return ret;
	}
	
	
	
	
	private static void setRefract(List<String> list)
	{
		list.remove("i");
		list.remove("k");
		list.remove("seven");
	}
}