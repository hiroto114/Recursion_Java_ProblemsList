/*
 * 自然数 n が与えられるので、1 から n までの異なる値によって構成可能な BST の数を返す、bstPattern という関数を作成してください。
 * bstPattern(1) --> 1
 * bstPattern(3) --> 5
 * bstPattern(5) --> 42
 * bstPattern(19) --> 1767263190
 */
public class Problem276 {
	/** 
	 * 普通に実験して規則性を掴む＋動的計画法でいけるわ。
	 * num=0,1,2,3,4,,,,,,のときを全部計算＋ある値iのときにはルートノードが1,2,,,,,iだったら左と右はどうなるかを考えると見えてくる。
	 */
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
