import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Curry は手札を全て出したら勝利できるカードゲームに参加しています。
 * 同じカードを場に出す場合、数ターンの間待つ必要があります。
 * Curry の手札のカード hand と、待ちのターン数 turn が与えれたとき、全ての手札を出すために必要な最小のターン数を返す、minimumTurn という関数を作成してください。
 * 
 * 例えば、["J","J","Q","Q"], 2 の場合、J -> Q ->（1ターン）-> J -> Q の合計 5 ターンが必要になります。
 * また、["J","J","Q","Q"], 0 の場合は、待ちのターン数が 0 なので、J -> J -> Q -> Q の合計 4 ターンが最小のターン数となります。
 * 
 * minimumTurns(['J','J','Q','Q'],2) --> 5
 * minimumTurns(['J','J','Q','Q'],0) --> 4
 * minimumTurns(['J','J','Q','Q','Q','J'],3) --> 10
 * minimumTurns(['J','Q','Q'],30) --> 32
 * minimumTurns(['J','Q','Q','J'],30) --> 33
 * minimumTurns(['Q','Q','Q','Q','Q','Q','K','J','J','K','Q'],3) --> 25
 * minimumTurns(['Q','Q','Q','Q','Q','Q','K','K','K','J','J','J','J','Q','Q','Q','J','K'],2) --> 25
 * 
 */
public class Problem308 {
	// JQK以外の文字が入ってきた時の対応版
	public static int minimumTurns(char[] hand, int turn){
		if(turn == 0) return hand.length;
		Map<Character, Integer> countHashMap = new HashMap<Character, Integer>();
		for(char c: hand){
			countHashMap.put(c, countHashMap.getOrDefault(c, 0) + 1);
		}

		List<Character> result = new ArrayList<Character>();
		int resultPointer = 0;
		Map<Character, Integer> lastIndexMap = new HashMap<Character, Integer>();
		// もっとも出現回数が多い文字とその回数を記憶する変数
		char maxString = 'A';
		int maxIndex   = -1;

		while(countHashMap.size() != 0){
			maxString = 'A';
			maxIndex  = -1;
			for(Map.Entry<Character, Integer> map: countHashMap.entrySet()){
				if(map.getValue() > maxIndex){
					maxString = map.getKey();
					maxIndex = map.getValue();
				}
				if(map.getValue() == maxIndex){
					if(lastIndexMap.get(map.getKey()) == null){
						maxString = map.getKey();
					}else if(lastIndexMap.get(maxString) == null){
					}else{
						maxString = (lastIndexMap.get(map.getKey()) > (lastIndexMap.get(maxString)) ? maxString: map.getKey());
					}
				}
			}
			if(lastIndexMap.get(maxString) == null || resultPointer - lastIndexMap.get(maxString) > turn){
				result.add(maxString);
				lastIndexMap.put(maxString, resultPointer);
				resultPointer += 1;
				if(countHashMap.get(maxString) != null && countHashMap.get(maxString) == 1){			    
					countHashMap.remove(maxString);
				}else if (countHashMap.get(maxString) != null){
					countHashMap.put(maxString, countHashMap.get(maxString) - 1);
				}
				continue;
			}
			result.add(null);
			resultPointer += 1;
		}
		return result.size();
	}
}
