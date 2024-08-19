package code2;

public class LowestcommonAncestor {

	public static void main(String[] args) {
//Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
		Node root = new Node(3);
		root.left = new Node(5);
		root.right = new Node(1);
		root.left.left=new Node(6);
		root.left.right = new Node(2);
		root.left.right.left=new Node(7);
		root.left.right.right = new Node(4);
		root.right.left=new Node(0);
		root.right.right=new Node(8);
		LowestcommonAncestor l=new LowestcommonAncestor();
		int p=7,q=8;
		l.lowestCommonAncestor(root,p,q);
	}
	    public Node lowestCommonAncestor(Node root, int p, int q) {
	    	        if (root == null || root.val == p || root.val == q) {
	    	            return root;
	    	        }
	    	        var left = lowestCommonAncestor(root.left, p, q);
	    	        var right = lowestCommonAncestor(root.right, p, q);
	    	        if (left != null && right != null) {
	    	            return root;
	    	        }
	    	        return left == null ? right : left;
	    	}
	}


