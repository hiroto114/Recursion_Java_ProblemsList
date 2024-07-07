import java.math.BigInteger;

/*
 * 自然数 , によって構成される分数 の既約分数を文字列として返す、irreducibleFraction という関数を作成してください。
 * 既約分数とは、それ以上約分できない分数のことです。
 * 
 * 例えば、 が与えられたとき、分母分子共に で割ることによって、既約分数である を作ることができます。
 */
public class Problem366 {
    public static String irreducibleFraction(int x, int y){
        int xyGcd = isGCD(x,y);
        if(y==xyGcd){
            return String.valueOf(x/xyGcd);
        }else{
            return (x/xyGcd + "/" + y/xyGcd);            
        }
    }

    public static int isGCD(int x,int y){
        BigInteger X = BigInteger.valueOf((long)x);
        BigInteger Y = BigInteger.valueOf((long)y);

        return X.gcd(Y).intValue();        
    }
}
