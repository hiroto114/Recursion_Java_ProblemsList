
import java.util.HashMap;
import java.util.Map;
/*
 * Best はある対戦ゲームの開発者です。
 * ゲームの調整で参考にするために、ランクが 1 しか変わらない人たちがどれくらいいるか調べようと思いました。
 * ユーザーのランク一覧 ranks が与えられるので、値の差が 1 となる 2 つの整数によって構成される配列の最大の長さを返す、
 * getMaxLength という関数を定義してください。
 * 例えば、[1,2,3,3,2,1,2,2] が与えられたとき、差が 1 となる 2 つの整数によって構成される配列は [1,2,2,1,2,2] と [2,3,3,2,2,2] となるので
 * 最大の個数として 6 が返されます。もしそのような配列が存在しない場合は、0 を返してください。
 * 
 * getMaxLength([0,1,5]) --> 2
 * getMaxLength([0,1,0,1,2]) --> 4
 * getMaxLength([0,0,0,0,0]) --> 0
 * getMaxLength([0,10,20,30,40]) --> 0
 * getMaxLength([1,2,3,3,2,1,2,2]) --> 6
 * getMaxLength([1,2,2,2,1,3,4,4,4,3]) --> 5
 * getMaxLength([1,2,3,4,3,2,1,2,2,1]) --> 7
 * getMaxLength([1,1,2,2,2,4,4,6,6,7,8]) --> 5
 * getMaxLength([102,103,44,57,309,104,103,104,104]) --> 5
 */
public class Problem92 {
    public static int getMaxLength(int[] ranks){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<ranks.length;i++){
            map.put(ranks[i],map.getOrDefault(ranks[i],0)+1);
        }

        Integer result = 0;
        for (Integer key : map.keySet()) {
            if(!map.containsKey(key+1)) continue;
            result = Math.max(result, map.get(key)+map.get(key+1));
        }

        return result.intValue();
    }
}
