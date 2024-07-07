import java.util.HashMap;
import java.util.Map;

/*
 * 長さ N の配列 A、B が与えられるので、配列 B の任意の部分配列を何度でも反転させることによって、
 * A と B を等しくする方法があるかどうかを調べる、areTheyEqual という関数を作成してください。
 * 
 * areTheyEqual([1,2,3,4],[2,4,1,3]) --> true
 * areTheyEqual([1,10],[10,1]) --> true
 * areTheyEqual([1,0,3,2],[2,3,0,1]) --> true
 * areTheyEqual([4,8,10],[4,8,11]) --> false
 * areTheyEqual([455,792,872,743,314,353,556,705],[655,138,878,554,662,494,134,343]) --> false
 * areTheyEqual([426,594,498,875,379,960,434,892,403,15,81,725,848,334,346,133,939,868,392,230],[701,189,150,575,976,830,18,5,69,662,676,405,459,917,316,804,599,268,559,660]) --> false
 * areTheyEqual([1,1,1,1],[1,1,1,1]) --> true
 * 
 */
public class Problem259 {
    public static boolean areTheyEqual(int[] targets, int[] arrs){
        Map<Integer,Integer> countTargets = new HashMap<Integer,Integer>();
        for(int target:targets){
            countTargets.put(target,countTargets.getOrDefault(target,0)+1);
        }
        Map<Integer,Integer> countArrs = new HashMap<Integer,Integer>();
        for(int arr:arrs){
            countArrs.put(arr,countArrs.getOrDefault(arr,0)+1);
        }

        if(countTargets.size() != countArrs.size()) return false;

        for(Map.Entry<Integer,Integer> countTarget : countTargets.entrySet()){
            if(!countArrs.containsKey(countTarget.getKey())) return false;
            if(countTarget.getValue() != countArrs.get(countTarget.getKey())) return false;
        }
        return true;

    }
}
