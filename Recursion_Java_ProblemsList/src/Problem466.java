import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 与えられた小文字の配列 arr の中で、n を含む以降の文字（n, o, p, q, r など）の数をカウントする countCharactersAfterN 関数を作成してください
 */
public class Problem466 {
	public static int countCharactersAfterN(String[] input) {
		int result = 0;
		List<String> list = new ArrayList<String>(
				Arrays.asList("n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

		for (int iterator = 0; iterator < input.length; iterator++) {
			for (int i = 0; i < input[iterator].length(); i++) {
				if (list.contains(input[iterator].substring(i, i + 1)))
					result++;
			}
		}

		return result;
	}
}
