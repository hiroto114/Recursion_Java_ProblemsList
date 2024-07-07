/*
 * Gail は出版社で文章校正を担当しており、
 * 全て小文字にする予定の文章に大文字が混ざっていないか確認しています。
 * 文章 s が与えられるので、最初の大文字を返す、firstUppercase という関数を再帰を使って作成してください。ただし、大文字が含まれない場合は、"No upper" と返してください。
 */
public class Problem223 {
    public static String firstUppercase(String s){
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) return s.substring(i,i+1);
        }
        return "No upper";
    }
}
