package trees;

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
		bst.traversal();
		System.out.println(bst.lookup(1));
	}
	
}
