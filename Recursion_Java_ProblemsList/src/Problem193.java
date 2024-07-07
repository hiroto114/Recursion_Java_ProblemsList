import java.util.Arrays;

/*
 * Lassy は年末になると年間でいくら収入を得たか計算しています。
 * しかし、毎回数字のみを抽出して電卓に打ち込む作業に嫌気をさしていました。
 * そこで、文章の中でも数字のみを勝手に取り出し、足し算をするプログラム開発に取り組みました。
 * 数値を含む文章 string が与えられるので、その中に含まれる数値の合計を返す、sumNumbers という関数を作成してください。
 * 
 * sumNumbers("ab12cdef32gh") --> 44
 * sumNumbers("38b1cdef32gh") --> 71
 * sumNumbers("cdef32gh") --> 32
 * sumNumbers("588kdj8dj32kkk90") --> 718
 * sumNumbers("dsjnf85dj122kk09k") --> 216
 * sumNumbers("dd01010101ikd") --> 1010101
 * sumNumbers("dd01p00ikd") --> 1
 * 
 */
public class Problem193 {
	public static int sumNumbers(String s) {
		String[] numbers = s.split("[a-zA-Z\\. ]{1,}");
		int result = 0;
		System.out.println(Arrays.toString(numbers));
		for (String number : numbers) {
			if ("".equals(number))
				continue;
			else
				result += Integer.parseInt(number);
		}
		return result;
	}
}
