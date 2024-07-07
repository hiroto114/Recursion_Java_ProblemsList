/*
 * 自然数 n が与えられるので、1 × 2 × 3 × ... × n を計算する factorial という関数を再帰を使って作成してください。
 */
public class Problem361 {
    public static long factorial(int n){
        if(n==1)return 1;
        if(n==2)return 2;
        return n*factorial(n-1);
    }
}
