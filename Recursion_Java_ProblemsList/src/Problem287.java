/*
 * 物理学者の Burberry は n 個の卵を用意し、k 階のビルから落とすことで卵の強度を測ろうとしました。
 * 卵はある階よりも低ければ割れることはなく、ある階よりも高いと割れてしまいます。
 * 卵が k 階のうち何階で割れるかを調べる最短の通りを返す、eggDrop という関数を返してください。ただし、以下の条件に気をつけてください。
 * 
 * 落下に耐えた卵は再び使用することができます。
 * 壊れた卵は捨てなければなりません。
 * ある階で割れなければ、その階より下の階では割れません。
 * ある階で卵が割れると、上のどの階でも割れます。
 */
public class Problem287 {
    public static int eggDrop(int n, int k){
        // dp[i][j] represents the minimum number of attempts needed with i eggs and j floors
        int[][] dp = new int[n + 1][k + 1];
        
        // Initialize the dp array
        for (int j = 1; j <= k; j++) {
            dp[1][j] = j;  // If we have only one egg, we need to try each floor
        }
        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;  // If we have only one floor, we need only one attempt
        }
        
        // Fill the dp array using dynamic programming
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    int res = 1 + Math.max(dp[i-1][x-1], dp[i][j-x]);
                    dp[i][j] = Math.min(dp[i][j], res);
                }
            }
        }
        
        return dp[n][k];
    }
}
