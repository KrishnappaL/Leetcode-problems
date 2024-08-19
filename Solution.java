package code2;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.right.right = new Node(9);
		connect(root);
	}
    public static Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            Node prev = null;
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();

                if (prev != null) {
                    prev.next = currentNode;
                }
                prev = currentNode;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return root;
    }
}


