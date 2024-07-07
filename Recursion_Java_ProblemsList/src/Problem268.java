/*
 * 二分木 root1、root2 が与えられるので、それらが同じかどうか調べる、isSameTree という関数を作成してください。
 * 2 つの二分木が構造的に等しく、かつ各ノードの値が同じであれば、2 つは同じとみなされます。
 * 
 * 【感想】再帰は美しい。
 */
public class Problem268 {
	public static boolean isSameTree(BinaryTree<Integer> root1, BinaryTree<Integer> root2){
		if(root1 == null && root2 == null) return true;
		if(root1 != null && root2 == null) return false;
		if(root1 == null && root2 != null) return false;
		if(root1.data != root2.data) return false;
		return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
	}
}
