import java.util.*;

public class ZgZagTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        zigzagLevelOrder(root);
    }
        public static List<List<Integer>> zigzagLevelOrder(TreeNode root)
        {
            if(root==null) return Collections.emptyList();
            List<List<Integer>> result=new ArrayList<>();
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);

            int level=1;
            while(!queue.isEmpty()){
                int queueSize=queue.size();
                List<Integer> childList=new ArrayList<>();
                Stack<Integer> stack=new Stack<>();
                for(int i=0;i<queueSize;i++){
                    TreeNode currNode=queue.poll();
                    if(currNode!=null){
                        if(level%2==0) stack.add(currNode.val);
                        else childList.add(currNode.val);
                        if(currNode.left!=null) queue.add(currNode.left);
                        if(currNode.right!=null) queue.add(currNode.right);
                    }
                }
                if(!stack.isEmpty()) {
                    while(!stack.isEmpty()){
                        childList.add(stack.pop());
                    }
                }
                result.add(childList);
                level++;
            }

            return result;
        }
}



