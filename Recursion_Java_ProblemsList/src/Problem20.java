/**
 * 面倒くさがりの John は長い文章を読むことがなによりも嫌いです。
 * そのため、文章の中に自分が知りたいキーワードが含まれているのか否かを瞬時に判定してくれるシステムをつくろうと思いました。
 * 文字列 s1 と文字列 s2 が与えられるので、その中に s2 という文字列が含まれているのかを調べる isSubstring という関数を定義してください。
 * @author 0me6-
 *
 */
public class Problem20 {
    public static boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }
}
