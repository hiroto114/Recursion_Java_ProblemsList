/*
 * 自然数 n が素数かどうか判定する、recursiveIsPrime という関数を再帰計算を使って作成してください。
 */
public class Problem368 {
    public static boolean recursiveIsPrime(int n){
        if(n==1){
            return false;
        }else if(n==2||n==3){
            return true;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0)return false;
            }
            return true;
        }
    }
}
