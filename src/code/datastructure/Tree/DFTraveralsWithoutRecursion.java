package code.datastructure.Tree;

import java.util.Stack;

public class DFTraveralsWithoutRecursion<T> {

	Node<T> root;

	DFTraveralsWithoutRecursion(Node<T> root) {
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

	public void printTreePreOrderIteratively(Node<T> root) {
		if (root == null)
			return;

		Stack<Node<T>> st = new Stack<Node<T>>();
		st.push(root);

		while (!st.isEmpty()) {
			Node<T> tmp = st.peek();
			System.out.print(tmp.key + " ");
			st.pop();

			if (tmp.right != null)
				st.push(tmp.right);
			if (tmp.left != null)
				st.push(tmp.left);
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
		DFTraveralsWithoutRecursion<Integer> bTree = new DFTraveralsWithoutRecursion<Integer>(root);
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
		bTree.printTreePreOrderIteratively(root);

	}

}
