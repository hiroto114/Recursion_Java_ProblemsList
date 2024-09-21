import java.util.Arrays;

/*
 * 注文されたカレーに含まれている唐辛子の個数一覧 peppers が与えられるので、
 * カレーを並べ替えたときに唐辛子の個数の差が一定になるかどうか判断する、hasSameDifference という関数を作成してください。
 */
public class Problem191 {
    public static void main(String[] args) throws Exception {
        System.out.println(hasSameDifference(new int[]{1, 2, 3, 4}) == true);
        System.out.println(hasSameDifference(new int[]{5, 10, 15}) == true);
        System.out.println(hasSameDifference(new int[]{1, 3, 6, 8}) == false);
        System.out.println(hasSameDifference(new int[]{2, 4, 6, 8}) == true);
        System.out.println(hasSameDifference(new int[]{0, 0, 0, 0}) == true);
        System.out.println(hasSameDifference(new int[]{1, 2, 3, 6}) == false);
    }
	public static boolean hasSameDifference(int[] peppers) {
		if (peppers.length <= 1) return true;
		// 入力配列をソートしたうえで左から順に差分を確認する。
		Arrays.sort(peppers);
		int diff = peppers[0] - peppers[1];
		for (int i = 0; i < peppers.length - 1; i++) {
			if (peppers[i] - peppers[i+1] != diff)
				return false;
		}
		return true;
	}
}
