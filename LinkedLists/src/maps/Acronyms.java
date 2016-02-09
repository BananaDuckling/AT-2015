package maps;
import java.util.*;
public class Acronyms
{
	public Map<String,String> acronymTable;

	public Acronyms()
	{
		acronymTable = new TreeMap<String, String>();
	}

	public void putEntry(String entry)
	{
		String[] equivalents = entry.split(" - ");
		acronymTable.put(equivalents[0], equivalents[1]);
	}

	public String convert(String sent)
	{
		String[] arr = sent.split(" ");
		int i = arr.length;
		String output ="";
		
		for(int x = 0; x < i; x++)
		{
			String s = arr[x];
			if(acronymTable.get(arr[x])== null)
				output += arr[x]+" ";
			else
				output += acronymTable.get(arr[x])+" ";
		}
		return output;

	}

	public String toString()
	{
		return "";
	}
}