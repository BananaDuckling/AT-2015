//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
package histoNodes;

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

	public HistoList(HistoNode f)
	{
		front = f;
	}
	
	public HistoList()
	{
		front = null;
	}

	//addLetter will add a new node to the front for l if l does not exist
	//addLetter will bump up the count if l already exists
	public void addLetter(char l)
	{
		if(front == null)
		{
			front = new HistoNode(l, 1, null);
		}
		else
		{
			HistoNode h = front;
			while(front.getNext()  != null)
			{
				h = front.getNext();
				if(h.getLetter() == l)
					h.addLetter();
			}
		}
	}

	//returns the index position of let in the list if let exists
	public int indexOf(char let)
	{









		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current=null;










		return current;
	}

	//returns a string will all values from list
	public String toString()
	{
		String output = "";










		return output;
	}
}