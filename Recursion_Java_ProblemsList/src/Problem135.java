import java.util.Arrays;

/*
 * Kilson は学校のレポートで、地域ごとの貯蓄を調べています。
 * ある地域の年収一覧 income が与えられるので、中央値の値を返す、findMedian という関数を定義してください。
 * ただし、言語による float 型の誤差を解消するために出力は小数第 2 位以降は切り取ってください。
 */
public class Problem135 {
    public static double findMedian(double[] income){
        Arrays.sort(income);
        double result;
        if(income.length%2==0){
            result = (income[income.length/2-1]+income[income.length/2])/2;

            System.out.println(result);
            return Math.floor(result*10)/10;
        }else{
            result = income[income.length/2];
            return Math.floor(result*10)/10;          
        }
    }
}
