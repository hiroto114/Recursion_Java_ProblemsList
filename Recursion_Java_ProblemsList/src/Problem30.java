/**
 * トランプゲーム
 * あなたはトランプゲーム、大富豪を Bob と play していて、今お互いの手札が 1 枚ずつという局面になりました。
 * 相手のカード hisCard が与えられるので、あなたの手持ちのカード 10 と比較して勝利を判定してくれる、
 * whoIsWinner という関数を作成してください。今回ジョーカーは存在しないものとします。
引き分けの場合、draw と出力されます。
あなたが勝った場合、you win と出力されます。
あなたが負けた場合、you lose と出力されます。
 * @author 0me6-
 *
 */
public class Problem30 {
    public static String whoIsWinner(int hisCard){
        if(hisCard > 10 || hisCard <= 2) return "you lose";
        if(hisCard == 10) return "draw";
        return "you win";
    }
}
