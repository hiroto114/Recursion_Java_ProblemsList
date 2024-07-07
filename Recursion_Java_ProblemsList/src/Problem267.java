import java.util.ArrayList;
import java.util.List;

/*
 * 二分木 root が与えられるので、最深層に存在する葉ノードの合計値を返す、deepestLeaves という関数を作成してください。
 * 
 * deepestLeaves( toBinaryTree([3,2,1,null,7,8]) )--> 15 
 * deepestLeaves( toBinaryTree([5,8,1,10,12,8,null,null,null,null,null,9,10]) )--> 19 
 * deepestLeaves( toBinaryTree([5,2,18,4,3]) )--> 7 
 * deepestLeaves( toBinaryTree([27,14,35,10,19,31,42]) )--> 102 
 * deepestLeaves( toBinaryTree([30,15,60,7,22,45,75,null,null,17,27]) )--> 44 
 * deepestLeaves( toBinaryTree([50,17,76,9,23,54,null,null,14,19,null,null,72]) )--> 105 
 * deepestLeaves( toBinaryTree([16,14,10,8,7,9,3,2,4,1]) )--> 7 
 * deepestLeaves( toBinaryTree([0,-10,5,null,-3,null,9]) )--> 6 
 * 
 */
public class Problem267 {
	public static int deepestLeaves(BinaryTree<Integer> root){
		if(root == null) return 0;
		// 上の層
		List<BinaryTree<Integer>> queue = new ArrayList<BinaryTree<Integer>>();
		queue.add(root);
		// queueの1つ下の層
		List<BinaryTree<Integer>> underQueue = new ArrayList<BinaryTree<Integer>>();
		while(!isDeepestLayer(queue)){
			for(BinaryTree<Integer> pointer: queue){
				if(pointer.left != null) underQueue.add(pointer.left);
				if(pointer.right != null) underQueue.add(pointer.right);
			}
			queue = underQueue;
			underQueue = new ArrayList<BinaryTree<Integer>>();
		}
		// ここまででqueueが一番下の層になっているのでその層の合計値を取得（nullに気を付ける）
		return calculateSumOfDTLayer(queue);
	}
	public static boolean isDeepestLayer(List<BinaryTree<Integer>> queue){
		for(BinaryTree<Integer> pointer: queue){
			if(pointer.left != null || pointer.right != null){
				return false;
			} 
		}
		return true;
	}
	public static int calculateSumOfDTLayer(List<BinaryTree<Integer>> queue){
		int result = 0;
		for(BinaryTree<Integer> pointer: queue){
			result += pointer.data.intValue();
		}
		return result;
	}
}
