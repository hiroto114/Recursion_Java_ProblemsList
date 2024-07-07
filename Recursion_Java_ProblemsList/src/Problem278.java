import java.util.ArrayList;
import java.util.List;

/*
 * 二分木が与えられるので、完全二分木（complete binary tree）かどうか判定する、isCompleteBinaryTree という関数を作成してください。
 * 完全二分木とは、最下層を除いてすべての深さがノードで満たされ、最下層の葉ノードが可能な限り左に寄せられているような木のことを指します。
 */
public class Problem278 {
	public static boolean isCompleteBinaryTree(BinaryTree<Integer> root){
		if(root == null) return true;
		int btDepth = calculateBTDepth(root);
		List<BinaryTree<Integer>> queue = new ArrayList<BinaryTree<Integer>>();
		queue.add(root);
		List<BinaryTree<Integer>> deeperQueue = new ArrayList<BinaryTree<Integer>>();
		int depthIndex = 0;
		while(depthIndex < btDepth){
			depthIndex += 1;
			for(BinaryTree<Integer> queuePointer: queue){
				if(queuePointer == null){
					deeperQueue.add(null);
					deeperQueue.add(null);
				}
				if(queuePointer != null){
					deeperQueue.add(queuePointer.left);
					deeperQueue.add(queuePointer.right);
				}
			}
			if(!isFullOfNodes(deeperQueue, depthIndex, btDepth)) return false;
			queue = deeperQueue;
			deeperQueue = new ArrayList<BinaryTree<Integer>>();
		}
		return true;
	}
	public static int calculateBTDepth(BinaryTree<Integer> root){
		if(root == null) return 0;
		int result = 0;
		if(root.left != null) result = calculateBTDepth(root.left) + 1;
		if(root.right != null) result = Math.max(result, calculateBTDepth(root.right) + 1);
		return result;
	}
	public static boolean isFullOfNodes(List<BinaryTree<Integer>> layer, int depthIndex, int btDepth){
		if(depthIndex ==  btDepth){
			while(layer.get(layer.size() - 1) == null){
				layer.remove(layer.size() - 1);
			}
		}
		for(BinaryTree<Integer> pointer: layer){
			if(pointer == null) return false;
		}
		return true;
	}
}
