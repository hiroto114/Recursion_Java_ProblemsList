/*
 * Alex は金券が当たるくじ引きに参加しています。
 * くじ引きでは一回引いた後、そのくじをまだ残っているくじと交換することができます。
 * しかし交換するときは、残っているものの中から最も金券の額が大きいものを選ばなければいけません。
 * くじの金券の額一覧 lotteries が与えられるので、そのくじを後に残っているくじの中で最大の額に置き換える greaterOnRightSide という関数を作成してください。
 * 最後のくじは 0 に置き換えてください。例えば、[16,17,4,3,5,2] の場合、16 より後は 17、17 より後は 5 が最大の額となり、答えは [17,5,5,5,2,0] となります。
 */
public class Problem192 {
	public static int[] greaterOnRightSide(int[] lotteries) {
		int[] result = new int[lotteries.length];
		for (int i = 0; i < lotteries.length - 1; i++) {
			result[i] = greaterOnRightSideHelper(lotteries, i + 1);
		}
		result[lotteries.length - 1] = 0;

		return result;
	}

	public static int greaterOnRightSideHelper(int[] lotteries, int index) {
		int result = lotteries[index];
		for (int i = index; i < lotteries.length; i++) {
			if (result < lotteries[i]) {
				result = lotteries[i];
			}
		}
		return result;
	}
}
