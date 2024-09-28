import java.util.Arrays;
/*
 * 自然数によって構成される配列が与えられるので、
 * 連続した2つの部分配列の合計が同じになるように分割可能かどうか返す、canBeSplitという関数を作成してください。
 * 
 * canBeSplit([1]) --> false
 * canBeSplit([3,3]) --> true
 * canBeSplit([3,5,3]) --> false
 * canBeSplit([5,1,2,2]) --> true
 * canBeSplit([628,137,837,545,587,853]) --> false
 * canBeSplit([5,5,1,3,3,11]) --> true
 * canBeSplit([10,5,6,1,2,3,4,5,6]) --> true
 * canBeSplit([628,137,837,545,587,853]) --> false
 * canBeSplit([1,1,1,1,1,1]) --> true
 * canBeSplit([10,1,1,1,1,1,1,1,1,1,1]) --> true
 * canBeSplit([4,9,3,7,9,13]) --> false
 * 
 */
public class Problem348 {
    public static void main(String[] args) {
        System.out.println(canBeSplit(new int[]{1}) == false);
        System.out.println(canBeSplit(new int[]{3, 3}) == true);
        System.out.println(canBeSplit(new int[]{3, 5, 3}) == false);
        System.out.println(canBeSplit(new int[]{5, 1, 2, 2}) == true);
        System.out.println(canBeSplit(new int[]{628, 137, 837, 545, 587, 853}) == false);
        System.out.println(canBeSplit(new int[]{5, 5, 1, 3, 3, 11}) == true);
        System.out.println(canBeSplit(new int[]{10, 5, 6, 1, 2, 3, 4, 5, 6}) == true);
        System.out.println(canBeSplit(new int[]{1, 1, 1, 1, 1, 1}) == true);
        System.out.println(canBeSplit(new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}) == true);
        System.out.println(canBeSplit(new int[]{4, 9, 3, 7, 9, 13}) == false);
    }
    /**
     * 左側の要素の一番右側が0番目、1番目、、、、、n-2番目だったときを計算する
     * 時間計算量O(n)、空間計算量O(1)で解ける。
     */
	public static boolean canBeSplit(int[] arr){
	    if(arr.length <= 1) return false;
	    int sum = Arrays.stream(arr).sum();
	    int left = 0;
	    for(int i=0;i<arr.length-1;i++){
	        left += arr[i];
	        if(left == sum - left) return true;
	    }
	    return false;
	}
}
