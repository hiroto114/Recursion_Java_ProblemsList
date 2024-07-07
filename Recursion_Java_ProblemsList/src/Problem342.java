/*
 * Norman がスーパーへ買い物に行くと、無料で牛肉がもらえるキャンペーンが行われていました。
 * しかし、ある条件を満たさなければ牛肉は貰えません。Norman が買った商品の合計額 n が与えられたとき、
 * 下記の条件をもとに無料で牛肉がもらえるか判定する、canGetBeef という関数を作成してください。
 * 
 * n が 2 の累乗かチェックします
 * 2 の累乗なら n を 2 で割ります
 * 2 の累乗でなければ、n 以下で最大の 2 の累乗を n から引きます
 * 上記の処理を n が 1 になるまで繰り返します
 * n が 1 になったときに、割った回数と引いた回数の合計が奇数になれば無料で牛肉がもらえます
 * 
 * canGetBeef(2) --> true
 * canGetBeef(5) --> true
 * canGetBeef(7) --> false
 * canGetBeef(11) --> false
 * canGetBeef(32) --> true
 * canGetBeef(534) --> false
 * canGetBeef(203444343) --> false
 * 
 */
public class Problem342 {
    public static boolean canGetBeef(int n){
        int dividedTimes = 0;
        int pulledTimes  = 0;
        while(n != 1){
            if((n & (n - 1)) == 0){
                dividedTimes += 1;
                n = n / 2;
            }else{
                for(int i=0;;i++){
                    if(Math.pow(2,i) > n){
                        n = n - (int)Math.pow(2,i-1);
                        pulledTimes += 1;
                        break;
                    }
                }
            }
        }
        return (dividedTimes + pulledTimes) % 2 == 1;
    }
}
