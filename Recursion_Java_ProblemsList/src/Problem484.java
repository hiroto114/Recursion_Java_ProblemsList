
/*
 * 異なる額面の硬貨を表す整数によって構成される配列 coins と、金額を表す整数 amount が与えられるので、
 * 金額 amount を構成するのに必要な最も少ない枚数の硬貨を返す minCoinChange という関数を作成してください。
 * もし、その金額が硬貨のどの組み合わせでも補えない場合は、-1 を返してください。
 * 
 * 例えば、配列 [1,3,4,5] と金額 7 が与えられた場合、1 + 1 + 5 = 7 の計 3 枚が考えられますが、
 * 最適解として 3 + 4 = 7 の計 2 枚を返します。
 */
public class Problem484 {
    public static int minCoinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i = 0; i <= amount; i++) dp[i] = amount+1;
        dp[0] = 0;
        for(int coin : coins){
            for(int i = coin; i <= amount; i++){
                dp[i] = Math.min(dp[i], dp[i-coin]+1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
