/*
 * Levy は駅前でチョコレートを販売しており、1 時間ごとに何人がチョコを買ったかデータを集めていました。
 * 各時間帯の買った人数を表すデータはありますが、分析の都合で各時間帯までチョコを買った合計人数にデータを変更したいと思いました。
 * 各時間帯のチョコを買った人数 buyers が与えられるので、その時間帯までにチョコを買った合計人数の配列を返す、sumOfEachElement という関数を定義してください。
 * 
 * sumOfEachElement([1,2,3,4,5]) --> [1,3,6,10,15]
 * sumOfEachElement([5,1,14,7]) --> [5,6,20,27]
 * sumOfEachElement([5,2]) --> [5,7]
 * sumOfEachElement([30,70,300,1,37,49,82,206]) --> [30,100,400,401,438,487,569,775]
 */
public class Problem156 {
    public static int[] sumOfEachElement(int[] buyers){
        int[] result = new int[buyers.length];
        int count = 0;
        for(int i=0;i<buyers.length;i++){
            count += buyers[i];
            result[i] = count;
        }

        return result;
    }
}
