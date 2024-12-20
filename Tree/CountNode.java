package Tree;

public class CountNode {
	
	
	static int CountNode(Node node) {
		
		if(node==null) {
			
			return 0;
			
		}
		
		return 1+CountNode(node.left)+CountNode(node.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTree tree = new BinaryTree();

	     // Constructing the binary tree
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.right.right = new Node(6);
	     
	     System.out.print(CountNode(tree.root));
	}

}
