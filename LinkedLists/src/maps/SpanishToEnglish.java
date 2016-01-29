package maps;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.*;
import static java.lang.System.*;

public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{
		pairs = new TreeMap();
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
		pairs.put(list[0], list[1]);
	}

	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent);
		String[] s = sent.split(" ");
		String output ="";
		
		for(int x = 0; x < s.length; x++)
		{
			output += pairs.get(s[x]);
		}
		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}