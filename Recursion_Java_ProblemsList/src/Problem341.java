/*
 * 整数 m、n が与えられるので、2 つの整数のハミング距離を返す、countFlipped という関数を作成してください。
 * ハミング距離を求める際は、XOR の性質を使って求めてください。
 */
public class Problem341 {
    public static int countFlipped(long m, long n){
        int intM = (int)m;
        int intN = (int)n;

        String strMN = Integer.toBinaryString(intM ^ intN);

        int result = 0;
        for(int i=0;i<strMN.length();i++){
            if(strMN.charAt(i) == '1') result += 1;
        }
        return result;
    }
}
