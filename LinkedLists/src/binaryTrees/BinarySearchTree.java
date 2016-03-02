
import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree
{
	private TreeNode root;

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
	
	public int getNumNodes(TreeNode t)
	{
		if(t == null)
			return 1;
		int left = getNumNodes(t.getLeft())+1;
		int right = getNumNodes(t.getRight())+1;
		return left+right;
	}
	
	public boolean isFull(TreeNode t)
	{
		if(t == null)
			return !((t.getRight() == null && t.getLeft()== null) || (t.getRight() != null && t.getLeft() != null));
		return isFull(t.getRight()) && isFull(t.getLeft());
	}
	












	
	
	public boolean search(Comparable<TreeNode> c)
	{
		search(c, root);
	}
	private boolean search(Comparable<TreeNode> c, TreeNode t)
	{
		if(c.compareTo(t) == 0)
			return true;
		if(t == null)
			return false;
		return search(c, t.getLeft()) || search(c, t.getRight());
		
	}
	
	public int maxNode()
	{
		maxNode(root, 0);
	}
	private int maxNode(TreeNode t, int max)
	{
		if(t == null)
			return max;
		if(t.getValue().compareTo(max) > 0)
			return Integer.valueOf(t.getValue().toString());
		else
			return max;
	}
	
	public int minNode()
	{
		minNode(root, 0);
	}
	private int minNode(TreeNode t, int min)
	{
		if(t == null)
			return min;
		if(t.getValue().compareTo(min) < 0)
			return Integer.valueOf(t.getValue().toString());
		else
			return min;
	}
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		String ret = "";
		toString(root, ret);
		return ret;
	}
	private String toString(TreeNode t, String s)
	{
		if (t != null){
			inOrder(t.getLeft());
			s += t.getValue() + " ";
			inOrder(t.getRight());
		}
	}

	private String toString(TreeNode tree)
	{
		return "";
	}
}