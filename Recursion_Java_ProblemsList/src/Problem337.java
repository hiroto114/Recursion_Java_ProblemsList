/*
 * 整数 m、n が与えられるので、XOR を用いて、m と n が異なる符号かどうか確かめる、differentSigns という関数を作成してください。
 */
public class Problem337 {
    public static boolean differentSigns(int m, int n){
        return m*n<0;
    }
}
