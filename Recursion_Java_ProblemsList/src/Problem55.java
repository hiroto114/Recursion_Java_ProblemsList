
/*
 * 与えられた自然数 n に対して、2 から n までの範囲内に存在する全ての完全数を '-' で区切って並べた文字列を返す
 * 関数 perfectNumberList を定義してください。
 * ここで完全数とは、自分自身以外の約数を全て足した値が自分自身に等しい自然数のことです。
 * ただし、完全数が存在しない場合は、文字列 'none' を返してください。
 */
public class Problem55 {
    public static String perfectNumberList(int n){
        if(n<=5) return "none";
        String result = "6";
        for(int i=7;i<=n;i++){
            if(isPerfectNumber(i)){
                result += "-" + i;
            }
        }
        return result;
    }

    public static boolean isPerfectNumber(int n){
        int helper = 0;
        for(int i=1;i<=n-1;i++){
            if(n%i==0) helper += i;
        }
        return helper == n;
    }
}
