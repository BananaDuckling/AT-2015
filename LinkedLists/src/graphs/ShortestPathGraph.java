//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -
package graphs;
import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.*;

public class ShortestPathGraph
{
	private TreeMap<String, Set<String>> map;
	private boolean yesOrNo = false;
	private int shortest = 1;

	public ShortestPathGraph(String line)
	{
		String[] input = line.split(" ");
		map = new TreeMap<String, Set<String>>();
		for(String s : input)
		{
			String firstLetter = s.substring(0,1);
			String secondLetter = s.substring(1,2);
			
			if(!map.containsKey(firstLetter))
			{
				Set<String> newSet = new TreeSet<String>();
				newSet.add(secondLetter);
				map.put(firstLetter,newSet);
			}
			else
				map.get(firstLetter).add(secondLetter);
			if(!map.containsKey(secondLetter))
			{
				Set<String> newSet = new TreeSet<String>();
				newSet.add(firstLetter);
				map.put(secondLetter,newSet);
			}
			else
				map.get(secondLetter).add(firstLetter);
		}
	}

	public boolean contains(String letter)
	{
		return map.containsKey(letter);
	}

	public void check(String first, String second, ArrayList<String> been, int steps)
	{
		if (!yesOrNo) 
		{
			if (map.get(first).contains(second))
			{
				yesOrNo = true;
				if(steps < shortest)
					shortest = steps;
			}
			else 
			{
				Set<String> set = map.get(first);
				for (String s : set) 
				{
					boolean haveToAdd = false;
					if (!been.contains(s)) 
					{
						haveToAdd = true;
						been.add(s);
						check(s, second, been, steps +1);
					}
					if(haveToAdd)
						set.remove(s);
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}