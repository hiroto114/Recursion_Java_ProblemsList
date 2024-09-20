
/*
 * 林業会社で働いている Kevin は、伐採した丸太を原木市場に出す際に、
 * 切り出した長さによって丸太の値段が異なることに気づきました。
 * 長さ n の丸太と長さ i (1 <= i <= n）の丸太の値段のリスト priceList が与えられるので、
 * 丸太を切断して断片を売ることによって得られる最大の利益を返す maxLogProfit という関数を作成してください。
 * 
 * 例えば、丸太の長さが 8 で、異なる断片の値段のリストが以下のように与えられている場合、
 * 得られる最大の利益は、長さ 2 と 6 の 2 つの断片で切り分けることによって得られる 22 となります。
 * 
 * 断片の長さ	1	2	3	4	5	6	7	8
 * 値段	        1	5	8	9	10	17	17	20
 * 
 * maxLogProfit([1,3,5,7,7,9],6) --> 10
 * maxLogProfit([1,5,8,9,10,17,17,20],8) --> 22
 * maxLogProfit([1,5,8,9,10,17,17,20,24,30],10) --> 30
 */
public class Problem485 {
	public static int maxLogProfit(int[] priceList, int n) {
		// 関数を完成させてください
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			if (i < priceList.length)
				dp[i] = priceList[i];
			for (int j = 0; j < i; j++) {
				dp[i] = Math.max(dp[i], dp[j] + dp[i - j - 1]);
			}
		}
		return dp[n - 1];
	}
}
