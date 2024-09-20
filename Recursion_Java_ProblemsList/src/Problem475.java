
/*
 * 整数 x と整数によって構成される配列 arr1 と arr2 が与えられるので、
 * 2 つの配列からそれぞれ 1 個ずつ整数を選んで足した合計値として、
 * x 未満の範囲内での最大値を文字列として返す maxOfPairSum という関数を作成してください。
 * そのような値がない場合は、no pair と返してください。
 * 
 * maxOfPairSum([2,8,7],[1,5,6],10) --> 9
 * maxOfPairSum([12,8,20],[11,9,22],30) --> 29
 * maxOfPairSum([-4,-2,-5],[-1,-6,-8],-3) --> -5
 * maxOfPairSum([583,114,925,669,402,7,84,747],[655,797,905,843,652,841,893],260) --> no pair
 */
public class Problem475 {
	public static String maxOfPairSum(int[] arr1, int[] arr2, int x){
		int result = Integer.MIN_VALUE;
		for(int i=0;i<arr1.length;i++){
			for(int m=0;m<arr2.length;m++){
				if(arr1[i]+arr2[m] <x && result < arr1[i]+arr2[m]){
					result = arr1[i]+arr2[m];
				}
			}
		}

		if(result == Integer.MIN_VALUE) return "no pair";
		return String.valueOf(result);
	}
}
