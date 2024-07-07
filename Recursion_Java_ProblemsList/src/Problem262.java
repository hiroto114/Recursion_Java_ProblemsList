/*
 * 整数によって構成される配列 array が与えられるので、
 * 配列内に存在する算術配列の最大のサイズを返す、maxSubarray という関数を作成してください。
 * 算術配列とはサイズが 2 以上の配列で、連続する整数間の差が等しい配列のことです。
 * 例えば、[2,4,6,8] や [19,17,15,13] 、[1,1,1] のような配列が該当します。
 * 
 * 関数の入出力例
 * 入力のデータ型： integer[] array
 * 出力のデータ型： integer
 * maxSubarray([10,7,5,7,9,11,11]) --> 4
 * maxSubarray([1,1]) --> 2
 * maxSubarray([10,9,8,7]) --> 4
 * maxSubarray([6,6,5,6,6,6,5,6,7]) --> 3
 * maxSubarray([6,5,4,3,2,3,4,5,6,7]) --> 6
 * maxSubarray([1,2,3,5,6,7,19,20,21,22]) --> 4
 * maxSubarray([-1,-2,-3,-4,4,3,2]) --> 4
 * maxSubarray([1,3,4,7,19,100]) --> 2
 * 
 */
public class Problem262 {
	public static int maxSubarray(int[] array){
		int diff = array[1] - array[0];
		int size = 2;
		int maxSize = size;

		for(int i=2; i<array.length; i++){
			if(array[i] - array[i-1] == diff){
				size += 1;
			}else{
				diff = array[i] - array[i-1];
				size = 2;
			}
			maxSize = Math.max(maxSize, size);
		}
		return maxSize;
	}
}
