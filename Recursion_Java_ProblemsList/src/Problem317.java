import java.util.ArrayList;
import java.util.List;

/*
 * 完全二分木の根ノード root、整数 n、needle が与えられるので、
 * n 番目のノードを根ノードとする部分木内に存在する needle の個数を返す、elementsInSubtree という関数を作成してください。
 */
public class Problem317 {
	public static int elementsInSubtree(BinaryTree<Integer> root, int n, int needle){
		if(n < 0) return 0;
		if(n == 0) return elementsInSubtreeHelper(root, needle);
		List<BinaryTree<Integer>> queue = new ArrayList<BinaryTree<Integer>>();
		queue.add(root);
		BinaryTree<Integer> pointer = null;

		int counter = 0;
		while(counter < n){
			counter += 1;
			pointer = queue.remove(0);
			if(pointer.left != null) queue.add(pointer.left);
			if(pointer.right!= null) queue.add(pointer.right);
		}
		return elementsInSubtreeHelper(pointer, needle);
	}

	public static int elementsInSubtreeHelper(BinaryTree<Integer> root, int needle){
		if(root == null) return 0;
		int result = 0;
		if(root.data.intValue() == needle) result += 1;
		result += elementsInSubtreeHelper(root.left, needle);
		result += elementsInSubtreeHelper(root.right,needle);
		return result;
	} 
}
