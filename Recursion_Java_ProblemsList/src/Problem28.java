/**
 * 閏年判定メソッド
 * @author 0me6-
 *
 */
public class Problem28 {
    public static boolean isLeapYear(int year){
        if(year%400==0) return true;
        if(year%100==0) return false;
        if(year%4==0) return true;
        return false;
    }
}
