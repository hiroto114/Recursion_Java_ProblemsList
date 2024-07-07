import java.util.ArrayList;
import java.util.List;

/*
 * 二分木の根ノード root が与えられるので、各階層の最大値を配列で返す、maxValueAtEachLevel という関数を作成してください。
 */
public class Problem315 {
	public static int[] maxValueAtEachLevel(BinaryTree<Integer> root){
		if(root == null) return new int[0];
		List<Integer> result = new ArrayList<Integer>();
		result.add(root.data);
		List<BinaryTree<Integer>> countParent = new ArrayList<BinaryTree<Integer>>();
		countParent.add(root);
		List<BinaryTree<Integer>> countChild  = new ArrayList<BinaryTree<Integer>>();
		int intResult = 1;
		while(countParent.size() > 0){
			for(BinaryTree<Integer> i : countParent){
				if(i.left != null){
					countChild.add(i.left);
					if(i.left.data > intResult) intResult = i.left.data;
				}
				if(i.right != null){
					countChild.add(i.right);
					if(i.right.data > intResult) intResult = i.right.data;
				}
			}
			if(countChild.size() == 0) break;
			result.add(intResult);
			countParent = new ArrayList<BinaryTree<Integer>>(countChild);
			countChild.clear();
			intResult = 1;
		}
		return result.stream().mapToInt(Integer::intValue).toArray();        
	}
}
