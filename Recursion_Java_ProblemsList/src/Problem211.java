/*
 * 二分木 root が与えられるので、それが左右対称かどうかを確かめる、symmetricTree という関数を作成してください。
 */
public class Problem211 {
    /** 二分木（root）が左右対称か判定 */
    public static boolean symmetricTree(BinaryTree<Integer> root){
        if(root == null) return true;
        return symmetricTreeHelper(root.left, root.right);
    }
    public static boolean symmetricTreeHelper(BinaryTree<Integer> left, BinaryTree<Integer> right){
        if(left == null && right == null) return true;
        if(left == null && right != null) return false;
        if(left != null && right == null) return false;
        if(left.data.intValue() != right.data.intValue()) return false;
        return symmetricTreeHelper(left.left, right.right) && symmetricTreeHelper(left.right, right.left);
    }
}
