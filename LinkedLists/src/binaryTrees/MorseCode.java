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
		return ret;
	}
	
	public String encode(String s)
	{
		String[] arr = s.split(" ");
		String ret = "";
		
		TreeNode t = this.tree.getRoot();
		for(String input : arr)
		{
			for(int x = 0; x < input.length(); x++)
			{
				//add space after to indicate letter break
				ret += nodeSequence(input.substring(x, x), t) + " ";
			}
			//add slash after to indicate word break
			ret += "/";
		}
		return ret;
	}
	
	private String nodeSequence(String search, TreeNode t)
	{
		return nodeSequence(search, t, "");
	}
	private String nodeSequence(String search, TreeNode t, String ret)
	{
		//search is one letter, so if it is found, return ret.
		if(search.toUpperCase().compareTo((String) (t.getValue())) == 0)
			return ret;
		
		nodeSequence(search, t.getLeft(), ret + "-");
		nodeSequence(search, t.getRight(), ret += ".");
		
		//(hopefully) useless return to satisfy method
		//shouldn't ever reach, because too busy running. otherwise, match is found and returned
		return "";
	}
}
