package trees;

/*
 * This solution works if the Node give is leaf node
 */

public class BurnFromLeaf {

	private int max;

	public int burnFromLeaf(Node root, Node leaf, Distance dist) {
		if (root == null) {
			return 0;
		}

		if (root == leaf) {
			dist.setValue(0);
			return 1;
		}

		Distance leftDist = new Distance(-1);
		Distance rightDist = new Distance(-1);

		int left = burnFromLeaf(root.getLeft(), leaf, leftDist);
		int right = burnFromLeaf(root.getRight(), leaf, rightDist);

		if (leftDist.getValue() != -1) {
			dist.setValue(leftDist.getValue() + 1);
			max = Math.max(max, dist.getValue() + right);
		} else {
			dist.setValue(rightDist.getValue() + 1);
			max = Math.max(max, dist.getValue() + left);
		}

		return Math.max(left, right) + 1;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}

class Distance {
	private int value;

	public Distance(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
