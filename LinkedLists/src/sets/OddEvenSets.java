package sets;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds = new TreeSet();
		evens = new TreeSet();
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}

	public void OddEvenSets(String s)
	{
		String[] arr = s.split(" ");
		Set<String> set = new TreeSet<String>(Arrays.asList(arr));
		
		for(String str:set)
		{
			int i = Integer.valueOf(str);
			if(i%2 == 0)
			{
				evens.add(i);
			}
			else
			{
				odds.add(i);
			}
		}
	}
	public void clear()
	{
		odds.clear();
		evens.clear();
	}
}