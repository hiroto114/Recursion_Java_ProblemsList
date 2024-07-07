/*
 * Mat は文章作成に便利なツールを開発しています。
 * そこで、ユーザーがいくつか文字列を入力した後に、単語ごとに自動で区切りを入れる機能を実装予定です。
 * 入力された文字列の一覧である stringArr が配列として与えられるので、
 * 文字列ごとにカンマやスペースなどの区切り delimiter を入れて文章として返す、joinWords という関数を作成してください。
 */
public class Problem149 {
    public static String joinWords(String[] stringArr, char delimiter){

        return String.join(String.valueOf(delimiter),stringArr);
    }
}
