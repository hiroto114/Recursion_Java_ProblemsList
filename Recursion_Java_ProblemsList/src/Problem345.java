import java.util.ArrayList;
import java.util.List;

/*
 * 二分木 root が与えられるので、各階層の一番右側にあるノードを返す、rightLevelNode という関数を作成してください。
 */
public class Problem345 {
    // 二分木 root が与えられるので、各階層の一番右側にあるノードを返す
    public static int[] rightLevelNode(BinaryTree<Integer> root){
        List<Integer> result = new ArrayList<Integer>();
        List<BinaryTree<Integer>> countParent = new ArrayList<BinaryTree<Integer>>();
        List<BinaryTree<Integer>> countChild  = new ArrayList<BinaryTree<Integer>>();
        
        result.add(root.data);
        countParent.add(root);
        while(countParent.size() > 0){
            for(BinaryTree<Integer> parent: countParent){
                if(parent.left != null)  countChild.add(parent.left);
                if(parent.right != null) countChild.add(parent.right);
            }
            if(countChild.size() > 0) result.add(countChild.get(countChild.size()-1).data);
            countParent = new ArrayList<BinaryTree<Integer>>(countChild);
	    countChild.clear();
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
