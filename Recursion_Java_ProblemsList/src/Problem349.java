/*
 * x-y グラフにおいて、点 A（x,y）が与えられるので、原点から点 A までの距離が自然数かどうかチェックする、isPerfectSquare という関数を定義してください。
 * 
 * isPerfectSquare(3,4) --> true
 * isPerfectSquare(5,12) --> true
 * isPerfectSquare(8,15) --> true
 * isPerfectSquare(7,24) --> true
 * isPerfectSquare(1,3) --> false
 * 
 */
public class Problem349 {
	public static boolean isPerfectSquare(int x, int y){
		return Math.sqrt(x*x+y*y) == Math.floor(Math.sqrt(x*x+y*y));
	}
}
