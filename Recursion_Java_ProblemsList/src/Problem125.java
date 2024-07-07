import java.util.ArrayList;
import java.util.List;

/*
 * Fowler は映像ディレクターで、ドラマに何度も同じ文字が流れる演出を入れようとしました。
 * 2 文字以上の文字列 string が与えられるので、特定の文字列の繰り返しになっているかどうか判定する、hasSamePattern という関数を定義してください。
 * これめちゃくちゃ簡単な方法があってpatternStr＋patternStrの1番目から最後から2番めまでの文字列の中でpatternStrが含まれているの結果を返すというもの。
 */
public class Problem125 {
    public static boolean hasSamePattern(String patternStr){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<patternStr.length();i++){
            if(patternStr.length()%i==0){
                list.add(i);
            }
        }

        for(Integer Int :list){
            if((patternStr.substring(0,Int).repeat(patternStr.length()/Int))
                .equals(patternStr)){
                return true;
            }
        }

        return false;
    }
}
