package queues;

public class CircularArrayQueue
{
	private int head, tail, size;
	public int[] elements;
	public static void main(String[] args) {

		 CircularArrayQueue a = new CircularArrayQueue(10);
		 
		 a.add(1);

		 a.add(2);

		 a.add(3);

		 a.add(4);

		 a.add(5);

		 a.add(6);

		 a.add(7);

		 a.add(8);

		 a.add(9);

		 System.out.println(a);

		 System.out.println("NEXT: " +a.remove());

		 System.out.println("NEXT: "+a.remove());

		 System.out.println("NEXT: "+a.remove());

		 System.out.println(a);

		 a.add(10);

		 System.out.println(a);

		 a.add(11);

		 System.out.println(a);

		 a.add(12);

		 System.out.println(a);

		 System.out.println("NEXT: "+a.remove());

		 System.out.println(a);

		 a.add(13);

		 System.out.println(a);

		 a.add(14);

		 System.out.println(a);

		 a.add(15);

		 System.out.println(a);

		 System.out.println("NEXT: "+a.remove());

		System.out.println(a);

		 }
	public CircularArrayQueue(int capacity)
	{
		elements = new int[capacity];
		size = capacity;
		head = 0;
		tail = 0;
	}
	
	public int headIndex()
	{
		return head;
	}
	
	public int tailIndex()
	{
		return tail;
	}
	
	public void add(int o)
	{
		if(tail == size)
			tail = 0;
		if(elements[tail] != 0)
			enlarge();
		
		elements[tail++] = o;
	}
	
	public int remove()
	{
		if(head == tail)
			return 0;
		if(head == size)
			head = 0;
		int temp = elements[head];
		elements[head++] = 0;
		return temp;
	}
	
	private void enlarge()
	{
		int[] temp = new int[size*2];
		int counter = 0;
		for(int x = head; x < elements.length; x++)
		{
			temp[counter] = elements[x];
			counter++;
		}
		for(int x = 0; x < tail; x++)
		{
			temp[counter] = elements[x];
			counter++;
		}
		
		elements = temp;
	}
	
	public String toString()
	{
		String s = "";
		for(int x = 0; x < elements.length; x++)
		{
			if(elements[x] != 0)
				s += "["+elements[x]+"]" + "\n";
		}
		return s;
	}
	
	public int size()
	{
		return size;
	}
	
}
