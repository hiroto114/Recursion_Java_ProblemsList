import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/*
 * ある学校では文化祭のときに、生徒全員に数字をランダムに配っています。
 * そして同じ数字同士を持つペアが現れたら、テーマパークのペアチケットをプレゼントしています。
 * 同じ数字を持つ生徒が 3 人以上いたら適応外になります。
 * 生徒たちが持っている数字 numbers が与えられるので、ペアになる生徒たちの数字を返す findPairs という関数を作成してください。
 * 配列は昇順で返してください。
 * 
 * findPairs([10,12,13,14,15,16,16,7,7,8]) --> [7,16]
 * findPairs([1,1]) --> [1]
 * findPairs([1,2]) --> []
 * findPairs([1,2,3,4,5,6,6,7,7,8]) --> [6,7]
 * findPairs([1,3,6,3,1,4,6,4]) --> [1,3,4,6]
 * findPairs([3,3,-1,-1,1,6,6,4,4]) --> [-1,3,4,6]
 * findPairs([30,30,30,30,1,600,600,40,40,40]) --> [600]
 */
public class Problem115 {
    public static int[] findPairs(int[] numbers){
        Map<Integer,Integer> countNumbers = new TreeMap<Integer,Integer>();
        
        // ここら辺の処理はgetOrDefaultで1行で書ける。ただし1行に複数の意味を持たせることになる。
        for(int i:numbers){
            if(countNumbers.containsKey(i)){
                countNumbers.replace(i,countNumbers.get((Integer)i)+1);
            }else{
                countNumbers.put(i,1);
            }
        }

        List<Integer> result = new ArrayList<Integer>();

		for(Map.Entry<Integer, Integer>entry : countNumbers.entrySet()){
            if(entry.getValue()==2){
                result.add(entry.getKey());
            }
		}

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
