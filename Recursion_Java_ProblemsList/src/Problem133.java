/*
 * Grusin は web サイトを開発しており、サイト内検索機能を実装中です。
 * サイトページ内にある文章に、検索ワードの各文字が入っていれば検索でヒットするようにしました
 * （例 -> 文章：computer science、検索ワード：top の場合、各文字の t, o, p が文章内に入っているため検索に引っかかります）。
 * サイト内にある特定の文章 string、検索ワード word が与えられるので、
 * 検索でヒットするどうか判定する、haveAllCharacters という関数を定義してください。ただし、空白は同じ文字としてカウントしないことにします。
 */
public class Problem133 {
    public static boolean haveAllCharacters(String s, String word){
        int resultCount = 0;
        for(int i=0;i<word.length();i++){
            if(s.contains(word.substring(i,i+1))){
                resultCount++;
            }
        }

        return resultCount == word.length();
    }
}
