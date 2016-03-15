package binaryTrees;

public class BSTreeRunner
{
	public static void main( String args[] )
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(90);
		tree.add(80);
		tree.add(100);
		tree.add(70);
		tree.add(85);
		tree.add(98);
		tree.add(120);
	
		
		System.out.println("In order");
		tree.inOrder();
		System.out.println("preorder");
		tree.preOrder();
		System.out.println("Post order");
		tree.postOrder();
		System.out.println("Reverse Order");
		tree.revOrder();

		tree.getHeight();
		tree.getWidth();
		tree.getNumLeaves();
		tree.getNumNodes();
		System.out.println("Number of levels: "+tree.getNumLevels()+"\n");
		tree.isFull();
		tree.search(new Integer(120));
		tree.maxNode();
		tree.minNode();
		tree.levelOrder();
		
	
		
		System.out.println(tree.toString());
		System.out.println("Remove:");
		tree.remove(120);
		
		System.out.println(tree.toString());
		
	}
}