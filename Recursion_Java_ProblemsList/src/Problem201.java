/*
 * 異なる整数値で構成される二分探索木（BST）の根ノード root が与えられるので、BST 内に存在する最小値を持つノードを返す、minimumNode という関数を作成してください。
 */
public class Problem201 {
	public static BinaryTree<Integer> minimumNode(BinaryTree<Integer> root){
		if(root == null) return null;

		BinaryTree<Integer> result = root;
		while(result.left != null){
			result = result.left;
		}

		return result;

	}
}
