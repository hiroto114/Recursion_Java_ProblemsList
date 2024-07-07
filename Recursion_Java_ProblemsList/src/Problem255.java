/*
 * 自然数 x と自然数で構成される配列 intArr が与えられるので、
 * 配列の中の任意の要素を組み合わせて、合計が x になる組み合わせの数を返す、numberOfWaysX という関数を作成してください。ただし、配列の中の同じ要素は何度も使用して構いません。
 * 
 * 例えば、4 と [1,2] が与えられた時、1 と 2 を利用して 4 になる組み合わせは、以下の通りになります。
 * 
 * 1 + 1 + 1 + 1
 * 1 + 1 + 2
 * 1 + 2 + 1
 * 2 + 1 + 1
 * 2 + 2
 * チャレンジ : 時間計算量 O(n2) で解いてみましょう。
 * 
 */
public class Problem255 {
	// 動的計画法
	public static int numberOfWaysX(int x, int[] intArr){
		int[] result = new int[x + 1];
		for(int arr: intArr){
			if(arr <= result.length - 1) result[arr] = 1;
		}
		for(int i=1;i<=result.length-1;i++){
			for(int arr: intArr){
				if(i + arr < result.length) result[i + arr] += result[i];
			}
		}
		return result[result.length-1];
	}
}
