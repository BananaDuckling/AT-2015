package binaryTrees;
import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		//add test cases here
	   TreeNode t = new TreeNode(new Integer(70));
 		BinarySearchTree b = new BinarySearchTree(t);
 		b.add(new Integer(80));
 		b.add(new Integer(85));
 		b.add(new Integer(90));
 		b.add(new Integer(98));
 		b.add(new Integer(100));
 		b.add(new Integer(120));
 		
 		b.preOrder();
 		
 
   }
} 