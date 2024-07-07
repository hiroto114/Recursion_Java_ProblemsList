/**
 * 遊園地 D は入場者に対して整理券を配り、その番号の平方根が有理数の来場者を選び、特別バッジを与えることにしました。
 * ある自然数 number が与えられるので、その平方根が有理数かどうかを判断する、isRationalNumber という関数を作成してください。
 */
public class Problem37 {
    public static boolean isRationalNumber(int number){
        return Math.sqrt(number) % 1 == 0;
    }
}
