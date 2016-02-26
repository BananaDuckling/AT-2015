
import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree
{
	private TreeNode root;

	public int compareTo()
	{
		return 1;
	}
	public BinarySearchTree()
	{
		root = null;
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null)
	   {
			tree = new TreeNode(val);
			return tree;
	   }
		
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		
		if(dirTest <= 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	//add preOrder, postOrder, and revOrder
	public void preOrder()
	{
		preOrder(root);
		System.out.println("\n\n");
	}
	private void preOrder(TreeNode tree)
	{
		if(tree != null)
		{
			System.out.println(tree.getValue()+" ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}
	public void postOrder()
	{
		postOrder(root);
		System.out.println("\n\n");
	}
	private void postOrder(TreeNode tree)
	{
		if(tree != null)
		{
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.println(tree.getValue()+" ");
		}
		
	}
	
	public void revOrder()
	{
		revOrder(root);
		System.out.println("\n\n");
	}
	private void revOrder(TreeNode tree)
	{
		if(tree != null)
		{
			revOrder(tree.getRight());
			System.out.println(tree.getValue());
			inOrder(tree.getLeft());
		}
	}
	



	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}



	//add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull

	public int getNumLeaves(TreeNode t)
	{
		if(t == null)
			return 1;
		return getNumLeaves(t.getLeft())+getNumLeaves(t.getRight());
	}

	private int getWidth(TreeNode t)
	{
		if(t == null)
			return 0;
		int left = getWidth(t.getLeft())+1;
		int right = getWidth(t.getRight())+1;
		if(left < right)
			return left;
		return right;
	}
	
	public int getHeight(TreeNode t)
	{
		if(t == null)
			return 0;
		int left = getHeight(t.getLeft())+1;
		int right = getHeight(t.getRight())+1;
		if(left < right)
			return left;
		return right;
	}
	
	public int getNumNodes()
	{
		
	}
	
	public boolean isFull()
	{
		
	}
	












	
	
	
	public boolean search(Comparable val)
	{
		if(val.compareTo())
	}
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		return "";
	}

	private String toString(TreeNode tree)
	{
		return "";
	}
}