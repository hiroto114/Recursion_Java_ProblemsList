/*
 * 自然数 n が与えられるので、12 + 22 + 32 + ... + n2 を計算する squareSummation という関数を再帰を使って作成してください。
 */
public class Problem362 {
    public static int squareSummation(int n){
        if(n==1){
            return 1;
        }else{
            return n*n+squareSummation(n-1);
        }
    }
}
