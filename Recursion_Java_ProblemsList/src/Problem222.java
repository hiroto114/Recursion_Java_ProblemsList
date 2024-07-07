/*
 * Stacey は文字の奇数番目と偶数番目を入れ替えても、単語や文章として成り立つのか気になりました。
 * 空白を含まない文字列 s が与えられるので、インデックスの偶数番目と奇数番目を入れ替える、swapPosition という関数を再帰を使って作成してください。
 * 
 * swapPosition("abcd") --> badc
 * swapPosition("abcdefgh") --> badcfehg
 * swapPosition("ab") --> ba
 * swapPosition("abcde") --> badce
 * 
 */
public class Problem222 {
	public static String swapPosition(String input){
		if(input.length()<=1){
			return input;
		}

		StringBuilder result = new StringBuilder("");

		for(int i=0;i<input.length();i+=2){
			if(i+1<input.length()) result.append(input.substring(i+1,i+2));
			result.append(input.substring(i,i+1));
		}

		return result.toString();
	}
}
