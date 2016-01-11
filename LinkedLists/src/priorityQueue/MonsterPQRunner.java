//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -
package priorityQueue;
import java.util.PriorityQueue;

public class MonsterPQRunner
{
	public static void main(String[] args)
	{
		System.out.println("before removing:\n");
		MonsterPQ q = new MonsterPQ();	
		for(int x = 0; x < 8; x++)
		{
			Monster a = new Monster((int)(Math.random()*5) +1, (int)(Math.random()*5) +1, (int)(Math.random()*5) +1);
			System.out.println(a);
			q.add(a);
		}
		System.out.println("min: \n"+q.getMin());
		System.out.println("min, removing this time:\n"+q.removeMin());
		System.out.println("natural order:\n");
		System.out.println(q.getNaturalOrder());
		
	}
}