
import java.util.stream.IntStream;
/*
 * Fingal はあるアパレルショップに訪れました。
 * そこでは、服を複数購入した場合、1 点だけ無料にするセールを行なっていました。
 * 購入する服の値段がまとめてある intArr が与えられるので、1 点無料になった際の合計の金額を返す、minAndMax という関数を作成してください。
 * 無料になる服が購入するものの中で最も高いものの場合と、安いものの場合の 2 つを返してください。
 */
public class Problem93 {
    /**
     * minAndMaxメソッド
     * パラメータが偶数ならtrueを返し，奇数ならfalseを返す.
     * @param  intArr 配列
     * @return result 配列の中で最大値を除いたものと最小値を除いたものの合計
     */
    public static int[] minAndMax(int[] intArr){
        if(intArr.length == 0) return new int[]{};
        int sumIntArr = IntStream.of(intArr).sum();
        int max = IntStream.of(intArr).max().getAsInt();
        int min = IntStream.of(intArr).min().getAsInt();

        return new int[]{sumIntArr-max, sumIntArr-min};
    }
}
