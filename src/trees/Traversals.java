package trees;

public class Traversals {
	
	/*
	 * InOrderTraversal
	 */
	public void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.getLeft());
		System.out.println(root.getValue());
		inOrderTraversal(root.getRight());
	}
	
	/*
	 * PreOrderTraversal
	 */
	public void preOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.getValue());
		inOrderTraversal(root.getLeft());
		inOrderTraversal(root.getRight());
	}
	
	/*
	 * PostOrderTraversal
	 */
	public void postOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.getLeft());
		inOrderTraversal(root.getRight());
		System.out.println(root.getValue());
	}

}
