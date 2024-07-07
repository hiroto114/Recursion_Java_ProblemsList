/*
 * 文字列 inputString が与えられるので、整数に変換する、atoi という関数を作成してください。変換の条件は以下の通りです。
 * 最初に空白がある場合は、最初の文字が現れるまで全ての空白を除去してください。+ と - はプラス、マイナスとして解釈してください。+ と - のすぐ後に現れる整数は + と - の影響を受けます。
 * 数値の後に含まれる文字列は全て無視してください。
 * 空白以外の文字列が有効な整数ではない場合は、0 を返してください。
 * 空白文字として認識できるのはスペース文字 ' ' だけです。
 * 32 ビット符号付き整数の範囲しか整数は格納することができません。
 * 
 * atoi(" 123") --> 123
 * atoi(" + 123") --> 0
 * atoi(" ++123") --> 0
 * atoi(" +729") --> 729
 * atoi(" -123") --> -123
 * atoi(" -42") --> -42
 * atoi(" hello world 8929") --> 0
 * atoi("123456 hello world") --> 123456
 * atoi("39439435021") --> 2147483647
 * atoi("2147483646") --> 2147483646
 * atoi("-5349292853530") --> -2147483648
 * atoi("-2147483649") --> -2147483648
 * 
 */
public class Problem182 {
	public static int atoi(String inputString) {
		// 最初のスペースを削除
		while (true) {
			if (inputString.charAt(0) == ' ') {
				inputString = inputString.substring(1);
			} else {
				break;
			}
		}
		// 数値、+、-の後の文字列は削除
		String result = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == '+' && result.indexOf(inputString.charAt(i)) == -1) {
				result += String.valueOf(inputString.charAt(i));
				continue;
			}
			if (inputString.charAt(i) == '-' && result.indexOf(inputString.charAt(i)) == -1) {
				result += String.valueOf(inputString.charAt(i));
				continue;
			}
			if (Character.isDigit(inputString.charAt(i))) {
				result += String.valueOf(inputString.charAt(i));
				continue;
			}
			break;
		}
		// resultが数字の体をなしていない場合、「0」を返却
		if ("".equals(result) || "+".equals(result) || "-".equals(result))
			return 0;

		try {
			return Integer.parseInt(result);
		} catch (NumberFormatException e) {
			if (inputString.charAt(0) == '-')
				return -2147483648;
			return 2147483647;
		}
	}
}
