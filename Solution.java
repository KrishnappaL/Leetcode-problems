import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(15);
        root.left.right=new TreeNode(7);
        rightSideView(root);
    }
            public static List<Integer> rightSideView(TreeNode root) {
                if (root == null)
                    return new ArrayList();
                Queue<TreeNode> queue = new LinkedList();
                queue.offer(root);
                List<Integer> res = new ArrayList();

                while(!queue.isEmpty()){
                    int size = queue.size();

                    while (size -- > 0){
                        TreeNode cur = queue.poll();
                        if (size == 0)
                            res.add(cur.val);

                        if (cur.left != null)
                            queue.offer(cur.left);
                        if (cur.right != null)
                            queue.offer(cur.right);
                    }
                }

                return res;
            }
        }
