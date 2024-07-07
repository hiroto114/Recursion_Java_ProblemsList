/*
 * Adam は自動で文章を単語ごとに区切るシステムを開発しています。
 * 空白がない文章 alphabet が与えられるので、単語ごとに区切る divideByWords という関数を作成してください。以下の条件に従ってください。
 * ①大文字の前を単語の区切りとしてください。
 * ②単語間にはスペースを挿入してください。
 * ③先頭以外は小文字に直してください。
 */
public class Problem185 {
	public static String divideByWords(String alphabet) {
		StringBuilder result = new StringBuilder("");
		result.append(alphabet.charAt(0));
		for (int i = 1; i < alphabet.length(); i++) {
			if (Character.isUpperCase(alphabet.charAt(i))) result.append(" ");
			result.append((alphabet.substring(i, i + 1)).toLowerCase());
		}

		return result.toString();
	}
}
