/*
 * Barbara は友達と伝言ゲームをすることにしました。
 * 最初の人が 1 つの英単語 string1 を伝達したのですが、最終的には string2 という英単語として伝わりました。
 * この 2 つの英単語の文字数は同じでしたが、果たしてどれくらいスペルの違いがあったでしょうか。
 * 2 つの文字列のハミング距離を返す、hammingDistanceInString という関数を作成してください。
 */
public class Problem86 {
    public static int hammingDistanceInString(String string1, String string2){
        int result = 0;
        for(int i=0;i<string1.length();i++){
            if(string1.charAt(i) != string2.charAt(i)){
                result += 1;
            }
        }
        return result;
    }
}
