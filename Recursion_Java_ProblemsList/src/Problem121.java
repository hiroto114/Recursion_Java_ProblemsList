import java.util.HashMap;
import java.util.Map;

/*
 * Johnson は 2 人でプレイする協力型ゲームを開発しており、戦闘で敵にダメージを与えるシステムを実装中です。
 * プレイヤー1 の操作コマンドを表す配列 charArr1、プレイヤー2 の操作コマンドを表す配列 charArr2 が与えられるので、
 * 以下の条件を満たす findCommon という関数を定義してください。
 * 
 * 2 人の共通コマンドをダメージを与える操作として返します
 * 2 人の共通コマンドが複数ある時は、コマンドを打った順番を足し、値が小さい操作を優先してください
 * 各プレイヤーに同じ操作が複数ある場合、先に出た操作を優先します。（例：[b,b,c,b] とある場合、b は 0 番目の操作とする）
 * 2 人の共通コマンドが複数あり、かつ値も同じ時はプレイヤー1 が先に操作したコマンドを優先してください
 * 2 人の共通コマンドが存在しない時は、no common と返してください
 * 例えば、["a", "b", "c", "d"], ["e", "c", "g", "b"] が与えられたとき、2 人のプレイヤーの共通のコマンドは b と c になります。
 * コマンドが打たれた順番を計算すると、b は 1 + 3 = 4、c は 2 + 1 = 3 なので値が小さい c が優先されます。
 * 
 * findCommon(['a','b','c','d'],['e','c','b','g']) --> b
 * findCommon(['b','b','b','b'],['b','b','b','b']) --> b
 * findCommon(['a','b','c','d'],['e','f','a']) --> a
 * findCommon(['a','b','c','d'],['e','c','g','b']) --> c
 * findCommon(['a','b','c','d'],['e','f','g','h']) --> no common
 * findCommon(['b','c','a','d'],['b','c','e','g']) --> b
 * findCommon(['c','d','a','b'],['b','c','e','g']) --> c
 * findCommon(['b','b','c','d'],['b','c','e','g']) --> b
 * findCommon(['b','c','d','b'],['e','c','b','g']) --> b
 * findCommon(['b','d','b','c'],['e','c','b','c']) --> b
 * findCommon(['b','b','c','d'],['c','c','b','b']) --> b
 * findCommon(['a','b','c','d'],['e','c','g','b','f']) --> c
 * findCommon(['a','b','c','d','v','b','c'],['e','c','g','b','f','b']) --> c
 * 
 * さすがに時間計算量O(mn)のやり方はうまくなかったので修正
 */
public class Problem121 {
    /**
     * 2つの文字の配列の共通文字の位置の合計が最小になるような文字を返却
     * →注意するポイントはabcdとecbgの2つ
     * 答えはb(1+2)とc(2+1)の2つあるように見えるが、charArr1から見た位置が一番最初がbの方なのでbが答えになる。
     * なので下記やり方を採用すると時間計算量O(Math.max(m,n))で解ける。
     * ➀charArr2の統計をHashMapで集計
     * ➁charArr1を左から順にみていってresultValueの値がより小さいペアの文字を答えにしていく
     */
    public static String findCommon(char[] charArr1, char[] charArr2){
        Map<Character, Integer> queue = new HashMap<Character, Integer>();

        for(int i=0;i<charArr2.length;i++){
            if(queue.get(charArr2[i])==null){
                queue.put(charArr2[i],i);
            }
        }
        
        String result = "no common";
        int resultValue = Integer.MAX_VALUE;
        
        for(int i=0;i<charArr1.length;i++){
            if(queue.get(charArr1[i])==null){
                continue;
            }
            if(queue.get(charArr1[i])+i<resultValue){
                result = String.valueOf(charArr1[i]);
                resultValue = queue.get(charArr1[i])+i;
            }
        }
        
        return result;
    }
}
