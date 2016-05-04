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

public class ShortestPathGraph {
	private TreeMap<String, HashSet<String>> map;
	boolean match = false;
	int shortest = 0;

	public ShortestPathGraph(String line) {
		map = new TreeMap<String, HashSet<String>>();
		String[] a = line.split(" ");
		for (int i = 1; i < a.length; i++) {
			if (map.containsKey(a[i].substring(0, 1))) {
				HashSet<String> t = map.get(a[i].substring(0, 1));
				t.add(a[i].substring(1));
				map.put(a[i].substring(0, 1), t);
			} else {
				HashSet<String> t = new HashSet<String>();
				t.add(a[i].substring(1));
				map.put(a[i].substring(0, 1), t);
			}

			if (map.containsKey(a[i].substring(1))) {
				HashSet<String> t = map.get(a[i].substring(1));
				t.add(a[i].substring(0, 1));
				map.put(a[i].substring(1), t);
			} else {
				HashSet<String> t = new HashSet<String>();
				t.add(a[i].substring(0, 1));
				map.put(a[i].substring(1), t);
			}
		}
	}

	public boolean contains(String letter) {
		return map.containsKey(letter);
	}

	public void check(String one, String two, ArrayList<String> been, int steps) {
			if (map.get(one).contains(two)) {
				match = true;
				if (shortest == 0 || steps <= shortest)
					shortest = steps;
			} else {
				HashSet<String> set = map.get(one);
				for (String x : set){
					boolean add = false;
					if (!been.contains(x)) {
						add = true;
						been.add(x);
						check(x, two, been, steps + 1);
					}
					if(add)
						been.remove(x);
				}
			}
	}
	public boolean match()
	{
		return match;
	}
	
	public int steps()
	{
		return shortest;
	}

	public String toString() {
		return "";
	}
}
//public class ShortestPathGraph
//{
//	private TreeMap<String, HashSet<String>> map;
//	private boolean yesOrNo = false;
//	private int shortest = 1;
//
//	public ShortestPathGraph(String line)
//	{
//		String[] input = line.split(" ");
//		map = new TreeMap<String, HashSet<String>>();
//		for(String s : input)
//		{
//			String firstLetter = s.substring(0,1);
//			String secondLetter = s.substring(1,2);
//			
//			if(!map.containsKey(firstLetter))
//			{
//				HashSet<String> newSet = new HashSet<String>();
//				newSet.add(secondLetter);
//				map.put(firstLetter,newSet);
//			}
//			else
//				map.get(firstLetter).add(secondLetter);
//			if(!map.containsKey(secondLetter))
//			{
//				HashSet<String> newSet = new HashSet<String>();
//				newSet.add(firstLetter);
//				map.put(secondLetter,newSet);
//			}
//			else
//				map.get(secondLetter).add(firstLetter);
//		}
//	}
//
//	public boolean contains(String letter)
//	{
//		return map.containsKey(letter);
//	}
//	
//	public boolean match()
//	{
//		return yesOrNo;
//	}
//
//	public void check(String first, String second, ArrayList<String> been, int steps)
//	{
//		if (!yesOrNo) 
//		{
//			if (map.get(first).contains(second))
//			{
//				yesOrNo = true;
//				if(steps < shortest)
//					shortest = steps;
//			}
//			else 
//			{
//				HashSet<String> set = map.get(first);
//				for (String s : set) 
//				{
//					boolean haveToAdd = false;
//					if (!been.contains(s)) 
//					{
//						haveToAdd = true;
//						been.add(s);
//						check(s, second, been, steps +1);
//					}
//					if(haveToAdd)
//						set.remove(s);
//				}
//			}
//		}
//	}
//	 public int steps()
//	 {
//		 return shortest;
//	 }
//
//	public String toString()
//	{
//		return "";
//	}
//}