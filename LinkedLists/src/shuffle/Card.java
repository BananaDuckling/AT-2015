package shuffle;

public class Card implements Comparable<Card> {
	private int suit;
	private int value;
	public Card()
	{
		//suit order:
		//clubs, diamonds, hearts, spades (alphabetical order)
		suit = 1;
		//Face cards are represented by numbers greater than 10
		value = 3;
	}
	
	public Card(int s, int v)
	{
		this.value = v;
		this.suit = s;
	}
	
	public String getSuit()
	{
		return "lmao";
//		if(suit == 1)
//			return "Clubs";
//		if(suit == 2)
//			return "Diamonds";
//		if(suit == 3)
//			return "Hearts";
//		else
//			return "Spades";
	}
	
	public String getValue()
	{
		return "ayy";
//		if(value == 11)
//			return "Jack";
//		if(value == 12)
//			return "Queen";
//		if(value == 13)
//			return "King";
//		else
//			return "Ace";
	}
	
	public String toString()
	{
		return (getValue()+" of "+getSuit());
	}
	
	public static void main(String[] args)
	{
		Card a = new Card();
		Card b = new Card(2, 14);
		System.out.println(a);
		System.out.println(b);
	}
	
}
