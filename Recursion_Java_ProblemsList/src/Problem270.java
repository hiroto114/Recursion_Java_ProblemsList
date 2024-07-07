/*
 * 二分木 root が与えられるので、それを反転する、invertTree という関数を作成してください。
 */
public class Problem270 {
	public static BinaryTree<Integer> invertTree(BinaryTree<Integer> root){
		// ベースケース
		if (root == null) return null;
		// 左右の部分木をスワップ
		BinaryTree<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;

		// 左右の子を入れて自身を呼び出し再帰します。
		invertTree(root.right);
		invertTree(root.left);

		return root;
	}
}
