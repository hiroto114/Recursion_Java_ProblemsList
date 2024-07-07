import java.util.Arrays;

/*
 * 整数によって構成される intArr と整数 k（0 < k <= intArr.length）が与えられるので、
 * 配列から k 個の最大値を返す、topKElements という関数を作成してください。
 */
public class Problem219 {
	public static int[] topKElements(int[] intArr, int k){
		Arrays.sort(intArr);
		int[] result = new int[k];
		for(int i=0;i<result.length;i++){
			result[i] = intArr[intArr.length-1-i];
		}

		return result;
	}
}
