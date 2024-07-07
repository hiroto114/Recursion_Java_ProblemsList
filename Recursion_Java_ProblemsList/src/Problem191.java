import java.util.Arrays;

/*
 * onathan はカレー屋を営んでおり、複数のカレーを作成してカレーグランプリに出場しました。
 * カレーによって投入された唐辛子の個数が異なっていましたが、辛さごとに個数の差は一定になるよう調節していました。
 * 注文されたカレーに含まれている唐辛子の個数一覧 peppers が与えられるので、
 * カレーを並べ替えたときに唐辛子の個数の差が一定になるかどうか判断する、hasSameDifference という関数を作成してください。
 */
public class Problem191 {
	public static boolean hasSameDifference(int[] peppers) {
		if (peppers.length == 1)
			return true;
		Arrays.sort(peppers);
		int diff = peppers[1] - peppers[0];
		for (int i = 0; i < peppers.length - 1; i++) {
			if (peppers[i + 1] - peppers[i] != diff)
				return false;
		}
		return true;
	}
}
