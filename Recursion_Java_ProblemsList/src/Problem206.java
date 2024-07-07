import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 整数で構成される二分木の根ノード root が与えられるので、
 * 前順を表す配列を返す、preOrderTraversal という関数を作成してください。
 */
public class Problem206 {
	public static int[] preorderTraversal(BinaryTree<Integer> root){
		if(root == null) return new int[0];

		List<Integer> result = new ArrayList<Integer>();
		result.add(root.data);
		if(root.left != null) result.addAll(Arrays.stream(preorderTraversal(root.left)).boxed().collect(Collectors.toList()));
		if(root.right != null) result.addAll(Arrays.stream(preorderTraversal(root.right)).boxed().collect(Collectors.toList()));
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
