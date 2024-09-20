
/*
 * Kathy は現在価格 goalMoney ドルの土地の購入するために、年利 interest（0 < interest < 100）%の金融商品に 
 * capitalMoney ドル投資しようと計画しています。goalMoney, interest, capitalMoney が与えられるので、
 * 何年後に土地の購入ができるかを返す、howLongToReachFundGoal という関数を再帰によって作成してください。
 * なお、毎年得られた利益は同商品に再投資するとし、
 * 土地の価格は経過する年数が偶数（0 を含む）の時は 2%、奇数の時は 3% 上昇します。
 * また、人の寿命は 80 歳未満と仮定し、80 年以上かかる時は 80 としてください。
 */
public class Problem49 {
	public static int howLongToReachFundGoal(int capitalMoney, int goalMoney, int interest){
		int years = 0;
		while (capitalMoney < goalMoney) {
			if(years % 2 == 0) goalMoney *= 1.02;
			else goalMoney *= 1.03;
			capitalMoney *= (1 + interest/100.0);
			years += 1;
			if(years >= 80) break;
		}

		return (years >= 80) ? 80 : years;
	}
}
