package Tree;

class BinaryTree {
	
 Node root;
 
 public static void printPreorder(Node node) {
     if (node == null)
         return;

   
     System.out.print(node.data + " ");

     printPreorder(node.left);

   
     printPreorder(node.right);
 }
 public static void printPostrder(Node node) {
     if (node == null)
     {
         
    	 return;
     }

     printPreorder(node.left);

   
     printPreorder(node.right);
     
     System.out.print(node.data + " ");
 }
 
 public static void Inorder(Node node) {
     if (node == null)
     {
         
    	 return;
     }

     printPreorder(node.left);

     System.out.print(node.data + " ");
     printPreorder(node.right);
     
     
 }


 public static void main(String[] args) {
     BinaryTree tree = new BinaryTree();

     // Constructing the binary tree
     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);
     tree.root.right.right = new Node(6);

    
     System.out.println("Preorder traversal of binary tree is: ");
     BinaryTree.printPreorder(tree.root);
     
     System.out.println("PostOrder traversal of binary tree is: ");
     BinaryTree.printPostrder(tree.root);
     
     System.out.println("InOrdered traversal of binary tree is: ");
     BinaryTree.printPostrder(tree.root);
 }
 
}