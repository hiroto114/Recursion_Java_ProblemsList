/*
 * 自然数 n が与えられるので、1 から n までの異なる値によって構成可能な BST の数を返す、bstPattern という関数を作成してください。
 * bstPattern(1) --> 1
 * bstPattern(3) --> 5
 * bstPattern(5) --> 42
 * bstPattern(19) --> 1767263190
 */
public class Problem276 {
	// 普通に動的計画法でいけるわ。
	public static int bstPattern(int num){
		int[] result = new int[num+1];
		result[0]    = 1;

		for(int i=1;i<num+1;i++){
			for(int m=0;m<=i-1;m++){
				result[i] += result[m]*result[i-1-m];
			}
		}

		return result[num];
	}
}
