/*
 * 0-9 によって構成される、配列 digits が与えられるので、その数値に 1 を足した数値を配列で返す、digitPlusOne という関数を作成してください。
 * 
 * digitPlusOne([3,2,1]) --> [3,2,2]
 * digitPlusOne([1,2,3,2,1]) --> [1,2,3,2,2]
 * digitPlusOne([1]) --> [2]
 * digitPlusOne([9]) --> [1,0]
 * digitPlusOne([1,9]) --> [2,0]
 * digitPlusOne([1,9,9]) --> [2,0,0]
 * digitPlusOne([0]) --> [1]
 * digitPlusOne([1,0]) --> [1,1]
 * digitPlusOne([1,0,0]) --> [1,0,1]
 * digitPlusOne([0,0,9,9]) --> [0,1,0,0]
 * digitPlusOne([9,9,9,9]) --> [1,0,0,0,0]
 */
public class Problem179 {
	public static int[] digitPlusOne(int[] digits) {
		// 関数を完成させてください
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i] += 1;
				break;
			}
			if (i == 0) {
				int[] res = new int[digits.length + 1];
				res[0] = 1;
				return res;
			}
			digits[i] = 0;
		}
		return digits;
	}
}
