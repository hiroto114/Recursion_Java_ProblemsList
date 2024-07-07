/*
 * Valerie は与えられた文字カードを並べて、単語を作るカードゲームを開発しています。
 * ゲーム中に、2 人のプレイヤーの手札を交互に並べる処理をつける予定です。
 * 空白を含まない、サイズが同じ文字列 s1 と s2 が与えられるので、それぞれの手札のカードを s1->s2 の順序で交互に組み合わせる、
 * mergeString という関数を再帰を使って作成してください。
 * 
 * mergeString("abc","def") --> adbecf
 * mergeString("hello","world") --> hweolrllod
 * mergeString("a","b") --> ab
 * 
 */
public class Problem221 {
    public static String mergeString(String s1, String s2){
        StringBuilder result = new StringBuilder("");
        for(int i=0;i<s1.length();i++){
            result.append(s1.substring(i,i+1));
            result.append(s2.substring(i,i+1));
        }

        return result.toString();
    }
}
