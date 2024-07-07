/*
 * Warren は、英語は接頭辞によって意味を推測できると考えました（例：discount, disable など）。
 * そこで、複数の文字列から共通の接頭辞を抜き出し、まとめようと思っています。
 * 文字列 s1 と s2 が与えられるので、共通の接頭辞を返す、commonPrefix という関数を再帰によって作成してください。
 */
public class Problem228 {
	public static String commonPrefix(String s1, String s2) {
		return commonPrefixHelper(s1, s2, 0, "");
	}

	// インデックスを追跡する引数indexと、共通の接頭辞を返すための引数outputを追加します
	public static String commonPrefixHelper(String s1, String s2, int index, String output) {
		// どちらかの文字列を全て確認し終えるか、2つの文字列の文字が異なる時に再帰を終了
		if (index >= s1.length() || index >= s2.length() || s1.charAt(index) != s2.charAt(index)) {
			return output;
		}
		// indexを1増やし、共通の接頭辞をoutputに追加
		return commonPrefixHelper(s1, s2, index + 1, output + s1.charAt(index));
	}

	public static void main(String[] args) {
		System.out.println(commonPrefix("abcdefg", "abcxyz"));
		System.out.println(commonPrefix("people", "people"));
		System.out.println(commonPrefix("autopilot", "autobiography"));
		System.out.println(commonPrefix("aaa", "a"));
	}
}
