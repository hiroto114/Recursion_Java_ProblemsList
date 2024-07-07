import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 整数で構成される二分木の根ノード root が与えられるので、後順を表す整数の配列を返す、postorderTraversal という関数を作成してください。
 */
public class Problem208 {
	public static int[] postorderTraversal(BinaryTree<Integer> root){
		if(root == null) return new int[0];

		List<Integer> result = new ArrayList<Integer>();
		if(root.left != null){
			result.addAll(Arrays.stream(postorderTraversal(root.left)).boxed().collect(Collectors.toList()));
		}
		if(root.right != null){
			result.addAll(Arrays.stream(postorderTraversal(root.right)).boxed().collect(Collectors.toList()));
		}
		result.add(root.data);
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
