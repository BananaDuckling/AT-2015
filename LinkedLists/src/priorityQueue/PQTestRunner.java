//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  
package priorityQueue;
import java.util.PriorityQueue;

public class PQTestRunner {
	public static void main ( String[] args )
	{
		PriorityQueue<Integer> pq;
		pq = new PriorityQueue<Integer>();
		pq.add(67);
		pq.add(34);
		pq.add(12);
			
		System.out.println(pq.remove()); //outs 12
		System.out.println(pq.remove()); //outs 34
		System.out.println(pq.remove()); //outs 67	
	}
}