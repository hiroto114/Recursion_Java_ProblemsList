/*
 * 二分木 root が与えられるので、最小の深さを返す、minDepth という関数を作成してください。ここでの最小の深さとは、根ノードから最も近い葉ノードまでのノード数を指します。
 */
public class Problem277 {
	public static int minDepth(BinaryTree<Integer> root){
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 0;
		return 1 + Math.min(minDepth(root.left) , minDepth(root.right));
	}
}
