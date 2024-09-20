
/*
 * E 高校の野球部は定期的に 20 メートルシャトルランを行なっており、1 日に複数回記録を取っており、
 * 1 回でも記録が減少した選手にペナルティを与える部則がありました。
 * シャトルランの記録 records が与えられるので、ペナルティが与えられるか判定する、hasPenalty という関数を定義してください。
 * シャトルランは本来は 247 までしか存在しませんが、今回はいかなる自然数も対象とします。
 */
public class Problem83 {
	
	// この問題については特にいうことなし。
    public static boolean hasPenalty(int[] records){
        for(int i=0;i<records.length-1;i++){
            if(records[i] > records[i+1]) return true;
        }

        return false;
    }
}
