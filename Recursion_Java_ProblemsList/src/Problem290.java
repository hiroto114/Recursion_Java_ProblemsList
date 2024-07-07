/*
 * 0 から 9 までの数字のみを含む二分木 root が与えられるので、
 * 根ノードから葉ノードへの経路をそれぞれ数字を表すことによって、全ての経路の合計値を返す、addPaths という関数を作成してください。
 */
public class Problem290 {
	// 全ての経路の合計値を返す
	public static int addPaths(BinaryTree<Integer> root){
		return addPathsHelper(root, "");
	}
	public static int addPathsHelper(BinaryTree<Integer> root, String input){
		if(root == null){
			if(input.equals("")) return 0;
			return Integer.valueOf(input);
		}
		if(root.left == null && root.right == null){
			return Integer.valueOf(input + String.valueOf(root.data));
		}
		int result = 0;
		if(root.left != null) result += addPathsHelper(root.left, input + String.valueOf(root.data));
		if(root.right != null) result += addPathsHelper(root.right, input + String.valueOf(root.data));
		return result;
	}
}
