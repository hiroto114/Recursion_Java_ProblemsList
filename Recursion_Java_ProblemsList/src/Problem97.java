/*
 * Lavell はレースゲームを開発しており、ランダム対戦の仕組み作りに取り組んでいます。
 * 彼は、ユーザーのランクが特定の数値 m だけ離れているペアがどれだけ存在するかを調べたいと考えています。
 * ユーザーのランク一覧 ranks（整数の配列）と差の絶対値 m が与えられたとき、ランクの差が m に等しいペアの数を返す countPairs という関数を作成してください。
 * 例えば、配列 [1,2,3,4] に対して差が 2 のペアを探すと、[1,3] と [2,4] の 2 ペアが見つかります。
 * 
 * countPairs([1,2,3,4],1) --> 3
countPairs([1,2,3,4],5) --> 0
countPairs([0,0,0],0) --> 3
countPairs([1,1,1],0) --> 3
countPairs([0,0,0,0],0) --> 6
countPairs([1,2,3,4],2) --> 2
countPairs([7,9,2,4,6],2) --> 3
countPairs([7,9,2,4,5],2) --> 3
countPairs([-7,93,24,204,538,193,438],100) --> 3
countPairs([0,0,0,0,0,0,0,0],0) --> 28
countPairs([6,8,1,2,4],0) --> 0
 */
public class Problem97 {
    public static int countPairs(int[] ranks, int m){
        int count = 0;
        for (int i = 0; i < ranks.length - 1; i++) {
            for (int j = i + 1; j < ranks.length; j++) {
                if (Math.abs(ranks[i] - ranks[j]) == m) {
                    count++;
                }
            }
        }
        return count;
    }
}
