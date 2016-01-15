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
		Set<String> uniSet = getUniques(input);
		List<String> list = new ArrayList<String>(Arrays.asList());
		while(!uniSet.isEmpty())
		{
			for(int x = 0; x < uniSet.size(); x++)
			{
				if(uniSet.remove(0).equals(list.get(x)))
					
			}
		}
		
		Set<String> ret = new TreeSet<String>(list);
		
		return ret;
	}
}