/*
 * 自然数 n が与えられるので、1 から n までの総和の総和を返す、summationOfSummation という関数を作成してください。
 */
public class Problem369 {
    public static int summationOfSummation(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return summation(n) + summationOfSummation(n-1);
    }

    public static int summation(int n){
        if(n<=0) return 0;
        return (1+n)*n/2;
    }
}
