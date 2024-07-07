import java.util.ArrayList;
import java.util.List;

/*
 * 二分木 root が与えられるので、すべてのノードが同じ値を持つ場合に true、そうでない場合に false を返す、treeWithTheSameValue という関数を作成してください。
 */
public class Problem282 {
	public static boolean treeWithTheSameValue(BinaryTree<Integer> root){
		if(root == null) return true;
		List<BinaryTree<Integer>> queue = new ArrayList<BinaryTree<Integer>>();
		queue.add(root);
		int rootValue = root.data.intValue();
		BinaryTree<Integer> pointer = null;
		while(queue.size() > 0){
			pointer = queue.remove(0);
			if(pointer.data.intValue() != rootValue) return false;
			if(pointer.left != null) queue.add(pointer.left);
			if(pointer.right != null) queue.add(pointer.right);
		}
		return true;
	}
}
