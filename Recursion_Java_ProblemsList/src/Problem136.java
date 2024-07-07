import java.util.HashMap;
import java.util.Map;

/*
 * Brecker がクイズ大会に参加した時、ある文字列をランダムに並び替えた時に、最長となる回文を答える問題が出題されました。
 * 文字列 string が与えられるので、最長の回文の長さを返す、longestPalindromeLength という関数を作成してください。
 * 例えば、文字列 hello 内の文字を組み合わせてできる最長の回文の 1 つは lhl となるので、3 を返します。
 */
public class Problem136 {
    public static int longestPalindromeLength(String input){
        // 入力文字列中の文字列の集計結果
        Map<Character,Integer> map= new HashMap<>();

        // 入力文字列の集計
        for(int i=0;i<input.length();i++){
            // 入力文字が集計結果のmapに含まれている場合
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);
            // 入力文字が集計結果のmapに含まれていない場合
            }else{
                map.put(input.charAt(i),1);
            }
        }
        // 最長回文文字列の長さ
        int result = 0;
        // 出現回数が奇数となる出現回数最大の文字
        Character maxOddChar = input.charAt(0);
        // 出現回数が奇数となる文字の出現回数最大値
        int maxOddNumber = 0;

    	for (Character key : map.keySet()) {
            // 出現回数が偶数のものをカウント
            if(map.get(key).intValue()%2==0){
                result += map.get(key).intValue();
            }else{
                // 出現回数が奇数かつその回数が最大値のものをカウント
                if(map.get(key).intValue()>maxOddNumber){
                    maxOddChar   = key;
                    maxOddNumber = map.get(key).intValue();
                }
            }
		}
        result += maxOddNumber;

    	for (Character key : map.keySet()) {
            // 出現回数が奇数かつ最大出現回数以外のものをカウント
            if(map.get(key).intValue()%2!=0){
                if(key!=maxOddChar){
                    result += map.get(key).intValue()-1;
                }
            }
		}

        return result;

    }
}
