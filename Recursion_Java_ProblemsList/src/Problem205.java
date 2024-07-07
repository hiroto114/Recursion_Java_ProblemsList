/*
 * 異なる整数値で構成されるソート済みのリスト numberList が与えられるので、
 * 平衡二分探索木を作成し、その根ノードを返す、sortedArrToBST という関数を作成してください。
 */
public class Problem205 {
    public static BinaryTree<Integer> sortedArrToBST(int[] numberList){

        return sortedArrayToBSTHelper(numberList,0,numberList.length-1);
    }

    public static BinaryTree<Integer> sortedArrayToBSTHelper(int[] arr, int start, int end) {
        if(start == end) return new BinaryTree<Integer>(arr[start], null,null);
        int mid = (int) Math.floor((start+end)/2);

        BinaryTree<Integer> left = null;
        if(mid-1 >= start) left = sortedArrayToBSTHelper(arr, start, mid-1);
        BinaryTree<Integer> right = null;
        if(mid+1 <= end) right = sortedArrayToBSTHelper(arr, mid+1, end);
        BinaryTree<Integer> root = new BinaryTree<Integer>(arr[mid], left, right);

        return root;
    }

}
