import java.util.Arrays;

/*
 * 整数で構成される昇順ソート済みの配列 intArr が与えられるので、各要素を 2 乗し昇順に並べかえた配列を返す、sortedSquared という関数を作成してください。
 * チャレンジ : 時間計算量 O(n) で解いてみましょう。
 */
public class Problem254 {
	public static int[] sortedSquared(int[] intArr){
		int[] result = new int[intArr.length];

		for(int i=0;i<intArr.length;i++){
			result[i] = intArr[i]*intArr[i];
		}

		Arrays.sort(result);
		return result;
	}
}
