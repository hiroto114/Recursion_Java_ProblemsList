
import java.util.HashMap;
/*
 * Amuedo はあるゲームに参加しています。このゲームでは、参加者にランダムに数字が書かれたカードが複数枚配られます。
 * 参加者は、カードに書かれた数字が、その数値と同じ回数だけ手持ちに存在するかを確認する必要があります。
 * 例えば、手持ちのカードが [1,2,3,4,4,4,4,1,3,5,3] の場合、3 枚の「3」と 4 枚の「4」がこの条件に合致します。
 * この条件に合う中で最も大きい数字を場に出します。場に出した数字が最も大きい参加者が勝者となります。
 * 関数 findMax を作成して、渡されたカードの数字の配列 numbers から、場に出すべき数字を返してください。
 * 
 * findMax([1,1,2,3,3,3,4,4,4,4,5]) --> 4
 * findMax([1,1,2,2,4,4,5,6,7]) --> 2
 * findMax([1,2,2,3,3,3,4,5,6,7]) --> 3
 * findMax([1,1,2]) --> 0
 * findMax([11,200,35,8,34,56,8,8,30,8,450,2,8,2,70,8,400,8,8]) --> 8
 */
public class Problem91 {
    public static int findMax(int[] numbers){
        // 関数を完成させてください
        HashMap<Integer, Integer> hash_map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++){
            if (hash_map.get(numbers[i]) == null) hash_map.put(numbers[i], 1);
            else hash_map.replace(numbers[i], hash_map.get(numbers[i]) + 1);
        }
        int max = 0;
        for (int i : hash_map.keySet()){
            if (i == hash_map.get(i)) max = i;
        }

        return max;
    }
}
