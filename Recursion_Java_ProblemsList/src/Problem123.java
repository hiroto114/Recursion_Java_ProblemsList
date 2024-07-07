import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Hamilton は RPG ゲームをプレイしており、ゲーム中にどのレベルのモンスターが一番頻繁に出現するかを知りたがっています。
 * ゲーム中に出現したモンスターのレベルの一覧 levels が与えられるので、最も出現回数が多いレベルを見つけ、
 * そのレベル（または複数のレベル）を昇順に並べた配列として返す appearTheMost という関数を作成してください。
 * 例えば、レベルの一覧が [12,10,9,8,6,3,8,9,9,10] の場合、最も多く出現したレベルは 9 なので、[9] を返します。
 */
public class Problem123 {
    public static int[] appearTheMost(int[] levels){
        Map<Integer, Integer> countLevels = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for(int i=0;i<levels.length;i++){
            if(countLevels.get(levels[i])==null){
                countLevels.put(levels[i],1);
            }else{
                countLevels.put(levels[i],countLevels.get(levels[i])+1);
            }
        }

        Integer maxValue = Collections.max(countLevels.values());
        countLevels.forEach((key,value) -> {
    	    if(value == maxValue){
                resultList.add(key);
            }
	    });

        int resultArray[] = new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            resultArray[i]=resultList.get(i);
        }
        Arrays.sort(resultArray);
        return resultArray;
    }
}
