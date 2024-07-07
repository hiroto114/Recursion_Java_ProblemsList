/*
 * 2 つの数値 num1 と num2 が入力として与えられるので、
 * その合計と平均を文字列として出力する関数 calculateSumAndAverage を作成してください。
 */
public class Problem582 {
	public static String calculateSumAndAverage(int num1, int num2) {
		String result = "";
		result += "Sum: " + (num1 + num2);
		result += ", Average: ";
		result += (num1 + num2) % 2 == 0 ? String.valueOf((num1 + num2) / 2) : String.valueOf((num1 + num2) / 2.0);
		return result;
	}
}
