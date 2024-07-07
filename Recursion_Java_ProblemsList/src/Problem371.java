/*
 * 自然数 n が与えられるので、フィボナッチ数列の n 項目までの総和を返す、fibonacciTotal という関数を作成してください。
 * 
 * fibonacciTotal(5) --> 12
 * fibonacciTotal(9) --> 88
 * fibonacciTotal(10) --> 143
 * fibonacciTotal(19) --> 10945
 * fibonacciTotal(30) --> 2178308
 */
public class Problem371 {
    // フィボナッチ数列のn番目以下の数字の合計を出力する。
    public static int fibonacciTotal(int n){
        int result = 0;
        for(int i=1;i<=n;i++){
            result += fibonacciTotalHelper(i);
        }

        return result;
    }

    // フィボナッチ数列のn番目の数字を出力する。
    public static int fibonacciTotalHelper(int n){
        if(n==1){
            return 1; 
        }else if(n==2){
            return 1;
        }else{
            return fibonacciTotalHelper(n-2) + fibonacciTotalHelper(n-1);
        }
    }
}
