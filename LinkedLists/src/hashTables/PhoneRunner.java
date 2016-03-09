package hashTables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PhoneRunner {
	public static void main(String[] args)throws FileNotFoundException
	{
		PhoneBook book = new PhoneBook();
		File file = new File("C:/Users/16jc0080/Downloads/phone.txt");
		Scanner k = new Scanner(file);
		while(k.hasNextLine())
		{
			String name = k.next();
			int number = Integer.valueOf(k.next());
			book.add(new PhoneEntry(name, number));
		}
		System.out.println("hi");
		book.display();
	}
}
