package graphs;
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;

public class Graph
{
	private TreeMap<String, Set<String>> map;
	private boolean yesOrNo;

	public Graph(String line)
	{
		map = new TreeMap<String, Set<String>>();
		String[] input = line.split(" ");
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
	public void check(String first, String second)
	{
		check(first, second, new ArrayList<String>());
	}
	public void check(String one, String two, ArrayList<String> been) {
		if (!match) {
			if (map.get(one).contains(two))
				match = true;
			else {
				HashSet<String> set = map.get(one);
				for (String x : set)
					if (!been.contains(x)) {
						been.add(x);
						check(x, two, been);
					}
			}
		}
	}
	public String toString()
	{
		for(Map.Entry<String,Set<String>> entry : map.entrySet())
		{
			
		}
	}
}