/*
 * 文字によって構成される配列 s が与えられるので、逆向きに配列で返す、reverseStringInPlace という関数を作成してください。
 * 空間計算量 O(1)、かつ時間計算量 O(N) で実装してください。新しい配列を作らず、文字列の一部を置換することによって、メモリに余分なスペースをほとんど使わずに実装しましょう。
 */
public class Problem180 {
	public static char[] reverseStringInPlace(char[] s) {
		char temp;
		for (int i = 0; i <= s.length / 2 - 1; i++) {
			temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}

		return s;
	}
}
