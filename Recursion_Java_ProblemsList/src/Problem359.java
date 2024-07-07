/*
 * 自然数 n が与えられるので、% 演算子を使わずに偶数かチェックする isEven という関数を再帰を使って作成してください。
 */
public class Problem359 {
    public static boolean isEven(int n){
        return n/2+n/2==n;
    }
}
