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
        // 間順探索で得られたノードの値のリスト
        List<BinaryTree<Integer>> inorderList = inorderTraversal(root);

        // デバッグ用にリストの中身を表示
        System.out.println("Inorder Traversal Result: " + inorderList);

        // key をリスト内で探し、その次の値を返す
        for (int i = 0; i < inorderList.size() - 1; i++) { // 最後の要素を超えないようにループ
            if (inorderList.get(i).data == key) {
                return inorderList.get(i + 1); // 一つ後の値を返す
            }
        }

        // 後続ノードが見つからない場合は null を返す
        return null;
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
}
