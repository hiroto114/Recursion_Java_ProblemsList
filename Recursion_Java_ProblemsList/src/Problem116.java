import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Gross はクイズ研究会の部長です。
 * クイズ大会に出場するためには 2 人 1 ペアでなくてはならず、Gross はどのようなペアを組ませるか考えていました。
 * そこで、クイズの正解数の差がペアによってバラバラにならないように組ませようと考えました。
 * 各部員の今までのクイズ正解数 scores と絶対値 k が与えられるので、正解数の差が絶対値と等しい部員たちをペアとして返す
 * 、absolutePairs という関数を定義してください。
 * ペアが複数存在する場合は、一次元配列を用いて [a, b, c, d, ...] のように返してください。
 * 複数のペアが存在する場合は、scores の小さい順に返してください。
 * 
 * absolutePairs([8,2,4,3],2) --> [2,4]
absolutePairs([3,9,12,6],3) --> [3,6,6,9,9,12]
absolutePairs([1,41,21,0,3],20) --> [1,21,21,41]
absolutePairs([1,20],5) --> []
absolutePairs([5,5,5,10],5) --> [5,10,5,10,5,10]
absolutePairs([4,3,7,3],0) --> [3,3]
absolutePairs([10,10,10,5],5) --> [5,10,5,10,5,10]
absolutePairs([11,1,35,15,45,21,480,470],10) --> [1,11,11,21,35,45,470,480]
 */
public class Problem116 {
    public static int[] absolutePairs(int[] scores, int k){
        Arrays.sort(scores);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<scores.length-1;i++){
            for(int m=i+1;m<scores.length;m++){
                if(Math.abs(scores[m]-scores[i])==k){
                    list.add(scores[i]);
                    list.add(scores[m]);
                }
            }
        }
        System.out.println(list);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
