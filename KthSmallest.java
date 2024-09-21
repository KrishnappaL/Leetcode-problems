import java.util.Stack;

public class KthSmallest {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);root.left.right=new TreeNode(2);
        root.right=new TreeNode(4);
        kthSmallest(root,4);
    }
    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        int count = 0;

        while (p != null || !stack.isEmpty()) {
            if(p != null) {
                stack.push(p);  // similar to calling dfs(root.left)
                p = p.left;
            } else {
                p = stack.pop();
                //---------- real code starts here ----------
                count++;
                if(count == k) {
                    return p.val;
                }
                //-------------------------------------------
                p = p.right;  // similar to calling dfs(root.right)
            }
        }

        return Integer.MIN_VALUE;
    }
}

