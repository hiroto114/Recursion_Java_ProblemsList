/*
 * 3 の累乗 n が与えられるので、整数 n を 3 で除算できる回数を返す、divideBy3Count という関数を作成してください。
 */
public class Problem46 {
    public static int divideBy3Count(int n){
        int result = 0;
        while(n%3==0 && n!=0){
            result += 1;
            n = n/3;
        }

        return result;
    }
}
