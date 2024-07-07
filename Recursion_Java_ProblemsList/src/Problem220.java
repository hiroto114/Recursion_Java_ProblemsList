import java.util.Arrays;

/*
 * 整数によって構成される intArr と整数 k（0 < k <= intArr.length）が与えられるので、
 * 配列から k 個の最小値を返す、minKElements という関数を作成してください。
 */
public class Problem220 {
    public static int[] minKElements(int[] intArr, int k){
        Arrays.sort(intArr);

        return Arrays.copyOfRange(intArr, 0, k);
    }
}
