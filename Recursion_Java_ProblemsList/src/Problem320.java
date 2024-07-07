/*
 * 整数 x、y、z を受け取り、x × y の最後の桁が z の最後の桁と一致するかどうかを判定する
 * checkLastDigits という関数を作りましょう。
 * 例えば、x = 12、y = 14、z = 58 が与えられた場合、12 × 14 = 168 の最後の桁は 8 であり、
 * z の最後の桁も 8 なので、この関数は true を返します。
 */
public class Problem320 {
    public static boolean checkLastDigits(int x, int y, int z){
        return x*y%10 == z%10;
    }
}
