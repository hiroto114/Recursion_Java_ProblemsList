/*
 * 自然数 digits（0 < digits < 1015）が与えられるので、数字を 1 桁ずつ分解して、それぞれの値を合計し、
 * その値が 1 桁になるまで同じ作業を繰り返した時、それぞれの合計値を足し合わせて得られる値を返す、
 * recursiveDigitsAdded という関数を再帰を使って作成してください。
 * 例えば、45622943 の場合、1 桁ずつ分解することによって、4 + 5 + 6 + 2 + 2 + 9 + 4 + 3 = 35 となりますが、
 * 値が 1 桁ではないので、もう一度 35 = 3 + 5 = 8 のように分解します。最後にそれぞれ足し合わせて 8 + 35 = 43 となります。
 * 99999999999884 の場合は、9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 8 + 8 + 4 = 119 となり、
 * その後 1 + 1 + 9 = 11 となるので、119 + 11 + 2 = 132 となります。
 */
public class Problem50 {
	public static int recursiveDigitsAdded(long digits) {
		if (digits % 10 == digits) return (int) digits;

		int result = 0;
		while (digits % 10 != digits) {
			digits = calcSumOfDigits(digits);
			result += (int) digits;
		}

		return result;
	}

	public static long calcSumOfDigits(long digits) {
		long result = 0;
		while (digits != 0) {
			result += digits % 10;
			digits = digits / 10;
		}
		return result;
	}
}
