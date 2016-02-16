package hashTables;
import java.util.*;
public class TeamMap {
	private HashMap<String, Integer> h;
	public TeamMap()
	{
		h = new HashMap<String, Integer>();
	}
	
	public void add(Wrestler w)
	{
		h.put(w.getName(), w.getWeight());
	}
	
	public void changeWeightGroup(Wrestler w, int group)
	{
		h.put(w.getName(), w.getWeight());		
	}
	public int get(Wrestler w)
	{
		return h.get(w.getName());
	}
}
