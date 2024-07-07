import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 整数で構成される二分木の根ノード root が与えられるので、間順を表す配列を返す、inorderTraversal という関数を作成してください。
 */
public class Problem207 {
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
