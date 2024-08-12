package codes;

import codes.TreeNode;

public class IsSameTree {
	TreeNode left, right, val;

public static void main(String[] args) {
	
		TreeNode p = new TreeNode(2);
		p.left = new TreeNode(1);
		p.right = new TreeNode(3);

		TreeNode q = new TreeNode(2);
		q.left = new TreeNode(1);
		q.right = new TreeNode(3);
		System.out.println(isSameTree(p,q));
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == q)
			return true;
		if (p == null || q == null || p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}

}
