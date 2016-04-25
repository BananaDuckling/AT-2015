package graphs;
//Name -
//Date -
//Class -
//Lab  -  

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Graph g = new Graph();
		Scanner file = new Scanner(new File("graph.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			String check = g.nextLine();
			if(g.check(check.substring(0,1), check.substring(1), placesUsed);)
		}
	}
}