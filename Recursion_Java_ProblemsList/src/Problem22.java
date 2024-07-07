/**
 * 文字列 s と数値 i を受け取り、i 番目に「_」を入れた文字列を返す、insertUnderscoreAt という関数を作成してください。
 * 数値 i が受け取った文字列のサイズ以上の場合、文字列はそのまま返されます。
 */
public class Problem22 {
    public static String insertUnderscoreAt(String s, int i){
        if(i>=s.length()) return s;
        return s.substring(0,i)+'_'+s.substring(i);
    }
}
