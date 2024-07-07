/*
 * Oliver は友人と暗号を使ってメールを送りあっています。
 * それは、通常の文章をスペースはそのままにし、文字だけ反転させるというものです。
 * 与えられた文字列 string を上記の暗号に変換させる、reverseSentence という関数を作成してください。
 */
public class Problem166 {
    public static String reverseSentence(String string){
        StringBuilder result = (new StringBuilder(string.replaceAll(" ", ""))).reverse();
        for(int i=0; i<string.length(); i++){
            if(string.substring(i, i+1).equals(" ")){
                result.insert(i, " ");
            }
        }
        return result.toString();
    }
}
