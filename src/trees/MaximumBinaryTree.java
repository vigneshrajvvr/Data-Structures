package trees;

public class MaximumBinaryTree {
	
	/*
	 * To find maximum element in a binary tree
	 */
	public Integer maximum(Node root, Integer max) {
		if(root == null) {
			return max;
		}
		
		if(max < root.getValue()) {
			max = root.getValue();
		}
				
		return Math.max(max, Math.max(maximum(root.getLeft(), max), maximum(root.getRight(), max)));
	}

}
