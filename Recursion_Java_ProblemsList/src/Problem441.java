
import java.util.ArrayList;
import java.util.List;

/*
 * 文字列によって構成される配列 stringList が与えられるので、
 * filter 関数を活用して、空白を除いた文字列の長さが奇数値で構成される配列を返す oddLengthArray という関数を作成してください。
 */
public class Problem441 {
	public static String[] oddLengthArray(String[] stringList) {
		List<String> resultList = new ArrayList<>();

		for (int i = 0; i < stringList.length; i++) {
			if (((stringList[i]).replaceAll(" ", "")).length() % 2 == 1) {
				resultList.add(stringList[i]);
			}
		}

		return resultList.toArray(new String[resultList.size()]);
	}
}
