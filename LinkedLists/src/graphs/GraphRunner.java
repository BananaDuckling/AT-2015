package graphs;
//Name -
//Date -
//Class -
//Lab  -  

import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		
		Scanner file = new Scanner(new File("C:/Users/Justin/git/AT-2015/LinkedLists/src/graphs/graph1.dat"));
		int howManyTimes = Integer.parseInt(file.nextLine());
		for(int x=0; x<howManyTimes; x++)
		{
			Graph g = new Graph(file.nextLine());
			String connections = file.nextLine();
			ArrayList<String> arr = new ArrayList<String>();
			arr.add(connections.substring(0, 1));
			g.check(connections.substring(0, 1), connections.substring(1), arr);
			if(g.match())
				System.out.println(connections.substring(0,1) +" connects to "+ connections.substring(1));
			else
				System.out.println(connections.substring(0,1) +" does not connect to "+ connections.substring(1));
		}
		file.close();
	}
}