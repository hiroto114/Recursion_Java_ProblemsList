import java.util.ArrayList;
import java.util.List;

/*
 * 0 と 1 によって構成される二分木の根ノードが与えられるので、1 を含まない全ての部分木を削除した木を返す、deleteSubtreeWithZero という関数を作成してください。
 */
public class Problem280 {
	// ここで再帰を展開する。
	public static BinaryTree<Integer> deleteSubtreeWithZero(BinaryTree<Integer> root){
		if(!includeOne(root)) return null;
		List<BinaryTree<Integer>> queue = new ArrayList<BinaryTree<Integer>>();
		queue.add(root);
		BinaryTree<Integer> pointer = null;
		while(queue.size() > 0){
			pointer = queue.remove(0);
			if(!includeOne(pointer.left)) pointer.left = null;
			if(!includeOne(pointer.right)) pointer.right = null;
			if(pointer.left != null) queue.add(pointer.left);
			if(pointer.right!= null) queue.add(pointer.right);
		}
		return root;
	}
	// 2分木に1が含まれているか判定する。再帰で。 
	public static boolean includeOne(BinaryTree<Integer> root){
		if(root == null) return false;
		if(root.data.intValue() == 1) return true;
		return includeOne(root.left) || includeOne(root.right);
	}
}
