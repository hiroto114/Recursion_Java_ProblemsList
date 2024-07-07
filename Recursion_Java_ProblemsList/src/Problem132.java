import java.util.ArrayList;
import java.util.List;

/*
 * Drye は本屋の店長で、新しく入荷した漫画の特設コーナーを作ろうとしました。
 * 詳しくは決めていませんが、縦長になるような配置を考えています。
 * 入荷した漫画の数 books が与えられるので、縦長になる配置の縦の冊数と横の冊数を全て返す、
 * portraitPosition という関数を定義してください。
 * ただし、数字は整数のみで、組み合わせは（縦の冊数, 横の冊数）の順で縦の長さが小さい順に一次元配列として返してください。
 * 
 * portraitPosition(9) --> [9,1]
 * portraitPosition(17) --> [17,1]
 * portraitPosition(24) --> [6,4,8,3,12,2,24,1]
 * portraitPosition(240) --> [16,15,20,12,24,10,30,8,40,6,48,5,60,4,80,3,120,2,240,1]
 */
public class Problem132 {
    public static int[] portraitPosition(int books){
        List<Integer> result = new ArrayList<>();

        for(int i=books; i>Math.sqrt(books); i--){
            if(books%i==0){
                result.add(0,i);
                result.add(1,books/i);
            }
        }

        int formatedResult[] = new int[result.size()];

        for(int i=0;i<result.size();i++){
            formatedResult[i] = result.get(i);
        }

        return formatedResult;

    }
}
