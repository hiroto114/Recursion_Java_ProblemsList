import java.util.HashMap;
import java.util.Map;

/*
 * 母音かどうかを判定
 */
public class Problem31 {
    /**
     * 母音のハッシュマップ
     * 与えられた文字が母音かどうかを判定する際に使用する
     */
    public static Map<Character, Character> vowelMap = new HashMap<Character, Character>();
    static{
        vowelMap.put('a','a');
        vowelMap.put('A','A');
        vowelMap.put('i','i');
        vowelMap.put('I','I');
        vowelMap.put('u','u');
        vowelMap.put('U','U');
        vowelMap.put('e','e');
        vowelMap.put('E','E');
        vowelMap.put('o','o');
        vowelMap.put('O','O');
    }
    public static boolean isVowel(char alphabet){
        return vowelMap.get(alphabet) != null;
    }
}
