
/*
 * 0 以上の整数 number と i が与えられるので、
 * i 番目のビットが 1 かどうか確認する checkIthBit という関数を作成してください。
 * 例えば、整数 32 と 5 が与えられたとき、32 を 2 進数で表すと 100000 となり、
 * 右から数えて 5 番目は 1 なので true を返します。一番右端は 0 番目とします。
 * 
 * checkIthBit(32,5) --> true
 * checkIthBit(1,3) --> false
 * checkIthBit(5,2) --> true
 * checkIthBit(8,2) --> false
 */
public class Problem514 {
	public static boolean checkIthBit(int number, int n) {
		String i = Integer.toBinaryString(number);

		if (i.length() - 1 - n < 0)
			return false;
		return i.charAt(i.length() - 1 - n) == '1';
	}
}
