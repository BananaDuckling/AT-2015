package priorityQueue;

public class Patient
{
	private String name;
	private int priority;
	public Patient(String s, int p)
	{
		name = s;
		priority = p;
	}
	
	public int compareTo(Patient p)
	{
		if(this.priority > p.getPriority())
			return -1;
		else if(this.priority == p.getPriority())
			return 0;
		else
			return 1;
	}
	
	public int getPriority()
	{
		return priority;
	}

	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return name+ " "+priority;
	}
}
