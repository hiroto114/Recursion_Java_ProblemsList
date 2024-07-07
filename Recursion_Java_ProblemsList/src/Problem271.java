/*
 * 自然数で構成される二分木 root が与えられるので、祖父母ノードが偶数値を持つノードの合計を返す、totalEvenGrandparent という関数を作成してください。
 * ここでの祖父母ノードは親ノードの親ノードを指します。もし、偶数値を持つ祖父母ノードが存在しない場合、0 を返してください。
 */
public class Problem271 {
	public static int totalEvenGrandparent(BinaryTree<Integer> root){
		int result = 0;
		if(root.data % 2 == 0) result += totalEvenGrandparentHelper(root,2);
		if(root.left != null) result += totalEvenGrandparent(root.left);
		if(root.right != null) result += totalEvenGrandparent(root.right);
		return result;
	}

	// あるノードのn段階下のノードの合計値を取得するメソッド
	public static int totalEvenGrandparentHelper(BinaryTree<Integer> node,int level){
		if(node  == null) return 0;
		if(level == 0) return node.data;

		int result = 0;
		result += totalEvenGrandparentHelper(node.left ,level-1);
		result += totalEvenGrandparentHelper(node.right,level-1);

		return result;
	}
}
