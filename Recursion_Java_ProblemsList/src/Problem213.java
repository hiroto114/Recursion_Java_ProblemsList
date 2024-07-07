import java.util.ArrayList;
import java.util.List;

/*
 * 二分木 root が与えられるので、階層ごとに左->右で配列で返す、levelOrderTraversal という関数を作成してください。
 */
public class Problem213 {
	public static Integer[] levelOrderTraversal(BinaryTree<Integer> root) {
		if (root == null)
			return new Integer[] { null };
		List<Integer> result = new ArrayList<Integer>();
		List<BinaryTree<Integer>> cache = new ArrayList<BinaryTree<Integer>>();
		BinaryTree<Integer> pointer = null;
		cache.add(root);
		while (cache.size() > 0) {
			pointer = cache.remove(0);
			if (pointer == null) {
				result.add(null);
			}
			if (pointer != null) {
				result.add(pointer.data);
				cache.add(pointer.left);
				cache.add(pointer.right);
			}
		}
		while (result.size() > 0 && result.get(result.size() - 1) == null) {
			result.remove(result.size() - 1);
		}
		return result.stream().toArray(Integer[]::new);
	}
}
