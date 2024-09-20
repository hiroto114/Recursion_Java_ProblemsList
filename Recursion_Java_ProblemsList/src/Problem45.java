
/**
 * Juan は小学 1 年生の息子に足し算を教える方法として、桁数を分解して足し合わせるという方法を思いつきました。
 * 自然数 digits が与えられるので、桁数を分解して足し合わせる、splitAndAdd という関数を再帰を使って作成してください。
 * 例えば、98 は、9 + 8 = 17 となり、9728 は、9 + 7 + 2 + 8 = 26 となります。
 * @author 0me6-
 *
 */
public class Problem45 {
    public static int splitAndAdd(int digits){
        int result = 0;
        while(digits > 0){
            result += digits % 10;
            digits = digits / 10;
        }
        return result;
    }
}
