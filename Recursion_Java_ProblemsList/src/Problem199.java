/*
 * 二分探索木内探索
 * 二分探索木（BST）の根ノード root と整数 key が与えられるので、key と等しい部分木の根ノードを返す、bstSearch という関数を作成してください。
 * そのようなノードが存在しない場合は、null を返してください。
 */
class BinaryTree<E>{
    public E data;
    public BinaryTree<E> left;
    public BinaryTree<E> right;

    public BinaryTree() {}
    public BinaryTree(E data) { this.data = data; }
    public BinaryTree(E data, BinaryTree<E> left, BinaryTree<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class Problem199 {
    public static BinaryTree<Integer> bstSearch(BinaryTree<Integer> root, int key){
        BinaryTree<Integer> iterator = root;
        while(iterator != null){
            if(iterator.data == key) return iterator;
            if(iterator.data < key) iterator = iterator.right;
            else iterator = iterator.left;
        }
        return null;
    }
}
