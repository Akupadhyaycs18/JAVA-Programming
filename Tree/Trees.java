package Tree;




public class Trees {
	
	 int val;
	  
	    Trees left;
	 
	    Trees right;

	    
	    public Trees() {}

	    public Trees(int val) {
	        this.val = val;
	    }

	    
	    public Trees(int val, Trees left, Trees right) {
	        this.val = val;
	        this.left = left;
	        this.right = right;
	
	    }
	    
	    static void preOrdered(Trees root) {
	    	
	    	System.out.print(root.val);
	    	preOrdered(root.left);
	    	preOrdered(root.right);
	    	
	    }
	    public static void main(String[] args) {
	    	
	    	 // Create the leaf node for 3
	        Trees leaf3 = new Trees(3);

	        // Create the node for 2, which has a left child (3)
	        Trees node2 = new Trees(2, leaf3, null);

	        // Create the root node (1), which has no left child but has a right child (2)
	        Trees root = new Trees(1, null, node2);
	        
	        preOrdered(root);
	    }
}
