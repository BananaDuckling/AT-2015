package maps;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Relatives r = new Relatives();
		File file = new File("C:/Users/16jc0080/Downloads/relatives.dat");
		Scanner k = new Scanner(file);
		
		while(k.hasNextLine())
		{
			r.setPersonRelative(k.nextLine());
		}
		System.out.println(r);
	}
}