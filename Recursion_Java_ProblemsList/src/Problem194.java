/*
 * Oliver は友人と暗号を使ってメールを送りあっています。
 * それは、通常の文章のスペースと重複する文字を取り除いた後、文章を反転させるというものです。
 * 与えられた文字列 string を上記の暗号に変換させる、stringReversal という関数を作成してください。
 * 重複した文字は、反転前の右側に出てきた文字を扱います（例：AWA と出た場合は、左側の A を消して右側にある A を使う）
 */
public class Problem194 {
    public static String stringReversal(String s){
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(' '== s.charAt(i)){
                continue;
            }
            if(result.indexOf(s.substring(i,i+1))==-1){
                result.append(s.substring(i,i+1));
            }
        }

        return result.toString();
    }
}
