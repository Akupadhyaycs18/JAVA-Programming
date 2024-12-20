package Tree;

public class Height {
	
	
	static int heightTree(Node node) {
		
		if(node==null) {
			return 0;
		}
		
		return 1+ Math.max(heightTree(node.left), heightTree(node.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();

	     
	     tree.root = new Node(1);
	     tree.root.left = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(5);
	     tree.root.right.right = new Node(6);
	     
	     System.out.print(heightTree(tree.root));

	}

}
