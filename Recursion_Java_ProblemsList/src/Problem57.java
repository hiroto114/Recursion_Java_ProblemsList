
/*
 * 回文（数値）判定
 */
public class Problem57 {
    public static boolean isPalindromeInteger(int n){
        String strN = String.valueOf(n);
        String strReversedN = (new StringBuilder(strN)).reverse().toString();

        return strN.equals(strReversedN);
    }
}
