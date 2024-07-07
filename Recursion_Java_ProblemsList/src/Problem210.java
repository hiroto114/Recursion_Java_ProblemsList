/*
 * 二分木 root が与えられるので、最大の深さを返す、maximumDepth という関数を作成してください。
 * ここでの最大の深さとは、根ノードから最も遠い葉ノードまでの最長経路に沿ったノードの数を指します。
 */
public class Problem210 {
    public static int maximumDepth(BinaryTree<Integer> root){
        int result = 0;
        if(root.left != null)  result = maximumDepth(root.left) + 1;
        if(root.right != null) result = Math.max(result,maximumDepth(root.right) + 1);
        return result;
    }
}
