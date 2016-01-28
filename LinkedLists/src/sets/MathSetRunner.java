//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package sets;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		File file = new File("C:/Users/16jc0080/Downloads/mathsetdata.dat");
		Scanner s = new Scanner(file);
		
		
		while(s.hasNextLine())
		{
			MathSet set = new MathSet(s.nextLine(), s.nextLine());
			System.out.print(set);
			System.out.println("Union: "+set.union());
			System.out.println("intersection: "+set.intersection());
			System.out.println("A minus B " +set.differenceAMinusB());
			System.out.println("B minus A "+set.differenceBMinusA());
			System.out.println("Symmetric difference "+set.symmetricDifference());
			System.out.println();
		}
		
	}
}
