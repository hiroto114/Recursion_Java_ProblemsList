/*
 * Hodge は文章を短く表示するアプリを作成しており、文字が連続して 2 回以上続く場合は文字を数字に置き換えようと考えています。
 * アルファベットで書かれた文字列 s が与えられるので、再帰を使って連続で続いた文字を数字に置き換える、stringCompression という関数を作成してください。
 */
public class Problem227 {
	public static String stringCompression(String s) {
		return stringCompressionHelper(s, 0, new StringBuilder());
	}

	private static String stringCompressionHelper(String s, int index, StringBuilder result) {
		if (index >= s.length()) {
			return result.toString();
		}

		char currentChar = s.charAt(index);
		int count = 1;

		// なんか直感的じゃない。。。絶対に良い書き方があるはず。
		while (index + count < s.length() && s.charAt(index + count) == currentChar) {
			count++;
		}

		result.append(currentChar);
		if (count > 1) {
			result.append(count);
		}

		return stringCompressionHelper(s, index + count, result);
	}

	public static void main(String[] args) {
		System.out.println(stringCompression("aaabbc")); // a3b2c
		System.out.println(stringCompression("abcd"));   // abcd
		System.out.println(stringCompression("aabbcc")); // a2b2c2
	}
}
