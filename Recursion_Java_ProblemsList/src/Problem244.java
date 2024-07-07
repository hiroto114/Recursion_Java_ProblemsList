import java.util.Arrays;
import java.util.Comparator;

/*
 * 小学校の教師である Coleman は、生徒向けに算数の問題を作成していました。
 * 数字で作られたカードをいくつか作成し、並び替えて最も大きな値になるように生徒へ指示を出しました。
 * いくつかの数字カード intArr が与えられるので、数値を並び替えて最大の数値を作成する、largeNumberFormed という関数を作成してください。
 * 例えば、[3,30,34,5,9] は、9534330 を返します。（9,5,34,3,30）のように各要素の桁は変更することができません。
 * 
 * largeNumberFormed([12,34,56,78,90]) --> 9078563412
 * largeNumberFormed([1,2,3,4,5]) --> 54321
 * largeNumberFormed([10,20,30,4,5]) --> 54302010
 * largeNumberFormed([3,30,34,5,9]) --> 9534330
 * largeNumberFormed([39,905,3,30,34,5,9,332]) --> 990553934333230
 * largeNumberFormed([14,1412,141415]) --> 141415141412
 * 
 */
public class Problem244 {
	public static String largeNumberFormed(int[] intArr){
		// 数値を文字列に変換
		String[] strArr = Arrays.stream(intArr)
				.mapToObj(String::valueOf)
				.toArray(String[]::new);

		// 比較器を定義
		Comparator<String> comparator = (a, b) -> (b + a).compareTo(a + b);

		// 並び替え
		Arrays.sort(strArr, comparator);

		// 0が先頭に来る場合、"0"にする
		if (strArr[0].equals("0")) {
			return "0";
		}

		// 結果を連結
		StringBuilder result = new StringBuilder();
		for (String num : strArr) {
			result.append(num);
		}

		return result.toString();
	}
}
