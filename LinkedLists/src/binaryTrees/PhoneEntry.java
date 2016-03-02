package binaryTrees;

public class PhoneEntry {
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
}
