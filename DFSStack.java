package code2;
import java.util.Stack;

import codes.TreeNode;
public class DFSStack {
public static void main(String[] args) {
	TreeNode root=new TreeNode(5);
	root.left=new TreeNode(6);
	root.left.left=new TreeNode(8);
	root.left.right=new TreeNode(9);
	root.right=new TreeNode(7);
	root.left.right.right=new TreeNode(2);
	DFSInOrder(root);
}
	public static void DFSInOrder(TreeNode root) {
	    Stack<TreeNode> stack = new Stack<>();
	    TreeNode current = root;
	    stack.push(root);
	    while(!stack.isEmpty()) {
	        while(current.left != null) {
	            current = current.left;                
	            stack.push(current);                
	        }
	        current = stack.pop();
	       // System.out.print(current.val);
	        if(current.right != null) {
	            current = current.right;                
	            stack.push(current);
	        }
	    }
	}
}
