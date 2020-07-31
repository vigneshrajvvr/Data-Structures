package trees;

public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	/*
	 * To insert a node in the Binary Search Tree
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
	}
	
}
