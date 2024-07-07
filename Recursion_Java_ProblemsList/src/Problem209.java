import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 整数で構成される二分木の根ノード root が与えられるので、逆間順を表す配列を返す、reverseInorderTraversal という関数を作成してください。
 */
public class Problem209 {
	public static int[] reverseInorderTraversal(BinaryTree<Integer> root){
		if(root == null) return new int[0];

		List<Integer> result = new ArrayList<Integer>();
		if(root.right != null){
			result.addAll(Arrays.stream(reverseInorderTraversal(root.right)).boxed().collect(Collectors.toList()));
		}
		result.add(root.data);
		if(root.left != null){
			result.addAll(Arrays.stream(reverseInorderTraversal(root.left)).boxed().collect(Collectors.toList()));
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
