import java.util.Arrays;

/*
 * A 国は白菜を生産していましたが、ある年に多く作りすぎてしまいました。
 * そこで他国に分けようと思い、輸出用に白菜を箱詰めしました。
 * 他国も白菜を輸入予定ですが、それぞれいくつ仕入れるかは国ごとに違います。
 * 白菜が入った箱 cabbages（箱ごとに量が異なります）と、他国の受け入れられる箱の数 boxes が与えられるので、
 * 最も多く輸出可能な組み合わせをした場合の白菜の数を返す maximizeProductSum という関数を作成してください。一度使用した箱はその後の計算に使えないものとします。
 * 
 * maximizeProductSum([1,2,3],[4,5,1]) --> 24
 * maximizeProductSum([3,2,5,3],[8,5,12]) --> 99
 * maximizeProductSum([3,2,5],[8,5,12,3,5]) --> 94
 * maximizeProductSum([9,2,24,34,12],[8,5,12,2,9]) --> 769
 */
public class Problem187 {
    public static int maximizeProductSum(int[] cabbages, int[] boxes){
        int result = 0;
        Arrays.sort(cabbages);
        Arrays.sort(boxes);

        for(int i=0;i<Math.min(cabbages.length,boxes.length);i++){
            result += cabbages[cabbages.length-1-i] * boxes[boxes.length-1-i];
        }

        return result;
    }
}
