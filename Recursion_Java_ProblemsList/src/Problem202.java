/*
 * 異なる整数値で構成される二分探索木（BST）の根ノード root が与えられるので、
 * BST 内に存在する最大値を持つノードを返す、maximumNode という関数を作成してください。
 */
public class Problem202 {
	public static BinaryTree<Integer> maximumNode(BinaryTree<Integer> root){
		if(root==null) return null;

		BinaryTree<Integer> result = root;
		while(result.right != null){
			result = result.right;
		}
		return result;
	}
}
