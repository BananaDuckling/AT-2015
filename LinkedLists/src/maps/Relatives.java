package maps;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<String, Set<String>>();
	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		Set<String> temp = new TreeSet<String>();
		temp.add(personRelative[1]);
		if(!map.containsKey(personRelative[0]))
			map.put(personRelative[0], temp);
		else
			map.get(personRelative[0]).add(personRelative[1]);
	}


	public String getRelatives(String person)
	{
		String ret = "";
		Set<String> set = map.get(person);
		for(String s : set)
		{
			ret += s;
		}
		return ret;
	}


	public String toString()
	{
		String output="";
		







		return output;
	}
}