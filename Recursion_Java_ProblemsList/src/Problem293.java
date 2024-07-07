/*
 * 二分木 root が与えられるので、左側に存在する全ての葉ノードの合計値を返す、leftLeaves という関数を作成してください。
 * 
 * leftLeaves( toBinaryTree([8,5,15,null,null,9,12]) )--> 14 
 * leftLeaves( toBinaryTree([8,5,15,null,11,9,12]) )--> 9 
 * leftLeaves( toBinaryTree([8,5,15,6,11,9,12,null,6]) )--> 9 
 * leftLeaves( toBinaryTree([8,5,15,6,11,9,12,null,null,7]) )--> 22 
 * leftLeaves( toBinaryTree([5,3,6,2,4,2,8,1]) )--> 3 
 * 
 * 【考え方】
 * ①あるノードの左子ノードが葉かどうか判定
 * ②①の結果をresultに入れる
 * ③①のノードの左、右子ノードについても同様のアプローチを採用
 * ④①～③を再帰で繰り返す
 */
public class Problem293 {
	public static int leftLeaves(BinaryTree<Integer> root){
		// ベースケース
		if(root == null) return 0;
		if(root.left == null) return 0;

		// カーソルを当てているノードに対して下記操作を実施
		int result = 0;
		if(root.left.left == null && root.left.right == null){
			result += root.left.data;
		}
		// 上記に対するleft、rightで再帰実施
		result += leftLeaves(root.left);
		result += leftLeaves(root.right);
		// 最後に下記計算結果を返す
		return result;
	}
}
