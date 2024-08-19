package code2;
import code2.Node;
public class RecrsivelyFindingMaxLengthOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(3);
		root.left=new Node(9);
		root.right=new Node(20);
		root.right.left=new Node(15);
		root.right.right=new Node(7);
		System.out.println(maxDepth(root));

	}
	    public static int maxDepth(Node root) {
	        if (root == null) {
	            return 0;
	        }
	       // int l = maxDepth(root.left);
	       int r = maxDepth(root.right);
	        return 1 + r;
	    }
	}


