
/*
 * 文字列 s と文字 c が入力として与えられるので、s の中で c が最初に現れる位置までの部分文字列を取得し、
 * その部分文字列を小文字に変換する関数 lowercaseSubstringUpToChar を作成してください。
 * s の中に c が含まれていない場合は、s をそのまま返してください。
 */
public class Problem584 {
    public static String lowercaseSubstringUpToChar(String s, char c){
        int charAt = s.indexOf(String.valueOf(c));
        if(charAt == -1) return s;
        if(charAt == 0) return "";

        return s.substring(0,charAt).toLowerCase();
    }
}
