package code2;

public class CountUnivalueOnTree {
	private static int ans;
public static void main(String[] args) {
	Node root=new Node(5);
    root.left=new Node(1);
    root.right=new Node(5);
    root.left.left=new Node(5);
    root.right.right=new Node(5);
   // root.left=new Node(4);
    root.right.right=new Node(5);
    countUnivalSubtrees(root);
    
}
    public static int countUnivalSubtrees(Node root) {
        dfs(root);
        return ans;
    }

    private static boolean dfs(Node root) {
        if (root == null) {
            return true;
        }
        boolean l = dfs(root.left);
        boolean r = dfs(root.right);
        if (!l || !r) {
            return false;
        }
        int a = root.left == null ? root.val : root.left.val;
        int b = root.right == null ? root.val : root.right.val;
        if (a == b && b == root.val) {
            ++ans;
            return true;
        }
        return false;
    }

}
