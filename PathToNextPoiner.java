package code2;

public class PathToNextPoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(4);
		root.right = new Node(8);
		root.left.right = new Node(3);
		root.right.left = new Node(9);
		root.left.left = new Node(2);
		root.right.right = new Node(10);
		connect(root);
	}

	public static Node connect(Node root) {
		if (root == null)
			return root;
		if (root.left != null)
			root.left.next = root.right;
		if (root.right != null)
			root.right.next = root.next == null ? null : root.next.left;
		connect(root.left);
		connect(root.right);
		return root;
	}
}
