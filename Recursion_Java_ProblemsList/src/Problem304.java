/*
 * 完全二分木（complete binary tree）が与えられるので、ノードの数を返す、countNodes という関数を作成してください。
 */
public class Problem304 {
	public static int countNodes(BinaryTree<Integer> root){
		if(root == null) return 0;
		int count = 1;
		if(root.left != null) count += countNodes(root.left);
		if(root.right != null) count += countNodes(root.right);

		return count;
	}
}
