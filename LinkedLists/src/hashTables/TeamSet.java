package hashTables;
import java.util.*;
public class TeamSet {
	private HashSet<Wrestler> h;
	public TeamSet()
	{
		h = new HashSet<Wrestler>();
	}
	
	public void add(Wrestler w)
	{
		h.add(w);
	}
	
	public void changeWeightGroup(Wrestler w, int group)
	{
		Wrestler temp = new Wrestler(w.getName(), group);
		h.add(temp);
	}
	
	public int get(Wrestler w)
	{
		for(Wrestler check : h)
		{
			if(check.equals(w))
				return check.getWeight();
		}
		return 0;
	}
	
}
