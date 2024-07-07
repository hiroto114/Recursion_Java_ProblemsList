/*
 * 0 以上の整数 n が与えられるので、ビットの右端の 1 の位置を返す、positionOfTheRightMost という関数を作成してください。
 * 例えば、6 が与えられたとき、(110)2 の右端の 1 の位置は右から数えて 2 番目なので、2 を返します。
 * 
 * positionOfTheRightMost(2) --> 2
 * positionOfTheRightMost(5) --> 1
 * positionOfTheRightMost(7) --> 1
 * positionOfTheRightMost(11) --> 1
 * positionOfTheRightMost(32) --> 6
 * positionOfTheRightMost(534) --> 2
 * positionOfTheRightMost(2000000) --> 8
 * positionOfTheRightMost(1984700000) --> 6
 * 
 */
public class Problem340 {
	public static int positionOfTheRightMost(int n){
		String strN = (new StringBuilder(Integer.toBinaryString(n))).reverse().toString();
		return strN.indexOf("1")+1;
	}
}
