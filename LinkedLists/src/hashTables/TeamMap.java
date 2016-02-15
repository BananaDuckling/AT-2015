package hashTables;
import java.util.*;
public class TeamMap {
	private HashMap<Integer, String> h;
	public TeamMap()
	{
		h = new HashMap<Integer, String>();
	}
	
	public void add(Wrestler w)
	{
		h.put(w.getWeight(), w.getName());
	}
	
	public void changeWeightGroup(Wrestler w, int group)
	{
		
	}
}
