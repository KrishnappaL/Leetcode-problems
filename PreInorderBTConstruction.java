package code2;

public class PreInorderBTConstruction {
	public static void main(String[] args) {
		int[] preorder = {3,9,20,15,7},inorder = {9,3,15,20,7};
		PreInorderBTConstruction t=new PreInorderBTConstruction();
		t.buildTree(preorder,inorder);
	}
	    public Node buildTree(int[] preorder, int[] inorder) {
	        int preStart =0;
	        int preEnd = preorder.length-1;
	        int inStart = 0;
	        int inEnd = inorder.length-1;
	 
	        return buildTree(preorder, preStart, preEnd, 
	                     inorder, inStart, inEnd);

	    }
	    
	    public Node buildTree(int[] preorder, int preStart, int preEnd, 
	                              int[] inorder, int inStart, int inEnd){
	        if(preStart > preEnd || inStart > inEnd )
	            return null;
	 
	        int rootValue = preorder[preStart];
	        Node root = new Node(rootValue);
	 
	        int k=0;
	        for(int i=0; i< inorder.length; i++){
	            if(inorder[i]==rootValue){
	                k = i;
	                break;
	            }
	        }
	 
	        // Becuase k is not the length, it it need to -(inStart+1) to get the length
	        root.left = buildTree(preorder, preStart+1, preStart+1-inStart+k-1, 
	                          inorder, inStart, k-1 );
	        // postStart+k-inStart = postStart+k-(inStart+1) +1
	        root.right = buildTree(preorder, preStart+1-inStart+k, preEnd, 
	                           inorder, k+1, inEnd);
	 
	        return root;
	    }

	
}
