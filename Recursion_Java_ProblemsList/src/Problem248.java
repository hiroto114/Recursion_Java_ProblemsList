import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Joe は数字をランダムに作成するシステムを開発しました。しかし、きちんとランダムに作成されるか心配なため、
 * 使われている数字が偏っていないか確認しようと思いました。複数の生成された数字 intArr が与えられるので、
 * 各要素の各桁の数値を抽出して重複を無くし、小さい順で構成される配列を返す、sortByUnique という関数を作成してください。
 * 
 * sortByUnique([131,11,48]) --> [1,3,4,8]
 * sortByUnique([100,110,10101]) --> [0,1]
 * sortByUnique([897,654,123,1000]) --> [0,1,2,3,4,5,6,7,8,9]
 * 
 */
public class Problem248 {
	public static int[] sortByUnique(int[] intArr){
		Map<String,Integer> map= new HashMap<>();
		for(int i=0;i<intArr.length;i++){
			for(int m=0;m<String.valueOf(intArr[i]).length();m++){
				if(map.get(String.valueOf(intArr[i]).substring(m,m+1))==null){
					map.put(String.valueOf(intArr[i]).substring(m,m+1),1);
				}
			}
		}

		int[] strResult = new int[map.size()];
		int i = 0;
		for (String key : map.keySet()) {        
			strResult[i] = Integer.parseInt(key);
			i = i+1;
		}    
		Arrays.sort(strResult);

		return strResult;
	}
}
