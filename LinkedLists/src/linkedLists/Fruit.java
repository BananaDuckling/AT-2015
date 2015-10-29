package linkedLists;
import java.util.LinkedList;
import java.util.Iterator;

public class Fruit {

	LinkedList<String> bowl;
	Iterator iter;
	public Fruit()
	{
		//bowl = new LinkedList();
		bowl = new LinkedList<String>();
		bowl. addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		bowl.addLast("orange");
		bowl.addLast("papaya");
		bowl.addLast("strawberry");
		bowl.addLast("watermelon");
		
		iter = bowl.iterator();
	}
	
	public void printFruits()
	{
		while(iter.hasNext())
		{
			System.out.println(iter.next());
			if(iter.hasNext())
				iter.next();
		}
	}
	public static void main(String[] args)
	{
		Fruit f = new Fruit();
		f.printFruits();
	}

}
