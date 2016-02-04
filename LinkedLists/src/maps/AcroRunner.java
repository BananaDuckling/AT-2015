package maps;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		Acronyms a = new Acronyms();
		File file = new File("C:/Users/16jc0080/Downloads/acro.dat");
		Scanner k = new Scanner(file);
		
		for(int x = 0; x < 8; x++)
		{
			a.putEntry(k.nextLine());
		}
		
		while(k.hasNextLine())
		{
			a.convert(k.nextLine());
		}
	}
}