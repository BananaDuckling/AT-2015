package binaryTrees;
import static java.lang.System.*;
import java.util.*;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}
	
	public TreeNode getLeft()
	{
		return root.getLeft();
	}
	
	public TreeNode getRight()
	{
		return root.getRight();
	}
	
	public BinarySearchTree(TreeNode t)
	{
		root = t;
	}
	
	public void setRoot(TreeNode t)
	{
		root = t;
	}
	
	public TreeNode getRoot()
	{
		return root;
	}
	public void setLeft(TreeNode t)
	{
		root.setLeft(t);
	}
	public void setRight(TreeNode t)
	{
		root.setRight(t);
	}
	
	
	
	public void add(Comparable val)
	{
		root = add(val, root);
	}
	private TreeNode add(Comparable val, TreeNode tree)
	{
		if(tree == null){
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
		System.out.print(root.getValue()+ "  ");
		preOrder(root.getLeft());
		preOrder(root.getRight());

		System.out.println("\n\n");
	}
	private void preOrder(TreeNode tree)
	{
		if(tree != null)
		{
			System.out.print(tree.getValue() + "  ");
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
			System.out.print(tree.getValue()+" ");
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
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}

	}
	

	public void getNumNodes(){
		System.out.println("Number of nodes: \n" + getNumNodes(root) +"\n");
	}
	private int getNumNodes(TreeNode tree){
		if(tree == null)
			return 0;
		return 1 + getNumNodes(tree.getLeft()) + getNumNodes(tree.getRight());
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

	public void getNumLeaves(){
		System.out.println("Number of leaves: \n" + (getNumLeaves(root) / 2) +"\n");
	}
	public int getNumLeaves(TreeNode t)
	{
		if(t == null)
			return 1;
		return getNumLeaves(t.getLeft())+getNumLeaves(t.getRight());
	}

	public void getWidth(){
		System.out.println("GET WIDTH: \n" + (getWidth(root) + 1) +"\n");
	}

	private int getWidth(TreeNode tree){
		if(tree == null)
			return 1;

		if(getWidth(tree.getLeft()) > getWidth(tree.getRight()))
			return getWidth(tree.getLeft()) + 1;

		return getWidth(tree.getRight()) + 1;
	}
	
	public void getHeight(){
		System.out.println("Height: \n"+ (getNumLevels(root)-1) + "\n");
	}
	
	
	public void isFull(){
		System.out.println("Is full: \n" + isFull(root) +"\n");
	}

	private boolean isFull(TreeNode tree){
		if(tree.getLeft() == null && tree.getRight() == null)
			return true;

		if(tree.getLeft() != null && tree.getRight() != null)
			return isFull(tree.getLeft()) && isFull(tree.getRight());

		return false;

	}

	
	public void search(Comparable c){
		System.out.println("SEARCH FOR " + c.toString() + "\n" + search(root, c)+"\n");
//		if(search(root, c))
			
	}

	private boolean search(TreeNode tree, Comparable c){
		if(tree == null)
			return false;

		if(tree.getValue().equals(c))
			return true;

		return (search(tree.getLeft(), c) || search (tree.getRight(), c));
	}
	

	public void maxNode(){
		System.out.println("Max Node: \n"+maxNode(root, root.getValue())+"\n");
	}

	private Comparable maxNode(TreeNode tree, Comparable c){
		if(tree == null)
			return c;

		if(tree.getValue().compareTo(c) > 0)
			return maxNode(tree.getRight(), tree.getValue());

		return maxNode(tree.getRight(), c);
	}
	
	public void minNode(){
		System.out.println("Min node: \n"+minNode(root, root.getValue())+"\n");

	}

	private Comparable minNode(TreeNode tree, Comparable c){
		if(tree == null)
			return c;

		if(tree.getValue().compareTo(c) < 0)
			return minNode(tree.getLeft(), tree.getValue());

		return minNode(tree.getLeft(), c);
	}
	public void levelOrder(){
		System.out.println("Level order:");

		Queue<Comparable> q = new LinkedList<Comparable>();
		q.add(root.getValue());
		levelOrder(root, q);
		
		System.out.println(q);
		System.out.println("\n\n");		
	}

	private void levelOrder(TreeNode tree, Queue<Comparable> list){
		if(tree == null)
			return;
		if(tree.getLeft() != null)
			list.add(tree.getLeft().getValue());

		if(tree.getRight() != null)
			list.add(tree.getRight().getValue());

		levelOrder(tree.getLeft(), list);
		levelOrder(tree.getRight(), list);
	}

	
	//level order
	
	//display like a tree
	
	public void remove(Comparable val)
	{
		root = remove(val, root);
	}
	private TreeNode remove(Comparable val, TreeNode t)
	{
		if(t != null)
		{
			int dirTest = val.compareTo(t.getValue());
			
			if(dirTest < 0)
				/*
				 * if val is less than current node/to the left
				 * then go left again until match is found
				 */
				t.setLeft(remove(val, t.getLeft()));
			else if(dirTest > 0)
				/*
				 * if val is greater than curr node/to the right
				 * go right again until match is found	
				 */
				t.setRight(remove(val, t.getRight()));
			
			else	//if the value to remove is found
			{
				if(t.getRight() == null)
					t = t.getLeft();
				else
				{
					TreeNode successor = getSmallest(t.getRight());
					t.setValue(successor.getValue());
					t.setRight(remove(successor.getValue(), t.getRight()));
				}
			}
		}
		return null;
	}
	
	public Comparable getSmallest()
	{
		return getSmallest(root).getValue();
	}
	private TreeNode getSmallest(TreeNode t)
	{
		if(t != null)
		{
			if(t.getLeft() != null)
				return getSmallest(t.getLeft());
			else
				return t;
		}
		else
			return t;
	}

	public String toString()
	{
		String str = "";
		for(int x = 0; x<getNumLevels(root); x++){
			str += toString(root, x+1);
			str+="\n";
		}
		return str;
	}
	private String toString(TreeNode tree, int level)
	{
		if(tree == null)
			return "";
		if(level == 1)
			return tree.getValue().toString() + "  "; 
		return toString(tree.getLeft(), level-1) + toString(tree.getRight(), level-1);
	}
}
