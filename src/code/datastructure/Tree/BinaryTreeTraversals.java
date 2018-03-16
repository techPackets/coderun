package code.datastructure.Tree;

class BinaryTreeTraversals<T> {
	Node<T> root;

	BinaryTreeTraversals(Node<T> root) {
		this.root = root;
	}

	public void addNode(Node<T> n, Node<T> parent, String orientation) {
		if (orientation.equals("LEFT")) {
			if (parent.left != null)
				throw new RuntimeException("slot is occupied");
			parent.left = n;
		} else {
			if (parent.right != null)
				throw new RuntimeException("slot is occupied");
			parent.right = n;
		}
	}

	/* traversing the tree in pre-order */
	public void printTreeInPreOrder(Node<T> node) {
		if (node == null)
			return;
		System.out.println(node.key);
		printTreeInPreOrder(node.left);
		printTreeInPreOrder(node.right);
	}

	/* traversing the tree in in-order */
	public void printTreeInOrder(Node<T> node) {
		if (node == null)
			return;
		printTreeInPreOrder(node.left);
		System.out.println(node.key);
		printTreeInPreOrder(node.right);
	}

	/* traversing the tree in post-order */
	public void printTreeInPostOrder(Node<T> node) {
		if (node == null)
			return;
		printTreeInPreOrder(node.left);
		printTreeInPreOrder(node.right);
		System.out.println(node.key);
	}

	//@formatter:off
	/*
    BINARY TREE  
	   3
      / \
     1   4
        / \
       2   5
    */
    //@formatter:on
	public static void main(String[] args) {
		Node<Integer> root = new Node<Integer>(3);
		BinaryTreeTraversals<Integer> bTree = new BinaryTreeTraversals<Integer>(root);
		Node<Integer> one = new Node<Integer>(1);
		bTree.addNode(one, root, "LEFT");
		Node<Integer> four = new Node<Integer>(4);
		bTree.addNode(four, root, "RIGHT");
		Node<Integer> two = new Node<Integer>(2);
		bTree.addNode(two, four, "LEFT");
		Node<Integer> five = new Node<Integer>(5);
		bTree.addNode(five, four, "RIGHT");

		System.out.println("Pre-order traversal of the tree");
		bTree.printTreeInPreOrder(root);
		
		System.out.println("In-order traversal of the tree");
		bTree.printTreeInOrder(root);
		
		System.out.println("Post-order traversal of the tree");
		bTree.printTreeInPostOrder(root);
		 
	}
}