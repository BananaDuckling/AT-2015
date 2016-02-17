package hashTables;
import java.util.*;
public class ClubMap 
{
	private Map<String, TreeSet<Student>> h;
	public ClubMap()
	{
		h = new HashMap<String, TreeSet<Student>>();
	}
	
	public void add(Student s, String club)
	{
		if(h.containsKey(club))
			h.get(club).add(s);
		else
		{
			TreeSet t = new TreeSet();
			t.add(s);
			h.put(club, t);
		}
	}
}
