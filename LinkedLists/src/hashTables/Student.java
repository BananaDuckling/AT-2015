package hashTables;

public class Student implements Comparable {
	private String first, last, id;
	
	public Student(String f, String l, String id)
	{
		first = f;
		last = l;
		this.id = id;
	}
	public int hashCode()
	{
		final int HASH_MULTIPLIER = 29;
		int h1 = first.hashCode();
		int h2 = new Integer(id).hashCode();
		int h = HASH_MULTIPLIER * (h1+h2);
		return h;
	}

	public int compareTo(Object o)
	{
		Student temp = (Student)o;
		if(last.compareTo(temp.getLast()) == 0)
			return first.compareTo(temp.getFirst());
		else
			return last.compareTo(temp.getLast());
	}
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
