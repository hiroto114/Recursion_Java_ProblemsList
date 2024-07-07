import java.util.ArrayList;
import java.util.List;
/*
 * 異なる整数値で構成される二分探索木（BST）の根ノード root と BST 内に存在する整数 key が与えられるので、
 * 根ノードが後続ノードである部分木を返す、successor という関数を作成してください。
 * もし、そのようなノードが存在しない場合は null を返してください。
 * ノード N の値を x とした時、後続ノードとは木の中に存在する x よりも大きい最小の値を持つノードのことを指します。
 * 
 * この手の問題で一番下のコメントアウトしたやり方を最初に思いついたけど、全然全然再現性がない。
 * もう業務系で使えるようなわざじゃないんで、間順探索で各ノードのポインターを詰める→keyと比較していく手法が絶対再現性が高い。かつわかりやすい。
 */
public class Problem203 {
	public static BinaryTree<Integer> successor(BinaryTree<Integer> root, int key){
		if(root == null) return null;
		List<BinaryTree<Integer>> nodes = inorderTraversal(root);
		BinaryTree<Integer> result = null;
		for(BinaryTree<Integer> pointer: nodes) {
			if(pointer == null) continue;
			if(pointer.data > key) {
				if(result == null) {
					result = pointer;
					continue;
				}
				if(result.data > pointer.data) {
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
    public static BinaryTree<Integer> successor(BinaryTree<Integer> root, int key){
        if(root==null) return null;
        BinaryTree<Integer> result = findKeyNode(root,key);
        if(result.right!= null) return findMinimumNode(result.right);

        result = findSuccessorNode(root,key);
        return result;
    }

    public static BinaryTree<Integer> findKeyNode(BinaryTree<Integer> root, int key){
        BinaryTree<Integer> result = root;
        if(result==null) return null;
        while(result!= null){
            if(result.data == key) return result;
            if(result.data >  key) result = result.left;
            if(result.data <  key) result = result.right;
        }
        return null;
    }

    public static BinaryTree<Integer> findMinimumNode(BinaryTree<Integer> root){
        if(root == null) return null;
        BinaryTree<Integer> result = root;
        BinaryTree<Integer> pointer = root;
        while(pointer != null){
            if(result.data>pointer.data){
                result = pointer;
            }
            pointer = pointer.left;
        }
        return result;
    }

    public static BinaryTree<Integer> findSuccessorNode(BinaryTree<Integer> root, int key){
        BinaryTree<Integer> pointer = root;
        BinaryTree<Integer> result = null;

        while(pointer != null){
            if(pointer.data>key){
                if(result==null){
                    result = pointer;
                }else if(result.data > pointer.data){
                    result = pointer;
                }
            }
            if(pointer.data < key){
                pointer = pointer.right;
            }else{
                pointer = pointer.left;
            }
        }

        return result;
    }
	 */
}
