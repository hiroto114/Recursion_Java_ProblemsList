import java.util.Arrays;
import java.util.Comparator;

/*
 * Bryan は単語が与えられたら自動で文章にするアプリの開発に挑戦しています。
 * 手始めにいくつか単語を与えられた時に、文字数の少ない順に並び替える処理を作ろうとしています。
 * 単語の配列 words が与えられるので、文字数の少ない順に並べ替えて文字列として返す、sortByLength という関数を作成してください。
 * 単語の間には空白を挿入してください。また文字数が同じ場合は元の配列の順で返してください。同じ文字列は異なるものとして扱うように注意してください。
 * 
 * sortByLength(["am","California","I","from"]) --> I am from California

sortByLength(["ab","cd","ef","gh"]) --> ab cd ef gh

sortByLength(["ab","cde","fg","hij","klmno","p"]) --> p ab fg cde hij klmno

sortByLength(["eaque","aut","in","atque","labore","sed","pariatur","excepturi","aut","ducimus","occaecati","totam","et","error","omnis","cumque","ab"]) 
--> in et ab aut sed aut eaque atque totam error omnis labore cumque ducimus pariatur excepturi occaecati

sortByLength(["fuga","recusandae","quia","tempora","corporis","dolore","facere","velit","ea","recusandae","vitae","consequatur","velit","quod","et"
,"aspernatur","nobis","pariatur","laborum","nesciunt","et","odio","ex","sunt","earum","et","at","voluptas","cum","aut"]) 
--> ea et et ex et at cum aut fuga quia quod odio sunt velit vitae velit nobis earum dolore facere tempora laborum corporis pariatur nesciunt voluptas recusandae recusandae aspernatur consequatur

sortByLength(["ex","officiis","quia","ut","et","assumenda","saepe","praesentium","reiciendis","ut","quia","tempore","recusandae","dolores","quasi"]) 
--> ex ut et ut quia quia saepe quasi tempore dolores officiis assumenda reiciendis recusandae praesentium

sortByLength(["culpa","quas","autem","id","adipisci","numquam","modi","perspiciatis","fugit","eaque","dolor","sed","omnis","nisi","nam","dolorem"
,"perspiciatis","quaerat","dolor","et","sint","esse","voluptas","quidem","delectus","consequatur","fugit"]) 
--> id et sed nam quas modi nisi sint esse culpa autem fugit eaque dolor omnis dolor fugit quidem numquam dolorem quaerat adipisci voluptas delectus consequatur perspiciatis perspiciatis
 */
public class Problem154 {
    public static String sortByLength(String[] words){
        StringBuilder result = new StringBuilder("");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(words,comparator);

        for(int i=0;i<words.length;i++){
            result.append(words[i]+" ");
        }

        return result.toString().substring(0,result.toString().length()-1);
    }
}
