
/*
 * 文字列 s と数値 position が入力として与えられるので、s の position 位置から始まる部分文字列を取得し、
 * その部分文字列を逆順にする関数 reverseSubstringFromPosition を作成してください。
 * position が s のインデックスの範囲外であれば、s をそのまま返してください。
 * 
 * String s = "Hello, world!";
 * String substring = s.substring(7); // "world!"
 */
public class Problem585 {
    public static String reverseSubstringFromPosition(String s, int position){
        if(s.length()-1<position) return s;
        return (new StringBuilder(s.substring(position))).reverse().toString();
    }
}
