package trees;

class Node {
	
	private Node left;
	private Node right;
	private int value;
	
	public Node(int value) {
		this.value = value;
	}
	
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

public class BinaryTree {
	
	public static void main(String args[]) {
		Node root = new Node(10);
		root.setLeft(new Node(20));
		root.setRight(new Node(30));
		root.getLeft().setRight(new Node(40));
	}

}
