/*
 * 二分探索木の根ノード root と値 target が与えられるので、与えられた値と等しいノードの部分木を返す、
 * findSubtree という関数を作成してください。
 * そのようなノードが存在しない場合は null を返してください。出力は null ではなく、[] になることに注意してください。
 */
public class Problem292 {
	public static BinaryTree<Integer> findSubtree(BinaryTree<Integer> root, int target){
		if(root == null) return null;
		BinaryTree<Integer> pointer = root;
		while(pointer != null){
			if(pointer.data < target){
				pointer = pointer.right;
				continue;
			}
			if(pointer.data > target){
				pointer = pointer.left;
				continue;
			}
			if(pointer.data == target){
				return pointer;
			}
		}
		return null;
	}
}
