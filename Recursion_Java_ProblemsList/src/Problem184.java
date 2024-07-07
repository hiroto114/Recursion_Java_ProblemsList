import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Peter は 1-9 を用いたカードゲームを作成しており、CP の動きを開発しています。
 * そのゲームは手札にあるカードを組み合わせて、相手より大きな数を生み出せたら勝ちというルールです
 * （例：142 という手札の場合、421 という組み合わせにして相手の数より大きかったら勝利）。
 * CP の手札にある数字 num が与えられるので、組み合わせの順番を変えることで最大の整数を返す、integerRearrangement という関数を作成してください。
 * 
 * integerRearrangement(90130) --> 93100
 * integerRearrangement(93827) --> 98732
 * integerRearrangement(12345) --> 54321
 * integerRearrangement(35821) --> 85321
 * integerRearrangement(100102) --> 211000
 * integerRearrangement(10010103920) --> 93211100000
 * integerRearrangement(2940439320) --> 9944332200
 * integerRearrangement(321) --> 321
 */
public class Problem184 {
	public static long integerRearrangement(long num) {
		List<Long> list = new ArrayList<>();
		while (num != 0) { // 10で割った結果が0になったら終了する
			list.add(num % 10); // 1桁目を取得する
			num /= 10; // 1/10にする
		}

		Collections.sort(list, Collections.reverseOrder());

		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < list.size(); i++) {
			result.append(list.get(i));
		}

		return Long.parseLong(result.toString());
	}
}
