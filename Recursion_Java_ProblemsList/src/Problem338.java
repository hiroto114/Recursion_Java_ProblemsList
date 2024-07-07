/*
 * ビットの右端の 1 を 0 へ変更する、turnOffTheRightMost という関数を作成してください。
 */
public class Problem338 {
	public static int turnOffTheRightMost(int n){
		return (n) & (n-1);
	}
}
