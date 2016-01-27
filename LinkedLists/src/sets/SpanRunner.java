
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		File file = new File("C:/Users/16jc0080/Downloads/spantoeng.dat");
		Scanner s = new Scanner(file);
		SpanishToEnglish juan = new SpanishToEnglish();
		for(int x = 0; x < 46; x++)
		{
			juan.putEntry(s.nextLine());
		}
		
		while(s.hasNext())
		{
			//this is the last part of the dat file, the actual paragraphs to be translated
			juan.translate();
		}
	}
}