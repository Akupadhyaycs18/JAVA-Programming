package src.Tree;

public class BalancedTree {
	
static int heightTree(Node node) {
		
		if(node==null) {
			return 0;
		}
		
		return 1+ Math.max(heightTree(node.left), heightTree(node.right));
	}
	
	static boolean isBalanced(Node node) {
		
		int Left=heightTree(node.left);
		int Right=heightTree(node.right);
		
		if(Left-Right<=1 && isBalanced(node.left) && isBalanced(node.right)) {
			
		return true;
		
		}
		
		return false;
		
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
	     
	     System.out.print(isBalanced(tree.root));
	}

}
