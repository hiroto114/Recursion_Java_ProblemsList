
/*
 * 文字列の逆表示
 */
public class Problem43 {
	/*
	 * 既存のライブラリや関数の作りをよく知っておくこと。
	 */
    public static String reverseString(String s){
        return (new StringBuilder(s)).reverse().toString();
    }
}
