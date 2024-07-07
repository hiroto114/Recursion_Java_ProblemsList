import java.util.HashMap;
import java.util.Map;
/*
 * Beck は倉庫の整理係で、倉庫内にある荷物には全て商品番号が振られています。
 * ある日、地震が起きて棚にある荷物が全て落ちてしまい、Beck は急いで棚に戻したら荷物の順番がバラバラになりました。
 * 地震前の荷物 arr と地震後の荷物 shuffledArr が与えられるので、地震が起きた後に何%の荷物が移動したかを返す、
 * shuffleSuccessRate という関数を定義してください。小数点以下に対しては切り捨ての処理を行ってください。
 * また商品番号は一意であるとします。
 * shuffleSuccessRate([2,32,45],[45,32,2]) --> 66
 * shuffleSuccessRate([2,32,45],[45,2,32]) --> 100
 * shuffleSuccessRate([2,32,45],[2,32,45]) --> 0
 */
public class Problem74 {
    public static int shuffleSuccessRate(int[] arr, int[] shuffledArr){
        Map<Integer, Integer> mapShuffledArr = new HashMap<>();
        int result[] = new int[arr.length];

        for(int i=0;i<shuffledArr.length;i++){
            mapShuffledArr.put(shuffledArr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            result[i] = mapShuffledArr.get(arr[i]);
        }

        double resultCount = 0;
        for(int i=0;i<result.length;i++){
            if(i!=result[i]) resultCount++;
        }

        return (int) ((resultCount/arr.length)*100);
    }
}
