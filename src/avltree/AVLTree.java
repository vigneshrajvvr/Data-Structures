package avltree;

public class AVLTree {

	private BinaryNode root;

	public AVLTree() {
		root = null;
	}
	
	public void insert(int value) {
		
	}

	public BinaryNode createNode(int value) {
		BinaryNode node = new BinaryNode();
		node.setValue(value);
		node.setHeight(0);
		return node;
	}

}
