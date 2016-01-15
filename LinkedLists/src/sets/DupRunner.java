package sets;

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{
		UniquesDupes u = new UniquesDupes();
		String a = "a b c d e f g h a b c d e f g h i j k";
		String b = "one two three one two three six seven one two";
		String c = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		
		u.getUniques(a);
		u.getDupes(a);
		
		u.getUniques(b);
		u.getDupes(b);
		
		u.getUniques(c);
		u.getDupes(c);
	}
}