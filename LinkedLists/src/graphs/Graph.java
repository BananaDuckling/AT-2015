package graphs;
//Name -
//Date -
//Class -  
//Lab  -

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;

public class Graph
{
	private TreeMap<String, Set<String>> map;
	private boolean yesOrNo = false;
	public Graph(String line)
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
	public boolean match()
	{
		return yesOrNo;
	}
	public boolean contains(String letter)
	{
		return map.containsKey(letter);
	}
	public void check(String firstLetter, String secondLetter, ArrayList<String> been) 
	{
		if (!yesOrNo) 
		{
			if (map.get(firstLetter).contains(secondLetter))
				yesOrNo = true;
			else 
			{
				Set<String> set = map.get(firstLetter);
				for (String s : set) 
				{
					if (!been.contains(s)) 
					{
						been.add(s);
						check(s, secondLetter, been);
					}
				}
			}
		}
	}
	public String toString()
	{
		String ret = "";
		for(Map.Entry<String,Set<String>> entry : map.entrySet())
		{
			ret += entry.getKey()+":[ ";
			for(String s : map.get(entry.getKey()))
			{
				ret += s + " ";
			}
			ret += "]\n";
		}
		return ret;
	}
}