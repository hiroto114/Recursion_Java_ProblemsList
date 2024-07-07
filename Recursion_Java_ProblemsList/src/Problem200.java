/*
 * 二分探索木内のキー
 * 異なる整数値で構成される二分探索木（BST）の根ノード root と整数 key が与えられるので、
 * key が BST の中に存在するかどうか判定する exist という関数を作成してください。
 * key が BST の中に存在していれば true を、そうでなければ false を返してください。
 */
public class Problem200 {
	public static boolean exists(BinaryTree<Integer> root, int key) {
		BinaryTree<Integer> iterator = root;
		while (iterator != null) {
			if (iterator.data == key)
				return true;
			// 現在のノードよりキーが小さければ左に、大きければ右に辿ります。
			if (iterator.data > key)
				iterator = iterator.left;
			else
				iterator = iterator.right;
		}

		return false;
	}
}
