/*
 * 整数 n が与えられるので、整数が 2 のべき乗かどうか判断する、powerOfTwo という関数を作成してください。
 */
public class Problem331 {
    public static boolean powerOfTwo(int n){
        if(n <= 0) return false;
        if(n == 1 || n == 2) return true;
        if(n != 2 && n%2 != 0) return false;
        return powerOfTwo(n/2);

    }
}
