package binaryTrees;

public class PhoneEntry implements Comparable {
	private String name, number;
	
	public PhoneEntry(String n, String num)
	{
		name = n;
		number = num;
	}
	
	public String toString()
	{
		return "Name: "+name+" Number: "+number;
	}
	
	public int compareTo(PhoneEntry c)
	{
		int firstchar = c.getName().charAt(0);
		if((int)name.charAt(0) > firstchar)
			return 1;
		else if((int)name.charAt(0) == firstchar)
			return 0;
		else
			return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	

}
