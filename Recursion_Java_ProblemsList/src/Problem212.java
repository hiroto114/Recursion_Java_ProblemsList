/*
 * 二分木 root が与えられるので、それが二分探索木（BST）かどうか確かめる、validateBST という関数を作成してください。ただし、有効な BST とは以下の条件を指します。
ノードの左部分木にはノードのキーより小さい値を含みます
ノードの右部分木にはノードのキーより大きい値を含みます
左右の部分木も BST である必要があります
 */
public class Problem212 {
	public static boolean validateBST(BinaryTree<Integer> root){
		return validateBSTHelper(root, null, null);
	}

	// ヘルパー関数で再帰します。
	public static boolean validateBSTHelper(BinaryTree<Integer> root, BinaryTree<Integer> min, BinaryTree<Integer> max) {
		if (root == null) return true;

		if (min != null && min.data > root.data) return false;
		if (max != null && max.data < root.data) return false;

		boolean left = root.left != null ? validateBSTHelper(root.left, min, root) : true;
		boolean right = root.right != null ? validateBSTHelper(root.right, root, max) : true; 

		return left && right;
	}
}
