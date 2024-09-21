public class FlattenTree {
   static TreeNode head=null;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        flatten(root);
    }

    public static void flatten(TreeNode root) {
                if (root != null) revPreOrder(root);
            }
            private static void revPreOrder(TreeNode node) {
                if (node.right != null) revPreOrder(node.right);
                if (node.left != null) revPreOrder(node.left);
                node.left = null;
                node.right = head;
                head = node;
            }
        }


