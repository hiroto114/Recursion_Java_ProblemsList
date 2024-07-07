/*
 * 文字の配列 arr が与えられたとき、配列内で最も長く連続して出現する文字とその長さを返す関数 findLongestConsecutiveSequence を作成してください。
 * 
 * findLongestConsecutiveSequence(['a','a','b','b']) --> 2
 * findLongestConsecutiveSequence(['a','b','b','c','a','a','d']) --> 2
 * findLongestConsecutiveSequence(['a','a','a','a']) --> 4
 * findLongestConsecutiveSequence(['a','b','b','b','c','a','a','d','d','d','d']) --> 4
 * findLongestConsecutiveSequence([]) --> 0
 */
public class Problem603 {
	public static int findLongestConsecutiveSequence(char[] arr) {
		if (arr.length == 0)
			return 0;
		int result = 1;
		int count = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				count += 1;
			} else {
				result = Math.max(result, count);
				count = 1;
			}
		}

		result = Math.max(result, count);

		return result;
	}
}
