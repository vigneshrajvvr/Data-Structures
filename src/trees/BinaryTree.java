package trees;

public class BinaryTree {
	
	public static void main(String args[]) {
		Node root = new Node(10);
		root.setLeft(new Node(20));
		root.setRight(new Node(30));
		root.getLeft().setRight(new Node(40));
		
		MaximumBinaryTree test = new MaximumBinaryTree();
		System.out.println(test.maximum(root, Integer.MIN_VALUE)); // 40
	}

}
