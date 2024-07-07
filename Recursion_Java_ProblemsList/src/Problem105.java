import java.util.HashSet;
import java.util.Set;

/*
 * Henry は遊園地で謎解きゲームに参加しており、「次の並んでいる言葉から共通する文字はいくつあるか、答えなさい」という問題が出ました
 * （例えば、["abcd", "abc", "bcd"] のとき、b と c が共通する文字なので 2 を返します）。
 * 小文字アルファベットのみで構成される、複数の文字列 stringList が与えられるので、共通する文字の個数を返す countCommon という関数を作成してください。
 * 
 * countCommon(["abbcdde","baccd","eeaabg"]) --> 2
countCommon(["abcd","efgh","ijk"]) --> 0
countCommon(["abcd","abcd","abcd"]) --> 4
countCommon(["zender","zender","zender"]) --> 5
countCommon(["aaaa","a","aa"]) --> 1
countCommon(["aaaabbbb","aabb","ab"]) --> 2
countCommon(["knight","king","know"]) --> 2
countCommon(["apple","orange","banana","melon","tomato","strawberries"]) --> 0
 */
public class Problem105 {
    public static int countCommon(String[] stringList){
        Set<String> resultSet = convertStringToChar(stringList[0]);

        for(String s: stringList){
            resultSet.retainAll(convertStringToChar(s));
        }
        return resultSet.size();
    }

    public static Set<String> convertStringToChar(String string){
        Set<String> resultSet = new HashSet<String>();

        for(int i=0; i<string.length(); i++){
            resultSet.add(string.substring(i, i+1));
        }
        return resultSet;
    }
}
