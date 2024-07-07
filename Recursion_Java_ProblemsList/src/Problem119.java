import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * Hays はオンラインゲームであるイベントを開催しました。
 * それはユーザー全員を 2 つのグループに分け、チーム対抗で対戦してもらうというイベントです。
 * チームの分け方はユーザーのゲーム内スコアをもとに、2 つのグループが同じ強さになるようにします。
 * また、同時にゲームの審判を決めることになり、
 * 1 つ目のチームと 2 つ目のチームの間に位置するユーザーを審判にします
 * （例：ユーザー一覧が [1,2,3,2,1] の場合、スコアが 1,2 と 2,1 の 2 チームに分かれて 3 が審判になります）。
 * ユーザーのスコア一覧 scores が与えられるので、2 つのグループに分けた時に審判になれるユーザーのインデックスを全て返す findJudgePosition という関数を定義してください。もしそのようなインデックスが存在しない場合は -1 を返してください。
 */
public class Problem119 {
    /**
     * 審判になれるユーザーのインデックスを返す
     * @param scores ユーザーのスコア一覧
     * @return int[] 審判になれるユーザーのインデックス一覧
     * もしもそのインデックスがなければint[]{-1}を
     */
    public static int[] findJudgePosition(int[] scores){
        /** 審判が左から2番目にいたときの左側の合計値 */
        int leftSum = scores[0];
        /** 審判が左から2番目にいたときの右側の合計値 */
        int rightSum = IntStream.of(scores).sum() - scores[0] - scores[1];
        /** 審判の初期位置を左から2番目とする */
        int judgePosisiton = 1;
        /** 結果のインデックスを詰める動的配列 */
        List<Integer> result = new ArrayList<Integer>();
        // 審判を左から2番目からn-2番目まで操作する
        while(judgePosisiton <= scores.length - 2){
            // もしも左と右の合計値が一致していたらその時の審判の位置をresultに追加
            if(leftSum == rightSum) result.add(judgePosisiton);
            // 審判が右に1つ移動したときのleftSumとrightSum,judgePosisitonを計算
            leftSum += scores[judgePosisiton];
            rightSum -= scores[judgePosisiton + 1];
            judgePosisiton += 1;
        }
        // もしも結果があればそれを返却、なければ[-1]の配列を返却
        if(result.size() == 0) return new int[]{-1};
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
