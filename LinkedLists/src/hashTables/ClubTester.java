package hashTables;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class ClubTester {

	public static void main(String[] args) throws FileNotFoundException 
	{
		ClubMap c = new ClubMap();
		File file = new File("C:/Users/16jc0080/Downloads/clubMap.txt");
		Scanner k = new Scanner(file);
		while(k.hasNextLine())
		{
			Scanner s = new Scanner(k.nextLine().trim());
			String l = s.next();
			String f = s.next();
			String id = s.next();
			String club = s.next();
			Student student = new Student(f, l, id);
			c.add(student, club);
		}
		System.out.println(c);
		System.out.println(c.toString("Math"));
	}

}
