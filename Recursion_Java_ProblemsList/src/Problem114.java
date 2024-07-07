/*
 * Vega はゲーム開発をしており、ユーザーが連続で同じスコアを出したら特別アイテムを付与する仕様を考えています。
 * ユーザーのスコア一覧 scores が与えられるので、最も連続したスコアの回数を返す、longestConsecutive という関数を定義してください。
 */
public class Problem114 {
    public static int longestConsecutive(int[] scores){
        int count = 1;
        int maxCount = 1;

        for(int i=1;i<scores.length;i++){
            if(scores[i-1]==scores[i]) count++;
            else count = 1;
            maxCount = Math.max(count,maxCount);
        }

        return maxCount;
    }
	
}
