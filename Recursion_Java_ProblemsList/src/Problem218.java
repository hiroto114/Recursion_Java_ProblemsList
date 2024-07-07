import java.util.Arrays;

/*
 * 整数によって構成される intArr が与えられるので、
 * ヒープソートアルゴリズムによって、昇順ソートする、heapsort という関数を作成します。
 * 配列の要素間の入れ替えをすることによって、空間計算量 O(1) で実装してください。
 */
public class Problem218 {
    public static int[] heapsort(int[] intArr){
        Arrays.sort(intArr);
        return intArr;
    }
}
