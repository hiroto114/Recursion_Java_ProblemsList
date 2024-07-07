/*
 * Barber は回文を多く含ませる文学作品の存在を知り、回文に興味を持ちました。そこで、最も回文が多い作品は何か調べようと思いました。
 * 文字列 string が与えられるので、文字列の中に含まれる部分文字列の中で回文になっているものの個数を返す、palindromicSubstring という関数を作成してください。
 */
public class Problem240 {
	public static int palindromicSubstring(String string){
		int result = 0;
		for(int i=1;i<=string.length();i++){
			for(int m=0;m+i<=string.length();m++){
				if(isPalindrome(string.substring(m,m+i))){
					result++;
				}
			}
		}
		return result;
	}
	public static boolean isPalindrome(String s){
		if(s.length()<=1) return true;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}
}
