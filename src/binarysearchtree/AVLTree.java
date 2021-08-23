package binarysearchtree;

public class AVLTree {
	
	private Node root;

	public boolean insert(int value) {
		
		if(root == null) {
			Node root = new Node(value);
			this.setRoot(root);
		}
		
		if(!contains(value)) {
			
		}

		return false;
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
		
		return true;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

}
