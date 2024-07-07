import java.util.Collections;
import java.util.HashMap;

/*
 * Grey は占い診断を行うサイトを開発しています。
 * そこでは自由に文字列を打ち込んでもらい、一番多く出現した文字の ASCII コードによって診断結果を変える仕組みにします。
 * 空白を含まない文字列 string が与えられるので、最も多く出現した文字の ASCII コードを返す、getAscii という関数を作成してください。
 * ただし、出現する回数が同じ場合は、大きい ASCII コードを持つ文字を優先してください。
 */
public class Problem190 {
	public static int getAscii(String input) {
		HashMap<Character, Integer> countInput = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			if (countInput.get(input.charAt(i)) == null) {
				countInput.put(input.charAt(i), 1);
			} else {
				countInput.replace(input.charAt(i), countInput.get(input.charAt(i)) + 1);
			}
		}

		Integer maxCount = Collections.max(countInput.values());
		int maxAsciiValue = 0;

		for (Character key : countInput.keySet()) {
			if (countInput.get(key) == maxCount && maxAsciiValue < (int) key) {
				maxAsciiValue = (int) key;
			}
		}

		return maxAsciiValue;
	}
}
