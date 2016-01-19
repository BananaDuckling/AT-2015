package sets;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		File file = new File("C:/Users/16jc0080/Downloads/oddevendata.DAT");
		Scanner s = new Scanner(file);
		String str = "";
		
		while(s.hasNextLine())
			OddEvenSets.somemethod();
		System.out.println(str);
	}
}