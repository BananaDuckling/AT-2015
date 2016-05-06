//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -
package graphs;

import java.util.*;

import static java.lang.System.*;

public class ShortestPathGraph {
	private TreeMap<String, HashSet<String>> map;
	private boolean yesOrNo = false;
	private int shortest = 0;

	public ShortestPathGraph(String line) 
	{
		map = new TreeMap<String, HashSet<String>>();
		String[] inputString = line.split(" ");
		
		for (int x = 1; x < inputString.length; x++) {
			if (map.containsKey(inputString[x].substring(0, 1))) {
				HashSet<String> t = map.get(inputString[x].substring(0, 1));
				t.add(inputString[x].substring(1));
				map.put(inputString[x].substring(0, 1), t);
			} 
			else 
			{
				HashSet<String> t = new HashSet<String>();
				t.add(inputString[x].substring(1));
				map.put(inputString[x].substring(0, 1), t);
			}

			if (map.containsKey(inputString[x].substring(1))) {
				HashSet<String> t = map.get(inputString[x].substring(1));
				t.add(inputString[x].substring(0, 1));
				map.put(inputString[x].substring(1), t);
			} 
			else 
			{
				HashSet<String> t = new HashSet<String>();
				t.add(inputString[x].substring(0, 1));
				map.put(inputString[x].substring(1), t);
			}
		}
	}

	public boolean contains(String letter) {
		return map.containsKey(letter);
	}
	
	public boolean match()
	{
		return yesOrNo;
	}
	public int shortest()
	{
		return shortest;
	}

	public void check(String first, String second, ArrayList<String> been, int steps) {
			if (map.get(first).contains(second)) 
			{
				yesOrNo = true;
				if (shortest == 0 || steps <= shortest)
					shortest = steps;
			} 
			else 
			{
				HashSet<String> set = map.get(first);
				for (String x : set){
					//this is here so we can perform calcs without affecting recursion
					boolean haveToReadd = false;
					if (!been.contains(x)) {
						haveToReadd = true;
						been.add(x);
						check(x, second, been, steps + 1);
					}
					if(haveToReadd)
						been.remove(x);
				}
			}
	}
}