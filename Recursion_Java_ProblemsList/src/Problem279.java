import java.util.ArrayList;
import java.util.List;

/*
 * 二分探索木（BST）の根ノードが与えられるので、
 * 全てのノードについて「ノード X の値 + 木全体でノード X より大きい値の合計」を満たすように各ノードの値を変更する sumTree という関数を作成してください。
 */
public class Problem279 {
	// ①間順探索か何かして全要素を洗い出し
	// ②各要素を幅優先探索で調べていって、自分以上のノード値の合計値を計算していく
	public static BinaryTree<Integer> sumTree(BinaryTree<Integer> root){
		if(root == null) return null;
		List<Integer> targetNodesValue = inorderTraversal(root);

		// 幅優先探索で2分探索木を全操作し、値を上書きしていく
		List<BinaryTree<Integer>> queue = new ArrayList<BinaryTree<Integer>>();
		queue.add(root);
		BinaryTree<Integer> pointer = queue.remove(0);
		while(pointer != null){
			if(pointer.left != null) queue.add(pointer.left);
			if(pointer.right!= null) queue.add(pointer.right);
			// ここからがポイント
			pointer.data = findReplaceValue(targetNodesValue
					, findTargetIndex(targetNodesValue, pointer.data.intValue()));
			if(queue.size() > 0) pointer = queue.remove(0);
			else pointer = null;
		}
		return root;
	}
	// 間順探索で2分探索木の全ノードを操作
	public static List<Integer> inorderTraversal(BinaryTree<Integer> root){
		List<Integer> result = new ArrayList<Integer>();
		if(root == null) return result;
		result.addAll(inorderTraversal(root.left));
		result.add(root.data);
		result.addAll(inorderTraversal(root.right));
		return result;
	}
	// 動的配列中にて、特定の値になっているところのインデックスを2分探索で取得（再帰）
	// でもその特定の値に重複が見られたら最小値を出したい。時間計算量をO(logN)で抑えたいのよ。
	// 今のところ2分探索でやるとその保証が出来ない。なので致し方なくfor文で頑張るしかない。
	public static int findTargetIndex(List<Integer> targetList, int targetValue){
		for(int i=0; i<targetList.size(); i++){
			if(targetList.get(i) == targetValue) return i;
		}
		return -1;
	}
	// 2分探索木にて、更新する値を計算して返す
	public static int findReplaceValue(List<Integer> targetList, int index){
		int result = 0;
		for(int i= index; i<targetList.size(); i++){
			result += targetList.get(i).intValue(); // アンボクシングは出来ない。
		}
		return result;
	}
}
