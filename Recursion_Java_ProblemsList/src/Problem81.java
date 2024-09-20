
import java.util.ArrayList;
import java.util.List;
/*
 * Paul は数字を使ったゲームに参加しました。
 * 読み手が自然数を読み上げるので、参加者は床に落ちている数字から 2 つを選び、
 * それを掛け合わせた値が読み手の数字と一致したときに得点をもらえるルールです。
 * 床にばら撒かれている数字群を表す配列 numbers と読み手の数字 mark が与えられるので、
 * 掛け合わせたときに一致する 2 つの数字の位置を返す indexOfPairsForMark という関数を作成してください。
 * 複数組み合わせがある場合は最も若いインデックスが含まれているペアから順に 1 次配列で返してください。
 */
public class Problem81 {
    public static int[] indexOfPairsForMark(int[] numbers, int mark){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int p=i+1;p<numbers.length;p++){
                if(numbers[i]*numbers[p]==mark){
                    list.add(i);
                    list.add(p);
                }
            }
        }
        int[] stringArray = new int[list.size()];
        for(int i=0;i<list.size();i++){
            stringArray[i] = list.get(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
