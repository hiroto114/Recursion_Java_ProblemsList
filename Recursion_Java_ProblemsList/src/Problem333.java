/*
 * 0 以上の整数によって構成される配列 arr が与えられるので、XOR が奇数となるペアの数を返す、pairsOfOddXOR という関数を作成してください。
 */
public class Problem333 {
	public static int pairsOfOddXOR(int[] arr){
		int result = 0;

		for(int i=0;i<arr.length-1;i++){
			for(int m=i+1;m<arr.length;m++){
				if((arr[i]^arr[m])%2==1){
					result += 1;
				}
			}
		}

		return result;
	}
}
