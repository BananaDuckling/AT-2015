//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -  
package sets;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one = new TreeSet();
		two = new TreeSet();
	}

	public MathSet(String o, String t)
	{
		one.add(Integer.valueOf(o));
		two.add(Integer.valueOf(t));
	}

	public Set<Integer> union()
	{
		Set ret = new TreeSet();
		for(Integer i:one)
			ret.add(i);
		for(Integer i:two)
			ret.add(i);
		
		return ret;
	}

	public Set<Integer> intersection()
	{
		Set ret = new TreeSet();
		Set temp = new TreeSet();
		for(Integer i:one)
		{
			if(!temp.add(i))
				ret.add(i);
		}
		for(Integer i:two)
		{
			if(!ret.add(i))
				ret.add(i);
		}
		return ret;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set ret = new TreeSet();
		Set temp = new TreeSet();
		for(Integer i:two)
			temp.add(i);
		for(Integer i:one)
		{
			if(temp.add(i))
				ret.add(i);
		}
		return ret;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set ret = new TreeSet();
		Set temp = new TreeSet();
		for(Integer i:one)
			temp.add(i);
		for(Integer i:two)
		{
			if(temp.add(i))
				ret.add(i);
		}
		return ret;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set ret = new TreeSet();
		ret.addAll(differenceBMinusA());
		ret.addAll(differenceAMinusB());
		return ret;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}