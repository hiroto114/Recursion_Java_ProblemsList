
public class Problem459 {
	public static int sumOfThreeNodes(BinaryTree<Integer> root) {
		if (root == null)
			return 0;

		int result = 0;
		if (root != null) {
			result += root.data.intValue();
		}
		if (root.left != null) {
			result += root.left.data.intValue();
		}
		if (root.right != null) {
			result += root.right.data.intValue();
		}

		return result;
	}
}


