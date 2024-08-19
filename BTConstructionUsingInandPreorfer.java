package code2;

public class BTConstructionUsingInandPreorfer {

	public static void main(String[] args) {
		 int[] inorder = {1,9,2,5,3,20,4}; int[] postorder = {1,2,9,3,4,20,5};
		 BTConstructionUsingInandPreorfer bt=new BTConstructionUsingInandPreorfer();
		bt.buildTree(inorder,postorder);
	}
	    public Node buildTree(int[] inorder, int[] postorder) {
	        // Call the recursive function with full arrays and return the result
	        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
	    }
	    
	    private Node buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
	        // Base case
	        if (inStart > inEnd || postStart > postEnd) {
	            return null;	        }
	        // Find the root node from the last element of postorder traversal
	        int rootVal = postorder[postEnd];
	        Node root = new Node(rootVal);	    
	        // Find the index of the root node in inorder traversal
	        int rootIndex = 0;
	        for (int i = inStart; i <= inEnd; i++) {
	            if (inorder[i] == rootVal) {
	                rootIndex = i;
	                break;
	            }	      }
	          // Recursively build the left and right subtrees
	        int leftSize = rootIndex - inStart;
	        int rightSize = inEnd - rootIndex;
	root.left = buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize - 1);
	root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightSize, postEnd - 1);
	        
	        return root;
	    }
	}


