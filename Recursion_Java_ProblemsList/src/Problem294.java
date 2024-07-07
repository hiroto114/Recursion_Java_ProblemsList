import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 二分木の根ノード root が与えられるので、階層のノードの全ての値の合計が最大となるような最小の階層を返す、
 * findMaxLevel という関数を作成してください。ただし、根ノードの階層を 1 とします。
 * 
 * findMaxLevel( toBinaryTree([1,2,3]) )--> 2 
 * findMaxLevel( toBinaryTree([2,8,1,8,-7,null,null]) )--> 2 
 * findMaxLevel( toBinaryTree([8,9,11,15,null,null,12]) )--> 3 
 * findMaxLevel( toBinaryTree([507,172,270,421,177,482,92,15,208]) )--> 3 
 * findMaxLevel( toBinaryTree([100,9,10,4,9,1,5,11,null,3,2,null,null,null,1]) )--> 1 
 * findMaxLevel( toBinaryTree([945,679,554,943,756,731,335,17,74,176,725,515,216,650,669,452]) )--> 4 
 */
public class Problem294 {
	public static int findMaxLevel(BinaryTree<Integer> root){
		List<Integer> countSum = new ArrayList<Integer>();
		// memorizedNodeに対して合計値を出して、countSumにaddする。
		List<BinaryTree<Integer>> memorizedNode = new ArrayList<BinaryTree<Integer>>();
		// 上記リストの各要素の子ノードをmemorizedNode1に一時的に保持する。
		// 名前が糞だけどあとで何とかする
		List<BinaryTree<Integer>> memorizedNode1 = new ArrayList<BinaryTree<Integer>>();
		memorizedNode.add(root);
		int count = 0; // 各階層の合計値を保持しておくための変数。
		while(memorizedNode.size() > 0){
			count = 0;
			for(BinaryTree<Integer> i:memorizedNode){
				if(i != null){
					count += i.data;
					if(i.left  != null) memorizedNode1.add(i.left);
					if(i.right != null) memorizedNode1.add(i.right);
				}
			}
			countSum.add(count);
			memorizedNode = new ArrayList<BinaryTree<Integer>>(memorizedNode1);
			memorizedNode1.clear();
		}
		return countSum.indexOf(Collections.max(countSum)) + 1;
	}
}
