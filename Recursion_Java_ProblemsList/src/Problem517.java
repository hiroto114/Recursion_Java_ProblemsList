/*
 * 整数の配列 arr と 0 以上の整数 n と m が与えられるので、
 * arr の n 番目と m 番目の要素を入れ替える swappingElements という関数を作成してください。
 * n,m が arr の長さ以上の場合はそのまま arr を返します。スワップには XOR を使いましょう。
 * 
 * swappingElements([1,2,3,4,5],2,4) --> [1,2,5,4,3]
 * swappingElements([10,20,30,40,50],1,3) --> [10,40,30,20,50]
 * swappingElements([4,11,8,3,2,6,0,6,5,3],11,2) --> [4,11,8,3,2,6,0,6,5,3]
 * swappingElements([1,2,3,4,5],100,200) --> [1,2,3,4,5]
 */
public class Problem517 {
	public static int[] swappingElements(int[] arr, int m, int n) {
		if (n >= arr.length || m >= arr.length)
			return arr;
		int temp = arr[m];
		arr[m] = arr[n];
		arr[n] = temp;

		return arr;
	}
}
