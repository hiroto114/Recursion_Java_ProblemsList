/*
 * 二分木の構造をオブジェクトを使って定義し、
 * 根ノードが 10、子（左）が 6、子（右）が 8 の二分木を作成し、テストケースを出力してみましょう。
 */
public class Problem458 {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree(10);
		BinaryTree node2 = new BinaryTree(6);
		BinaryTree node3 = new BinaryTree(8);

		binaryTree.left = node2;
		binaryTree.right = node3;

		System.out.println(binaryTree.data);
		System.out.println(binaryTree.left.data);
		System.out.println(binaryTree.right.data);
	}
}

class BinaryTree {
	public int data;
	// 左二分木
	public BinaryTree left;
	// 右二分木
	public BinaryTree right;

	public BinaryTree(int data) {
		this.data = data;
	}
}
