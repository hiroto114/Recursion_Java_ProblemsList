import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 二分探索木 root が与えられるので、n 番目に小さい値を返す、findNSmallest という関数を作成してください。
 */
public class Problem316 {
	public static int findNSmallest(BinaryTree<Integer> root, int n){
		return preorderTraversal(root)[n-1];
	}

	public static int[] preorderTraversal(BinaryTree<Integer> root){
		if(root == null) return new int[0];

		List<Integer> result = new ArrayList<Integer>();
		if(root.left != null){
			result.addAll(Arrays.stream(preorderTraversal(root.left)).boxed().collect(Collectors.toList()));
		}
		result.add(root.data);
		if(root.right != null){
			result.addAll(Arrays.stream(preorderTraversal(root.right)).boxed().collect(Collectors.toList()));
		}
		return result.stream().mapToInt(Integer::intValue).toArray();

	}
}
