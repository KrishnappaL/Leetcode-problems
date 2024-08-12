package codes;
import java.util.LinkedList;

import codes.TreeNode;
public class BreadthFirstSearch {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(5);
		root.left=new TreeNode(2);
		root.left.left=new TreeNode(1);
		root.right=new TreeNode(6);
		
		BFS(root);
	}
	static void BFS(TreeNode root){
	java.util.Queue<TreeNode> q=new LinkedList<>();
	q.add(root);
	int size=q.size();
	while(!q.isEmpty()) {
	for(int i=0;i<size;i++) {
		TreeNode current=q.poll();
		if(current.left!=null) q.add(current.left);
		if(current.right!=null) q.add(current.right);
		System.out.println(current.val);
	}
	}
	
	}
}
