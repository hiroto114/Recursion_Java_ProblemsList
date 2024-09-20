
/*
 * 0 以上の整数 number と i が与えられるので、i 番目のビットが 1 であれば 0 にする
 * turnOffTheIthBit という関数を作成してください。
 * 例えば、整数 31 と 3 が与えられたとき、31 を 2 進数で表すと 11111 なので右から数えて 3 番目の 1 を 0 にします。
 * 右端を 0 番目とし、i 番目が 0 の場合は変更しません。
 * 
 * turnOffTheIthBit(31,3) --> 23
 * turnOffTheIthBit(5,1) --> 5
 * turnOffTheIthBit(5,2) --> 1
 */
public class Problem515 {
	public static int turnOffTheIthBit(int number, int i) {
		String binary = Integer.toBinaryString(number);
		String result = "";
		if (binary.length() - 1 - i == 0) {
			result = "0" + binary.substring(1);
		} else if (binary.length() - 1 - i > 0) {
			result = binary.substring(0, binary.length() - 1 - i) + "0" + binary.substring(binary.length() - i);
		} else {
			result = binary;
		}
		return Integer.parseInt(result, 2);
	}
}
