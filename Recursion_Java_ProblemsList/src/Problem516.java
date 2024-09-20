
/*
 * 0 以上の整数 number と i が与えられるので、i 番目のビットが 0 の時は 1 へ、1 の時は 0 へ反転する
 * toggleBit という関数を作成してください。
 * 例えば、整数 31 と 3 が与えられたとき、31 を 2 進数で表すと 11111 なので右から数えて 3 番目の 1 を 0 にします。右端は 0 番目とします。
 * 
 * toggleBit(31,3) --> 23
 * toggleBit(5,1) --> 7
 * toggleBit(5,4) --> 21
 */
public class Problem516 {
	public static int toggleBit(int number, int i) {
		String a = Integer.toBinaryString(number);

		if (a.length() - 1 - i < 0)
			return (int) Math.pow(2, i) + number;
		if (a.length() - 1 - i == 0) {
			if (a.charAt(0) == '0') return Integer.parseInt("1" + a.substring(1), 2);
			return Integer.parseInt("0" + a.substring(1), 2);
		}
		if (a.length() - 1 - i == a.length() - 1) {
			if (a.charAt(a.length() - 1) == '0') return Integer.parseInt(a.substring(0, a.length() - 1) + "1", 2);
			return Integer.parseInt(a.substring(0, a.length() - 1) + "0", 2);
		}
		if (a.charAt(a.length() - 1 - i) == '0') return Integer.parseInt(a.substring(0, a.length() - 1 - i) + "1" + a.substring(a.length() - i), 2);
		return Integer.parseInt(a.substring(0, a.length() - 1 - i) + "0" + a.substring(a.length() - i), 2);
	}
}
