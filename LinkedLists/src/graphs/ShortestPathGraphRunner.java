package graphs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class ShortestPathGraphRunner {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("H:\\git\\AT-2015\\LinkedLists\\src\\graphs\\graph1.dat"));
		int howManyTimes = Integer.parseInt(file.nextLine());
		for (int x = 0; x < howManyTimes; x++) 
		{
			ShortestPathGraph g = new ShortestPathGraph(" "+file.nextLine());
			ArrayList<String> arr = new ArrayList<String>();
			String check = file.nextLine();
			
			arr.add(check.substring(0, 1));
			g.check(check.substring(0, 1), check.substring(1), arr, 1);
			
			if(g.match())
				System.out.println("["+check.substring(0, 1) + "] connects to "
					+ "["+check.substring(1) + "] in " + (g.shortest()-1) + " steps");
			else
				System.out.println("["+check.substring(0, 1)+"] does not connect to "+
			check.substring(1));	

		}
	}
}
