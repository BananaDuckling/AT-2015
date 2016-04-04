package binaryTrees;

public class MorseCode {

	private static final String[] morse = {"T","M","O","_","0","9",".","8","G","Q","Z","7","N","K",
		"Y","C","D","X","B","6","E","A","W","J","1","P","R","L","I","U","-","2","F","S","V","3","H",
		"4","5"};
			
	public static String decode(String s)
	{
		//this regex is for space or forwards slash
		String[] arr = s.split(" |/");
		
		BinarySearchTree tree = new BinarySearchTree();
		
	}
	private static void setTree(String[] morse, BinarySearchTree tree)
	{
		int index = 0;
		tree.setLeft(new TreeNode((Comparable)morse[index++])); tree.getLeft();
		tree.setLeft(new TreeNode((Comparable)morse[index++]));
		tree.setLeft(new TreeNode((Comparable)morse[index++]));
		tree.setLeft
	}
	
	public static String encode(String s)
	{
		
	}
	
	
	
}
