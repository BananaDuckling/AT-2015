//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
package histoNodes;

public class HistoNode
{
	private char letter;
	private int letterCount;
	private HistoNode next;

	public HistoNode(char l, int c, HistoNode n)
	{
		letter=l;
		letterCount=c;
		next=n;
	}
	
	public void addLetter()
	{
		letterCount ++;
	}

	public char getLetter()
	{
		return letter;
	}

	public int getLetterCount()
	{
		return letterCount;
	}

	public HistoNode getNext()
	{
	   return next;
	}

	public void setLetter(char let)
	{
		letter=let;
	}

	public void setLetterCount(int cnt)
	{
		letterCount=cnt;
	}

	public void setNext(HistoNode n)
	{
		next = n;
	}
}


