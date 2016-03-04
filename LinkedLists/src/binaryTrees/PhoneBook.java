package binaryTrees;
import java.util.*;
public class PhoneBook {
	private BinarySearchTree t;
	public PhoneBook(PhoneEntry e)
	{
		t.add(e);
	}
	
	public PhoneBook()
	{
		t = null;
	}
	
	public void add(PhoneEntry e)
	{
		t.add(e);
	}
	
	public void display()
	{
		t.inOrder();
	}

}
