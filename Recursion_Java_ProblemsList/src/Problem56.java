/*
 * 最初と最後の桁を足す
 */
public class Problem56 {
    public static int totalOfFirstAndLastDigits(int n){
        String strInput = String.valueOf(n);
        if(strInput.length()==1) return n;

        return Integer.parseInt(strInput.substring(0,1)) + n%10;
    }
}
