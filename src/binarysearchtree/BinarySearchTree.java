package binarysearchtree;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	/*
	 * To insert a node in Binary Search Tree
	 */
	public void insert(int value) {
		Node insertNode = new Node(value);
		if(root == null) {
			root = insertNode;
		}
		else {
			Node currentNode = root;
			while(true) {
				if(value < currentNode.getValue()) {
					if(currentNode.getLeft() == null) {
						currentNode.setLeft(insertNode);
						return;
					}
					currentNode = currentNode.getLeft();
				}
				else {
					if(currentNode.getRight() == null) {
						currentNode.setRight(insertNode);
						return;
					}
					currentNode = currentNode.getRight();
				}
			}
		}
	}
	
	/*
	 * To search for a value in binary search tree
	 */
	public boolean lookup(int value) {
		if(root == null) {
			return false;
		}
		else {
			Node tempNode = root;
			while(tempNode != null) {
				if(value == tempNode.getValue()) {
					return true;
				}
				else if(value < tempNode.getValue()) {
					tempNode = tempNode.getLeft();
				}
				else {
					tempNode = tempNode.getRight();
				}
			}
		}
		return false;
	}
	
	/*
	 * To remove a node in Binary Search Tree
	 * 
	 * To delete an element which has both child, we have to
	 * select an element which is greater than all elements in the 
	 * left sub tree and lesser than all elements in the right sub tree.
	 *
	 * Obviously, it the left most element of right sub tree.
	 */
	public boolean remove(int value) {
		if(root == null) {
			return false;
		}
		Node currentNode = root;
		Node parentNode = null;
		while(currentNode != null) {
			if(value < currentNode.getValue()) {
				parentNode = currentNode;
				currentNode = currentNode.getLeft();
			}
			else if (value > currentNode.getValue()) {
				parentNode = currentNode;
				currentNode = currentNode.getRight();
			}
			else {
				//No right node
				if(currentNode.getRight() == null) {
					if(parentNode == null) {
						this.root = currentNode.getLeft();
					}
					else {
						if(currentNode.getValue() < parentNode.getValue()) {
							parentNode.setLeft(currentNode.getLeft());
						}
						else {
							parentNode.setRight(currentNode.getLeft());
						}
					}
				}//Right child with no left node
				else if(currentNode.getRight().getLeft() == null){
					Node leftSubTree = currentNode.getLeft();
					if(parentNode == null) {
						this.root = currentNode.getRight();
					}
					else {
						if(currentNode.getValue() < parentNode.getValue()) {
							parentNode.setLeft(currentNode.getRight());
							parentNode.getLeft().setLeft(leftSubTree);
						}
						else {
							parentNode.setRight(currentNode.getRight());
							parentNode.getLeft().setLeft(leftSubTree);
						}
					}
				}//Right child with left node
				else {
					Node leftMost = currentNode.getRight().getLeft();
					Node leftMostParent = currentNode.getRight();
					while(leftMost.getLeft() != null) {
						leftMostParent = leftMost.getLeft();
						leftMost = leftMost.getLeft();
					}
					if(parentNode == null) {
						Node leftSubTree = root.getLeft();
						Node rightSubTree = root.getRight();
						currentNode = leftMost;
						leftMost.setLeft(leftSubTree);
						leftMost.setRight(rightSubTree);
						leftMostParent.setLeft(null);
						this.root = currentNode;
					}
					else {
						Node rightSubTree = currentNode.getRight();
						if(currentNode.getValue() < parentNode.getValue()) {
							parentNode.setLeft(leftMost);
						}
						else {
							parentNode.setRight(leftMost);
						}
						leftMostParent.setLeft(null);
						leftMost.setRight(rightSubTree);
					}
				}
				return true;
			}
		}
		return false;
	}
	
	
	/*
	 * To list all the nodes in Binary Search Tree
	 */
	public void traversal() {
		traversal(root);
	}
	
	private void traversal(Node tempNode) {
		if(tempNode == null) {
			return;
		}
		System.out.print(tempNode.getValue()+" ");
		traversal(tempNode.getLeft());
		traversal(tempNode.getRight());		
	}	
	
	public static void main(String args[]) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(9);
		bst.insert(4);
		bst.insert(6);
		bst.insert(20);
		bst.insert(170);
		bst.insert(15);
		bst.insert(1);
		bst.insert(50);
		bst.traversal();
		System.out.println();
		System.out.println(bst.remove(9));
		bst.traversal();
		System.out.println(bst.remove(20));
		bst.traversal();
		System.out.println(bst.remove(4));
		bst.traversal();
	}
	
}
