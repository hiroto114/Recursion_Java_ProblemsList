import java.util.ArrayList;
import java.util.List;

/*
 * 二分木 root が与えられるので、各階層での値の平均値を配列で返す、getAvarage という関数を作成してください。ただし、小数点以下は切り捨ててください。
 * 
 * getAvarage( toBinaryTree([6,11,25]) )--> [6,18] 
 * getAvarage( toBinaryTree([1,1,2,15,8]) )--> [1,1,11] 
 * getAvarage( toBinaryTree([6,11,25,5,9,8,4,null,null,null,null,56]) )--> [6,18,6,56] 
 * getAvarage( toBinaryTree([27,14,35,10,19,31,42]) )--> [27,24,25] 
 * getAvarage( toBinaryTree([30,15,60,7,22,45,75,null,null,17,27]) )--> [30,37,37,22] 
 * getAvarage( toBinaryTree([50,17,76,9,23,54,null,null,14,19,null,null,72]) )--> [50,46,28,35] 
 * getAvarage( toBinaryTree([16,14,10,8,7,9,3,2,4,1]) )--> [16,12,6,2] 
 */
public class Problem303 {
	// 2分木の各階層の平均値を配列にして返却する
	public static int[] getAvarage(BinaryTree<Integer> root){
		if(root == null) return new int[0];

		List<Integer> result = new ArrayList<Integer>();
		result.add(root.data);
		List<BinaryTree<Integer>> countParent = new ArrayList<BinaryTree<Integer>>();
		countParent.add(root);
		List<BinaryTree<Integer>> countChild  = new ArrayList<BinaryTree<Integer>>();
		double avg = 0;
		while(countParent.size() > 0){
			for(BinaryTree<Integer> i : countParent){
				if(i.left != null){
					countChild.add(i.left);
					avg += i.left.data;
				}
				if(i.right != null){
					countChild.add(i.right);
					avg += i.right.data;
				}
			}
			if(countChild.size() == 0) break;
			result.add((int)avg/countChild.size());
			avg = 0;
			countParent = new ArrayList<BinaryTree<Integer>>(countChild);
			countChild.clear();
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
