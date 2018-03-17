package code.datastructure.Tree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeBFTraversal<T> {
	Node<T> root;

	BinaryTreeBFTraversal(Node<T> root) {
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

	/* traversing the tree in breadth first order */
	public void printTreeBreadthFirstOrder(Node<T> node) {
		if (node == null)
			return;
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(node);

		while (!queue.isEmpty()) {
			Node<T> n = queue.remove();
			System.out.print(n.key + " ");

			if (n.left != null)
				queue.add(n.left);
			if (n.right != null)
				queue.add(n.right);

		}

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
		BinaryTreeBFTraversal<Integer> bTree = new BinaryTreeBFTraversal<Integer>(root);
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

		System.out.println("Breadth first traversal of the tree");
		bTree.printTreeBreadthFirstOrder(root);

	}
}
