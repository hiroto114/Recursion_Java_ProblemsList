import java.util.ArrayList;
import java.util.List;

/*
 * 異なる整数値で構成される二分探索木（BST）の根ノード root と BST 内に存在する整数 key が与えられるので、
 * 根ノードが先行ノードである部分木を返す、predecessor という関数を作成してください。
 * もし、そのようなノードが存在しない場合は null を返してください。ノード N の値を x とした時、
 * 先行ノードとは木の中に存在する x よりも小さい最大の値を持つノードのことを指します。
 * 後続ノードと先行ノードの操作は対称的です。
 */
public class Problem204 {
	public static BinaryTree<Integer> predecessor(BinaryTree<Integer> root, int key){
		if(root == null) return null;
		List<BinaryTree<Integer>> nodes = inorderTraversal(root);
		BinaryTree<Integer> result = null;
		for(BinaryTree<Integer> pointer: nodes) {
			if(pointer == null) continue;
			if(pointer.data < key) {
				if(result == null) {
					result = pointer;
					continue;
				}
				if(result.data < pointer.data) {
					result = pointer;
				}
			}
		}
		return result;

	}
	/*
	 * 間順探索で2分探索木全体をリストに詰める→返却
	 */
	public static List<BinaryTree<Integer>> inorderTraversal(BinaryTree<Integer> input){
		if(input == null) return null;
		List<BinaryTree<Integer>> result = new ArrayList<BinaryTree<Integer>>();
		if(input.left != null) result.addAll(inorderTraversal(input.left));
		result.add(input);
		if(input.right != null) result.addAll(inorderTraversal(input.right));
		return result;
	}
	/*
    public static BinaryTree<Integer> predecessor(BinaryTree<Integer> root, int key){
        // keyのノードを探し、変数targetNodeに代入します。
        BinaryTree<Integer> targetNode = findNode(root, key);

        // keyがBST内に存在しない場合、nullを返します。
        if (targetNode == null) return null;

        // targetNodeに右側の子がある場合は、その部分木の最小値を返します。
        if (targetNode.left != null) return maximumNode(targetNode.left);

        BinaryTree<Integer> successor = null;
        BinaryTree<Integer> iterator = root;
        // rootをiteratorに代入し、探索と同じ要領でtargetNodeがiteratorよりも小さい時には左へ、大きい時は右へ進みます。
        while (iterator != null) {

            // ターゲットとiteratorのdataが同じだったら、その時のsuccessorを返します。
            if (targetNode.data == iterator.data) return successor;

            // 左側に進むときは、現在のiteratorが後続ノードである可能性があるのでsuccessorを更新します。
            if (targetNode.data > iterator.data) {
                successor = iterator;
                iterator = iterator.right;
            }
            // 右側に進むときはsuccessorを更新する必要はありません。 
            else iterator = iterator.left;
        }
        return successor;
    }

    // keyのノードを探す関数
    public static BinaryTree<Integer> findNode(BinaryTree<Integer> root, int key) {
        BinaryTree<Integer> iterator = root;

        while (iterator != null) {
            if (iterator.data == key) return iterator;
            if (iterator.data < key) iterator = iterator.right;
            else iterator = iterator.left;
        }

        return iterator;
    }

    // 最大値を探す関数
    public static BinaryTree<Integer> maximumNode(BinaryTree<Integer> root){
        BinaryTree<Integer> iterator = root;
        while (iterator != null && iterator.right != null) iterator = iterator.right;
        return iterator;
    }
	 */
}
