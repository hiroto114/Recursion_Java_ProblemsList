import java.util.HashMap;
import java.util.Map;

/**
 * 主に英語圏においてインターネット上で使われるアルファベットの表記法として Leet と呼ばれるものがあります。
 * これは一部のアルファベットを、一定の規則に基づき形の似た数字や記号などに置き換える表記法です。
 * Leet は単純に遊び心で使われる他、当局や著作権関連機関または初心者などの検索を回避する目的で使われることがありました。
 * ここでは、ある文字列 string が渡されるので、それを Leet で書き換える leetify という関数を作成してください。
 * ただし変換するのは以下の文字が入力された際のみに限ります。
 * a/A = 4
 * b/B = 8
 * e/E = 3
 * l/L = 1
 * o/O = 0
 * s/S = 5
 * t/T = 7
 * z/Z = 2
 */
public class Problem18 {
	// よく使うものは定数化してまとめる。
    public static Map<Character, Integer> charConverter = new HashMap<Character, Integer>();
    // static変数に対する初期化はstaticイニシアライザで実施。超大事。
    static{
        charConverter.put('a',4);
        charConverter.put('A',4);
        charConverter.put('b',8);
        charConverter.put('B',8);
        charConverter.put('e',3);
        charConverter.put('E',3);
        charConverter.put('l',1);
        charConverter.put('L',1);
        charConverter.put('o',0);
        charConverter.put('O',0);
        charConverter.put('s',5);
        charConverter.put('S',5);
        charConverter.put('t',7);
        charConverter.put('T',7);
        charConverter.put('z',2);
        charConverter.put('Z',2);
    }
    public static String leetify(String stringInput){
        StringBuilder result = new StringBuilder("");
        for(int i=0; i<stringInput.length(); i++){
            if(charConverter.get(stringInput.charAt(i)) != null){
                result.append(charConverter.get(stringInput.charAt(i)));
            }
            else{
                result.append(stringInput.charAt(i));
            }
        }
        return result.toString();
    }
}
