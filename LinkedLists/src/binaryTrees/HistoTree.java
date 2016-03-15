import static java.lang.System.*;

public class HistoTree
{
   private HistoNode root;

	public HistoTree( )
	{
		root = null;
	}

	public void addData(Comparable val)
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

	private HistoNode add(Comparable data, HistoNode tree)
	{
		return null;
	}

	public HistoNode search(Comparable data)
	{
		return null;
	}

	private HistoNode search(Comparable data, HistoNode tree)
	{
		return null;
	}

	public String toString()
	{
		return "";
	}

	private String toString(HistoNode tree)
	{
		return "";
	}
}