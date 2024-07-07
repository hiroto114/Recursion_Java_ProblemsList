import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
 * 整数で構成される配列 num1 と num2 が与えられるので、
 * 配列の中でお互い被っている要素を配列で返す、intersectionOfArrays という関数を作成してください。
 * ただし、同じ数値の要素は区別せず、小さい数字から順番に返してください。O(N)
 * 時間計算量はO(n)でいかないとな。
 * ①ソートするやり方→O(nlogn)かかっちゃうので別のやり方を模索せねば。
 * ②こういう時に便利なデータ構造ってなかったっけ。
 * ③hashmapや！！！！,,,,と思ったけどこれは違った。最終的に答えが昇順にならずO(nlogn)使うことになる。
 * ④ハイブリッドソートの出番。
 * とおもったけど、下記やり方では各要素が負の場合に対応できない。
 * なので下記コメント欄のやり方でいこう。
 */
public class Problem177 {
	public static int[] intersectionOfArrays(int[] intList1, int[] intList2){
		// ハイブリッドソート
		int[] sortedIntList1 = new int[IntStream.of(intList1).max().getAsInt() + 1];
		// 時間計算量O(n)
		for(int i: intList1) {
			sortedIntList1[i] = sortedIntList1[i] + 1;
		}

		// 時間計算量O(m)
		int[] sortedIntList2 = new int[IntStream.of(intList2).max().getAsInt() + 1];
		for(int i: intList2) {
			sortedIntList2[i] = sortedIntList2[i] + 1;
		}
		
		List<Integer> result = new ArrayList<Integer>();
		// 時間計算量O(n)
		for(int i=0; i<sortedIntList1.length; i++) {
			if(sortedIntList1[i] > 0 && sortedIntList2[i] > 0 ) result.add(i);
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
		
	}
/*
 *     public static int[] intersectionOfArrays(int[] intList1, int[] intList2){
        Arrays.sort(intList1);
        Arrays.sort(intList2);
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<intList1.length;i++){
            for(int m=0;m<intList2.length;m++){
                if(intList1[i] == intList2[m] && !list.contains(intList1[i])){
                    list.add(intList1[i]);
                    break;
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
 */
}
