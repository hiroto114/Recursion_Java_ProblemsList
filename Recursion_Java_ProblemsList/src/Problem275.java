import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 二分探索木 root1、root2 が与えられるので、2 つに含まれる全ての整数を昇順でリストとして返す、allElementsSorted いう関数を作成してください。
 */
public class Problem275 {
	public static int[] allElementsSorted(BinaryTree<Integer> root1, BinaryTree<Integer> root2){
		List<Integer> result = new ArrayList<Integer>();
		preorderTraversal(root1,result);
		preorderTraversal(root2,result);
		Collections.sort(result);

		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void preorderTraversal(BinaryTree<Integer> root,List<Integer> result){
		if(root == null){
		}else{
			result.add(root.data);
			if(root.left != null){
				preorderTraversal(root.left,result);
			}
			if(root.right != null){
				preorderTraversal(root.right,result);
			}
		}
	}
}
