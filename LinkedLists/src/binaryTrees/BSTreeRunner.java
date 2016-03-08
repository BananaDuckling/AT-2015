package binaryTrees;

public class BSTreeRunner
{
	public static void main( String args[] )
	{
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(90);
		tree.add(50);
		tree.add(40);
		tree.add(65);
		tree.add(45);
		tree.add(70);
		tree.add(120);
		tree.add(100);
		tree.add(150);
		tree.add(30);
		
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
		tree.getNumLevels();
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