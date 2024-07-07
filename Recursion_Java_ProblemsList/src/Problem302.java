import java.util.ArrayList;
import java.util.List;

/*
 * 二分木 root が与えられるので、最深層で最も左にある値を返す、getBottomLeft という関数を作成してください。
 * 
 * getBottomLeft( toBinaryTree([3,2,1,null,7,8]) )--> 7 
 * getBottomLeft( toBinaryTree([5,8,1,10,12,8,null,null,null,null,null,9,10]) )--> 9 
 * getBottomLeft( toBinaryTree([5,2,18,4,3]) )--> 4 
 * getBottomLeft( toBinaryTree([27,14,35,10,19,31,42]) )--> 10 
 * getBottomLeft( toBinaryTree([30,15,60,7,22,45,75,null,null,17,27]) )--> 17 
 * getBottomLeft( toBinaryTree([50,17,76,9,23,54,null,null,14,19,null,null,72]) )--> 14 
 * getBottomLeft( toBinaryTree([16,14,10,8,7,9,3,2,4,1]) )--> 2 
 */
public class Problem302 {
	// 最深層で最も左にある値を返す
	public static int getBottomLeft(BinaryTree<Integer> root){
		List<BinaryTree<Integer>> countParent = new ArrayList<BinaryTree<Integer>>();
		List<BinaryTree<Integer>> countChild  = new ArrayList<BinaryTree<Integer>>();

		countParent.add(root);
		while(countParent.size() > 0){
			for(BinaryTree<Integer> parent: countParent){
				if(parent.left != null)  countChild.add(parent.left);
				if(parent.right != null) countChild.add(parent.right);
			}
			if(countChild.size() == 0) break;
			countParent = new ArrayList<BinaryTree<Integer>>(countChild);
			countChild.clear();
		}

		return countParent.get(0).data;
	}
}
