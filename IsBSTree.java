package codes;
import codes.TreeNode;
public class IsBSTree {
TreeNode prev;
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(1);
		root.left.right=new TreeNode(4);
		root.right.left=new TreeNode(0);
		root.right.right=new TreeNode(6);
		IsBSTree bst=new IsBSTree();
		System.out.println(bst.isValidBST(root));
	}
	public  boolean isValidBST(TreeNode root) {
		return dfs(root);
		
	}
	private boolean dfs(TreeNode root) {
		if(root==null) 
			{return true;}
		if(!dfs(root.left)) 
		{return false;}
		if(prev!=null && prev.val>=root.val)
		{ return false;}
		prev=root;
		return dfs(root.right);
	}
}
