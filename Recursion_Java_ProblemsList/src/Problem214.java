/*
 * 異なる整数値で構成される二分探索木（BST）の根ノード root と整数 key が与えられるので、
 * key を BST に挿入する bstInsert という関数を作成してください。
 * もし key がすでに BST 内に存在する場合は何もせず、根ノードをそのまま返してください。
 */
public class Problem214 {
	// 異なる整数値で構成される2分探索木の途中にkey(int)を投入する。
	// しかし、同じ値があれば何もせずに根ノードを返却する。
	public static BinaryTree<Integer> bstInsert(BinaryTree<Integer> root, int key){
		BinaryTree<Integer> pointer = root;
		while(true){
			if(pointer.data == key){
				break;
			}
			if(pointer.left != null){
				if(pointer.data > key){
					pointer = pointer.left;
					continue;
				}
			}
			if(pointer.right != null){
				if(pointer.data < key){
					pointer = pointer.right;
					continue;
				}
			}
			// ルートノードの左側とkey(int)を比較。
			if(pointer.left == null){
				if(pointer.data > key){
					pointer.left = new BinaryTree<Integer>(key);
					break;
				}
			}
			// ルートノードの右側とkey(int)を比較。
			if(pointer.right == null){
				if(pointer.data < key){
					pointer.right = new BinaryTree<Integer>(key);
					break;
				}
			}
		}

		return root;
	}
}
