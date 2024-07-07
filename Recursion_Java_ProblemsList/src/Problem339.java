/*
 * 0 以上の整数 n が与えられるので、ビットに含まれる 1 をカウントする、countFlags という関数を作成してください。
 */
public class Problem339 {
	public static int countFlags(int n){
		int result = 0;

		while(n!=0){
			result += (n & 1) % 2;
			n = n >> 1;
		}

		return result;
	}
}
