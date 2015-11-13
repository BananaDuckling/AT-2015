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
			front = new HistoNode(l, 0, null);
		HistoNode temp = front;
		while(temp.getNext() != null){
			if(temp.getLetter() == l){
				temp.setLetterCount(temp.getLetterCount() + 1);
				return;
			}
			else
				temp = temp.getNext();
		}
		if(temp.getLetter() == l)
			temp.setLetterCount(temp.getLetterCount() + 1);
		else
		temp.setNext(new HistoNode(l, 1, null));
	}

	//returns the index position of let in the list if let exists
	public int indexOf(char let)
	{
		int pos = 0;
		HistoNode temp = front;
		while(temp != null)
		{
			if(temp.getLetter() == let)
				return pos;
			temp = temp.getNext();
			pos++;
		}
		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		int i = 0;
		HistoNode temp = front;
		
		if(spot == 0)
			return front;
		
		while(temp.getNext() != null)
		{
			if(spot == i)
				return temp;
			temp = temp.getNext();
			i++;
		}
	}

	//returns a string will all values from list
	public String toString()
	{
		String output = "";
		HistoNode temp = front;
		
		while(temp !=  null)
		{
			output += temp.getLetter()+": "+temp.getLetterCount()+"\t";
			temp = temp.getNext();
		}
		return output;
	}
}