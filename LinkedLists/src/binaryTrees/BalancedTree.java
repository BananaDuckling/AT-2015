package binaryTrees;
import java.util.*;
public class BalancedTree extends BinarySearchTree{
	
	private TreeNode t = new TreeNode();
	public BalancedTree(Object[] arr)
	{
		setRoot(balance(arr));
	}
	public TreeNode balance(Object[] arr)
	{
		return balance(arr, 0, arr.length-1);
	}

	private TreeNode balance(Object[] arr, int start, int end)
	{
		if(start >= end)
			return null;
		int mid = (start + end)/2;
		
		TreeNode node = new TreeNode((Comparable)arr[mid]);

		node.setLeft(balance(arr, start, mid));
		node.setRight(balance(arr, mid+1, end));
		return node;
	}

	public static void main(String[] args)
	{
		Object[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		BalancedTree x = new BalancedTree(data);
		System.out.println("preOrder");
		x.preOrder();
		TreeNode temp = x.getRoot();
		System.out.println("Right Branch");
		while(temp != null)
		{
			System.out.print(temp.toString()+ " ");
			temp = temp.getRight();
		}

	}
}
