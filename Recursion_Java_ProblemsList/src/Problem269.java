/*
 * 二分探索木 root1、root2 が与えられるので、2 つを合併する、mergeBST という関数を作成してください。合併のルールは以下の通りです。
 * 
 * 2 つのノードが重なっている場合は、各ノードの値を合計し、新しい値としてください
 * そうでない場合は、既存のノードがそのまま新しい木のノードとして使用されます
 */
public class Problem269 {
	public static BinaryTree<Integer> mergeBST(BinaryTree<Integer> root1, BinaryTree<Integer> root2){
		if(root1 == null && root2 == null) return null;
		BinaryTree<Integer> result = null;
		if(root1 != null && root2 == null){
			result = new BinaryTree<Integer>(root1.data);
			result.left = mergeBST(root1.left, null);
			result.right = mergeBST(root1.right, null);
		}
		if(root1 == null && root2 != null){
			result = new BinaryTree<Integer>(root2.data);
			result.left = mergeBST(null, root2.left);
			result.right = mergeBST(null, root2.right);
		}
		if(root1 != null && root2 != null){
			result = new BinaryTree<Integer>(root1.data + root2.data);
			result.left = mergeBST(root1.left, root2.left);
			result.right = mergeBST(root1.right, root2.right);
		}
		return result;
	}
}
