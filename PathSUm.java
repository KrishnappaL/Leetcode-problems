package code2;
import code2.Node;
public class PathSUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	root = [5,4,8,11,null,13,4,7,2,null,null,null,1]; 
		Node root=new Node(5);
	    root.left=new Node(4);
	    root.right=new Node(8);
	    
		int targetSum = 22;
		hasPathSum(root,targetSum);
	}
	  public static boolean hasPathSum(Node root, int targetSum) {
	        if(root == null) 
	        	return false;
	        targetSum-=root.val;
	        if(targetSum == 0 && root.left==null && root.right==null)
	        	return true;
	      boolean left=  hasPathSum(root.left,targetSum);
	     boolean right=  hasPathSum(root.right,targetSum);
	            return (left || right);
	        
	    }

}
