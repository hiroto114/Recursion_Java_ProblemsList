/*
 * Pino は建設業者の一員としてダムを開発する予定です。
 * 開発可能な地点を下流側から順番に表示しているグラフはありますが、開発開始地点と終了地点はまだ決めていません。
 * 下流側から順に並んでいる開発可能な地点の高さ一覧 height が与えられるので、
 * 最も多く水を収容できる開発開始地点と終了地点を求め、その時のダムの面積（高さ * 幅）を返す maxCapacity という関数を作成してください。
 * 
 */
public class Problem289 {
    public static int maxCapacity(int[] height){
        // 長さが1以下だったら無理。
        if(height.length <= 1) return 0;
        // 長さが2以上だったら
        int result = 0;
        for(int i=0; i<height.length-1; i++){
            for(int m=i+1; m<height.length; m++){
                result = Math.max(result, Math.min(height[i], height[m])* (m - i));
            }
        }
        return result;
    }
}
