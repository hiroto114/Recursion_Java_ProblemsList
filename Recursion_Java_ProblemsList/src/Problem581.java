
/*
 * 文字列と 2 つのインデックス i と j が与えられるので、
 * その範囲内の部分だけを反転させた文字列を返す関数 partialReverse を作成してください。
 * 
 * partialReverse("abcde",1,3) --> adcbe
 * partialReverse("abcde",3,1) --> adcbe
 * partialReverse("abcde",1,1) --> abcde
 */
public class Problem581 {
	public static String partialReverse(String s, int i, int j) {
		String result = "";
		for (int a = 0; a < s.length(); a++) {
			if (a < Math.min(i, j) || a > Math.max(i, j)) {
				result += s.substring(a, a + 1);
			} else {
				StringBuilder helper = new StringBuilder(s.substring(Math.min(i, j), Math.max(i, j) + 1));
				result += helper.reverse().toString();
				a = Math.max(i, j);
			}
		}

		return result;
	}
}
