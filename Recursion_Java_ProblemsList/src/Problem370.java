/*
 * 文字列 s が与えられるので、文字列が回文かどうか判定する、recursiveIsPalindrome という関数を作成してください。
 * 回文とは、始めから読んだ場合と終わりから読んだ場合でも同じ文字列を指します。
 */
public class Problem370 {
	public static boolean recursiveIsPalindrome(String input){
		// 関数を完成させてください
		input = (input.toLowerCase()).replaceAll(" ","");

		String result = (new StringBuilder(input)).reverse().toString();
		return input.equals(result);       
	}
}
