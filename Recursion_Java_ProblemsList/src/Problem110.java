import java.util.HashMap;
import java.util.Map;
/*
 * あるテレビ番組では、誰でも参加できるクイズ番組を企画しています。
 * この番組では、参加者にランダムに数字が配られ、同じ数字を持つ人同士がペアになります。
 * しかし、番組側はペアになれない参加者が出る可能性も考慮しています。
 * 参加者の番号の一覧が整数の配列 intArr として与えられるので、
 * ペアになれない人数を返す findAlone という関数を作成してください。
 * 例えば、配列が [10,20] の場合、どちらの参加者もペアになれないので 2 を返します。
 * 配列が [1,5,7,5,2,5,7,10,15] の場合、ペアになれない参加者は 5 人なので 5 を返します。
 * 
 * findAlone([10,20]) --> 2
 * findAlone([1,5,7,5,2,5,7,10,15]) --> 5
 * findAlone([-100,5,7,5,2,5,5,-100,15,5]) --> 4
 * findAlone([100,2,2,100]) --> 0
 * findAlone([1,1,1,1]) --> 0
 * findAlone([1,1,1]) ->1
 * 
 * 実験をして規則性をつかむ感じ。
 */
public class Problem110 {
    public static int findAlone(int[] intArr){
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<intArr.length;i++){
            if(map.get(intArr[i])==null){
                map.put(intArr[i],1);
            }else{
                map.put(intArr[i],map.get(intArr[i])+1);
            }
        }

        int result =0;
        for (Integer value : map.values()) {        
            result += value%2;   
        }     
        return result;
    }
}
