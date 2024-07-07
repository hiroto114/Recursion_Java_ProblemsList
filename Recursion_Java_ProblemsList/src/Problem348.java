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
	public static boolean canBeSplit(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(canBeSplitHelper(arr,0,i) == canBeSplitHelper(arr,i+1,arr.length-1)){
				return true;
			}
		}
		return false;
	}

	public static int canBeSplitHelper(int[] arr,int start,int end){
		int result = 0;
		for(int i=start;i<=end;i++){
			result += arr[i];
		}
		return result;
	}
}
