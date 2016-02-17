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
			Scanner s = new Scanner(k.nextLine());
			String f = s.next();
			String l = s.next();
			s.next();
			String club = s.next();
			Student student = new Student(f, l, club);
			c.add(s, club);
		}
	}

}
