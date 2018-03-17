package code.datastructure.Tree;

class BinaryTreeDFTraversals<T> {
	Node<T> root;

	BinaryTreeDFTraversals(Node<T> root) {
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
	public void printTreePreOrder(Node<T> node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		printTreePreOrder(node.left);
		printTreePreOrder(node.right);
	}

	/* traversing the tree in in-order */
	public void printTreeInOrder(Node<T> node) {
		if (node == null)
			return;
		printTreeInOrder(node.left);
		System.out.print(node.key + " ");
		printTreeInOrder(node.right);
	}

	/* traversing the tree in post-order */
	public void printTreePostOrder(Node<T> node) {
		if (node == null)
			return;
		printTreePostOrder(node.left);
		printTreePostOrder(node.right);
		System.out.print(node.key + " ");
	}

	 //@formatter:off
		/*
	    BINARY TREE  
		   3
	     /  \
	    1     4
	   / \   / \
	  6   7 2   5
	    */
	 //@formatter:on
	public static void main(String[] args) {
		Node<Integer> root = new Node<Integer>(3);
		BinaryTreeDFTraversals<Integer> bTree = new BinaryTreeDFTraversals<Integer>(root);
		Node<Integer> one = new Node<Integer>(1);
		bTree.addNode(one, root, "LEFT");
		Node<Integer> six = new Node<Integer>(6);
		bTree.addNode(six, one, "LEFT");
		Node<Integer> seven = new Node<Integer>(7);
		bTree.addNode(seven, one, "RIGHT");
		Node<Integer> four = new Node<Integer>(4);
		bTree.addNode(four, root, "RIGHT");
		Node<Integer> two = new Node<Integer>(2);
		bTree.addNode(two, four, "LEFT");
		Node<Integer> five = new Node<Integer>(5);
		bTree.addNode(five, four, "RIGHT");

		System.out.println("Pre-order traversal of the tree");
		bTree.printTreePreOrder(root);
		
		System.out.println();
		System.out.println("In-order traversal of the tree");
		bTree.printTreeInOrder(root);
		
		System.out.println();
		System.out.println("Post-order traversal of the tree");
		bTree.printTreePostOrder(root);
		 
	}
}