/*
 * 整数 n が与えられるので、n 個の要素を k 個の集合に分割したときの総数を S(n,k) とした場合、
 * k = 1 から n までの S(n,k) の総和を返す​​ numberOfSplits という関数を作成してください。
 * 
 * 例えば、n = 2 の場合、要素を 1 と 2 として、{{1},{2}} または {{1,2}} と分割できるので 2 を返します。
 * n = 3 の場合、要素を 1、2、3 として、{1,2,3}、{{1},{2},{3}}、{{1},{2,3}}、{{2},{1,3}}、{{3},{1,2}} と
 * 分割できるので 5 を返します。
 * 
 * numberOfSplits(0) --> 1
 * numberOfSplits(1) --> 1
 * numberOfSplits(2) --> 2
 * numberOfSplits(3) --> 5
 * numberOfSplits(4) --> 15
 * numberOfSplits(5) --> 52
 * 
 */
public class Problem481 {
	public static int numberOfSplits(int n) {
		if (n == 0) return 1;
		int result = 0;
		for (int i = 1; i <= n; i++) result += numberOfSplitsHelper(n, i);
		return result;
	}

	public static int numberOfSplitsHelper(int n, int k) {
		if (k == 1 || k == n) return 1;
		return numberOfSplitsHelper(n - 1, k - 1) + k * numberOfSplitsHelper(n - 1, k);
	}
}
