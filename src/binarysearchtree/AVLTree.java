package binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class AVLTree {
	
	private Node root;

	private int nodeCount;
	
	public boolean insert(int value) {
		
		if(!contains(value)) {
			Node traversalNode = root;
			root = insert(traversalNode, value); 
			nodeCount++;
			return true;
		}

		return false;
	}
	
	private Node insert(Node traversalNode, int value) {
		
		if(traversalNode == null) {
			return new Node(value);
		}
		
		if(value < traversalNode.getValue()) {
			traversalNode.setLeft(insert(traversalNode.getLeft(), value));
		} else {
			traversalNode.setRight(insert(traversalNode.getRight(), value));
		}
		
		update(traversalNode);
		
		return balance(traversalNode);
		
	}
	
	/*
	 * To balance the given node
	 */
	private Node balance(Node traversalNode) {
		
		if(traversalNode.getBalanceFactor() <= -2) {
			if(traversalNode.getLeft().getBalanceFactor() <= 0) {
				return leftLeftCase(traversalNode);
			} else {
				return leftRightCase(traversalNode);
			}
		} else if(traversalNode.getBalanceFactor() >= 2) {
			if(traversalNode.getRight().getBalanceFactor() >= 0) {
				return rightRightCase(traversalNode);
			} else {
				return rightLeftCase(traversalNode);
			}
		}
		
		return traversalNode;
	}
	
	private Node leftLeftCase(Node traversalNode) {
		return rightRotation(traversalNode);
	}
	
	private Node leftRightCase(Node traversalNode) {
		traversalNode.setLeft(leftRotation(traversalNode.getLeft()));
		return leftLeftCase(traversalNode);
	}
	
	private Node rightRightCase(Node traversalNode) {
		return leftRotation(traversalNode);
	}
	
	private Node rightLeftCase(Node traversalNode) {
		traversalNode.setRight(rightRotation(traversalNode.getRight()));
		return rightRightCase(traversalNode);
	}
	
	private Node leftRotation(Node traversalNode) {
		Node node = traversalNode.getRight();
		traversalNode.setRight(node.getLeft());
		node.setLeft(traversalNode);
		update(node);
		update(traversalNode);
		return node;
	}
	
	private Node rightRotation(Node traversalNode) {
		Node node = traversalNode.getLeft();
		traversalNode.setLeft(node.getRight());
		node.setRight(traversalNode);
		update(node);
		update(traversalNode);
		return node;
	}
	
	/*
	 * To update height of node and balance factor
	 */
	private void update(Node traversalNode) {
		int leftHeight = traversalNode.getLeft() == null ? -1 : traversalNode.getLeft().getHeight();
		int rightHeight = traversalNode.getRight() == null ? -1 : traversalNode.getRight().getHeight();
		
		traversalNode.setHeight(1 + Math.max(leftHeight, rightHeight));
		traversalNode.setBalanceFactor(rightHeight - leftHeight);
	}
	
	public void traversal() {
		Node traversalNode = root;
		List<String> result = new ArrayList<>();
		inOrderTraversal(traversalNode, result);
		System.out.println(result.toString());
	}
	
	private void inOrderTraversal(Node traversalNode, List<String> result) {
		if(traversalNode == null) {
			return;
		}
		result.add(traversalNode.getValue() + " : " + traversalNode.getBalanceFactor());
		inOrderTraversal(traversalNode.getLeft(), result);
		inOrderTraversal(traversalNode.getRight(), result);
	}
	
	private boolean contains(int value) {
		
		Node traversalNode = root;
		
		while(traversalNode != null) {
			if(value < traversalNode.getValue()) {
				traversalNode = traversalNode.getLeft();
			} else if(value > traversalNode.getValue()) {
				traversalNode = traversalNode.getRight();
			} else {
				return true;
			}
		}
		
		return false;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public static void main(String args[]) {
		AVLTree tree = new AVLTree();
		tree.insert(10);
		tree.traversal();
		System.out.println(tree.insert(10)); // Duplicate node, returns false
		
		AVLTree tree1 = new AVLTree();
		tree1.insert(1);
		tree1.insert(2);
		tree1.insert(3);
		tree1.insert(4);
		tree1.insert(5);
		tree1.insert(6);
		tree1.insert(7);
		tree1.insert(8);
		tree1.traversal(); //[4 : 0, 3 : -2, 2 : -1, 1 : 0, 6 : 1, 5 : 0, 7 : 1, 8 : 0] - Nodes and their balance factors
	}

}
