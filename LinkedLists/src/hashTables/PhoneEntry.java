package hashTables;

public class PhoneEntry {
	private String name;
	private int number;
	
	public PhoneEntry(String name, int number)
	{
		this.name = name;
		this.number = number;
	}
	
	public int hashCode()
	{
		char ret = name.charAt(0);
		return (int)ret;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}	
