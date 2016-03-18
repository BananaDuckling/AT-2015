package binaryTrees;
import java.util.*;
public class BalancedTree {
	
	private TreeNode t = new TreeNode();
	public BalancedTree(int[] arr)
	{
		
	}
	public TreeNode balance(int[] arr)
	{
		return balance(arr, 0, arr.length-1);
	}

	private TreeNode balance(int[] arr, int start, int end)
	{
		int index = (start + end)/2;
		if(index%2 != 0)
			index++;

		TreeNode left = new TreeNode(arr, start, index);
		TreeNode right = new TreeNode(arr, index, end);
		root = new TreeNode(arr[index], left, right);
	}
	
	public void inOrder()
	{
		
	}

	public static void main(String[] args)
	{
		int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		BalancedTree x = new BalancedTree(data);
		System.out.println("InOrder");
		x.inOrder();
		TreeNode temp = x.getRoot();
		System.out.println("Right Branch");
		while(temp != null)
		{
			System.out.print(temp+ " ");
			temp = temp.getRight();
		}

	}
}
