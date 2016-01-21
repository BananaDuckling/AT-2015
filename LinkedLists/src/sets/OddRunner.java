package sets;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		String homeLoc = "C:/Users/Justin/Downloads/oddevendata.dat";
		String schoolLoc = "C:/Users/16jc0080/Downloads/oddevendata.dat";
		File file = new File(schoolLoc);
		Scanner s = new Scanner(file);
		String str = "";
		OddEvenSets o = new OddEvenSets();
		
		while(s.hasNextLine())
		{
			o.OddEvenSets(s.nextLine());
			System.out.println(o);
		}
	}
	
}