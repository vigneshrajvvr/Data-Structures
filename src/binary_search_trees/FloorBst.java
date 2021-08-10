package binary_search_trees;

public class FloorBst {
	
	/*
	 * To find floor of Binary Search Tree   
	 */

	public Node floor(Node root, Node temp, int val) {
		Node traversalNode = root;

		while (traversalNode != null) {
			if (traversalNode.getValue() == val) {
				temp = root;
				break;
			} else if (val < traversalNode.getValue()) {
				traversalNode = traversalNode.getLeft();
			} else {
				temp = traversalNode;
				traversalNode = traversalNode.getRight();
			}
		}

		return temp;
	}

	public static void main(String args[]) {

	}

}
