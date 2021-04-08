package trees;

public class MaximumBinaryTree {

	/*
	 * To find maximum element in a binary tree
	 */
	private int max;

	private Integer maximumHelper(Node root) {
		if (root == null) {
			return max;
		}

		if (max < root.getValue()) {
			max = root.getValue();
		}

		maximumHelper(root.getLeft());
		maximumHelper(root.getRight());

		return max;
	}

	public Integer maximum(Node root) {
		max = Integer.MIN_VALUE;
		return maximumHelper(root);
	}

//		if(max < root.getValue()) {
//			max = root.getValue();
//		}
//				
//		return Math.max(max, Math.max(maximum(root.getLeft(), max), maximum(root.getRight(), max)));
}

