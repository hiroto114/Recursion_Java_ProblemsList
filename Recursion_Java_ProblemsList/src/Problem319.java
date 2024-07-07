/*
 * 2 桁の数字 n が与えられるので、桁を入れ替えて値が大きくなるか、または等しくなるかを判定する、isSwapBigger という関数を作成してください。
 * 例えば、45 が与えられたとき、スワップした 54 の方が大きい値になるので、true を返します。
 * 
 * isSwapBigger(45) --> true
 * isSwapBigger(31) --> false
 * isSwapBigger(89) --> true
 * isSwapBigger(10) --> false
 * isSwapBigger(30) --> false
 * isSwapBigger(99) --> true
 * 
 */
public class Problem319 {
    public static boolean isSwapBigger(int n){
        if(n%10>=n/10) return true;
        return false;
    }
}
