package code.datastructure.Tree;

class Node<T> {
	T key;
	Node<T> left;
	Node<T> right;
	Node<T> parent;

	Node(T key) {
		this.key = key;
	}
	
	/*I put this to debug the code*/
	@Override
	public String toString() {
		return "Node [key=" + key + "]";
	}
}

class BinaryTree<T> {
	Node<T> root;

	BinaryTree(Node<T> root) {
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

	/* traversing the tree in pre order */
	public void printTreePreOrder(Node<T> node) {
		if (node == null)
			return;
		System.out.print(node.key + " ");
		printTreePreOrder(node.left);
		printTreePreOrder(node.right);
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
		BinaryTree<Integer> bTree = new BinaryTree<Integer>(root);
		Node<Integer> one = new Node<Integer>(1);
		bTree.addNode(one, root, "LEFT");
		Node<Integer> four = new Node<Integer>(4);
		bTree.addNode(four, root, "RIGHT");
		Node<Integer> two = new Node<Integer>(2);
		bTree.addNode(two, four, "LEFT");
		Node<Integer> five = new Node<Integer>(5);
		bTree.addNode(five, four, "RIGHT");
		
		bTree.printTreePreOrder(root);

	}

}