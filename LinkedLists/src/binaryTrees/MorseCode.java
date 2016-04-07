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
		String[] arr = s.split("/");
		String ret = "";
		
		for(String input : arr)
		{
			TreeNode t = new TreeNode();
			String temp = "";
			for(int x = 0; x < input.length(); x++)
			{
				if(input.substring(x,x).equals("-"))
					t = tree.getLeft();
				else if(input.substring(x, x).equals("."))
					t = tree.getRight();
				ret += t.toString() + " ";
			}
		}
	}
	
	public String encode(String s)
	{
		String[] arr = s.split(" ");
		String ret = "";
		
		TreeNode t = new TreeNode();
		String temp = "";
		for(String input : arr)
		{
			for(int x = 0; x < input.length(); x++)
			{
				
			}
		}
		
	}
	
	
	
}
