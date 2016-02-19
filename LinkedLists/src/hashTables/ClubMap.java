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
	
	public String toString()
	{
		String ret = "";
		for(Map.Entry<String, TreeSet<Student>> entry : h.entrySet())
		{
			TreeSet<Student> temp = entry.getValue();
			ret += entry.getKey() + " club: \n";
			for(Student stu : temp)
			{
				ret += stu.getFirst() + " "+stu.getLast()+" "+stu.getId()+"\n";
			}
			ret+="\n";
		}
		return ret;
	}
	
	public String toString(String clubName)
	{
		String ret = "";
		for(Map.Entry<String, TreeSet<Student>> entry : h.entrySet())
		{
			if(entry.getKey().equalsIgnoreCase(clubName))
			{
				TreeSet<Student> temp = entry.getValue();
				ret += entry.getKey() + " club: \n";
				for(Student stu : temp)
				{
					ret += stu.getFirst() + " "+stu.getLast()+" "+stu.getId()+"\n";
				}
				ret+="\n";
			}
		}
		return ret;
	}
}
