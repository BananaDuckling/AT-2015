package binaryTrees;

public class MorseCode {

	private static final String[] LETTERS = "0_9O. 8M Q G Z7T Y K C N X D B6/1J W P A   R L E2- U F I3V S4H5".split("");
	BinarySearchTree tree;
	
	public MorseCode()
	{
		tree = new BalancedTree(LETTERS);
	}
	
	public String decode(String s)
	{
		/*this regex is for space or forwards slash
		 * space designates the end of a letter
		 * slash marks the end of a word.
		 */
		
		String[] arr = s.split(" |/");
		int index = LETTERS.length-1;
		
		for(String input : arr)
		{
			for(int x = 0; x < input.length(); x++)
				if(input.substring(x,x).equals("-"))
					index = index *2 +1;
				else
					index = index *2 +2;
			
		}
	}
	private void setTree(String[] morse, BinarySearchTree tree)
	{
		
	}
	
	public String encode(String s)
	{
		
	}
	
	
	
}
