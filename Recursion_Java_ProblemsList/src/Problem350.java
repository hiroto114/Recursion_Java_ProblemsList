/*
 * 元金 capital と年数 year が与えられるので、複利を使って将来の合計金額を計算します。
 * 以下の要件に基づいて、関数 calculateGoalMoney を作成してください。
 * 
 * 元金（capital）と期間（year）を使用して、複利の式 P(1+i)^n を使って将来の最終的な金額を計算します。
 * 最初の元金が偶数の場合は年利率が 2％、奇数の場合は年利率が 3％ とします。
 * 計算結果は小数点以下を切り捨て、整数として返します。
 * 
 * calculateGoalMoney(2,3) --> 2
 * calculateGoalMoney(4,7) --> 4
 * calculateGoalMoney(16,24) --> 25
 * calculateGoalMoney(35,47) --> 140
 * 
 */
public class Problem350 {
	public static int calculateGoalMoney(int capital, int year){
		if(capital % 2 ==0) return (int)(capital*Math.pow(1+0.02,year));
		return (int)(capital*Math.pow(1+0.03,year));
	}
}
