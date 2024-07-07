/*
 * 0 と 1 によって構成される二分木の根ノード root が与えられるので、
 * 根ノードから各葉ノードまでの経路を 2 進数としたとき、全ての 2 進数の合計値を返す、sumBinaryNumber という関数を作成してください。
 * 
 * sumBinaryNumber( toBinaryTree([1]) )--> 1 
 * sumBinaryNumber( toBinaryTree([0]) )--> 0 
 * sumBinaryNumber( toBinaryTree([1,1]) )--> 3 
 * sumBinaryNumber( toBinaryTree([1,0,1,1,0,1,1]) )--> 23 
 * sumBinaryNumber( toBinaryTree([1,0,1,1,0,1,1,0,1,null,1,null,null,0]) )--> 51
 * 
 */
public class Problem305 {
	public static int sumBinaryNumber(BinaryTree<Integer> root){
		return sumBinaryNumberHelper(root, "");
	}
	public static int sumBinaryNumberHelper(BinaryTree<Integer> root, String input){
		if(root.left == null && root.right == null) return Integer.parseInt(input + String.valueOf(root.data), 2);
		int result = 0;
		if(root.left != null)  result += sumBinaryNumberHelper(root.left,  input + String.valueOf(root.data));
		if(root.right != null) result += sumBinaryNumberHelper(root.right, input + String.valueOf(root.data));
		return result;
	}
}
