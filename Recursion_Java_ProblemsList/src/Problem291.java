import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 二分探索木の根ノード root と target が与えられるので、
 * 二分探索木内の任意の 2 つのノードの和が target に一致する場合 true を、
 * そのようなノードが存在しない場合 false を返す、twoSumBst という関数を作成してください。
 */
public class Problem291 {
	public static boolean twoSumBst(BinaryTree<Integer> root, int target){
		int[] count = inorderTraversal(root);
		if(count.length <= 1) return false;
		for(int i=0;i<=count.length-2;i++){
			for(int m=i+1;m<=count.length-1;m++){
				if(count[i] + count[m] == target){
					return true;
				}
			}
		}
		return false;
	}
	public static int[] inorderTraversal(BinaryTree<Integer> root){
		if(root == null) return new int[0];

		List<Integer> result = new ArrayList<Integer>();
		if(root.left != null){
			result.addAll(Arrays.stream(inorderTraversal(root.left)).boxed().collect(Collectors.toList()));
		}
		result.add(root.data);
		if(root.right != null){
			result.addAll(Arrays.stream(inorderTraversal(root.right)).boxed().collect(Collectors.toList()));
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
