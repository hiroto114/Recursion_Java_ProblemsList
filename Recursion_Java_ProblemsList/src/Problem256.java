import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 自然数 num と、自然数によって構成される配列 intArr が与えられます。
 * 配列の各要素はある一定時間 T ごとに 1 ずつ減少していき、0 に近づいていきます。
 * 一定時間 T では num 個の要素しかアクセスすることができません。
 * 配列の各要素が 0 になる前にアクセスできる最大の要素数を返す、maximumAccess という関数を作成してください。
 * チャレンジ : 時間計算量 O(n) で解いてみましょう。
 * 
 * maximumAccess(1,[2,1]) --> 2
 * maximumAccess(1,[2,1,1]) --> 2
 * maximumAccess(1,[3,1,1,1]) --> 2
 * maximumAccess(1,[3,3,3,3]) --> 3
 * maximumAccess(2,[1,1,1,3,3,3]) --> 5
 * maximumAccess(2,[1,2,2,2,3,3]) --> 6
 * maximumAccess(1,[5,2,1,1,1]) --> 3
 * maximumAccess(1,[6,4,2,2,2,1]) --> 4
 * maximumAccess(1,[5,1,1,4,3]) --> 4
 * maximumAccess(87,[869,956,660,865,399,768,616,520,869,102,598,588,105,393]) --> 14
 * maximumAccess(235,[746,272,107,449,957,500,408,284,263,761,889,513,431,398,867,916]) --> 16
 * maximumAccess(623,[601,749,658,905,908,284,359,5,146,455,942,742,638,124,626,306,618,108,291,51,913,477,76,454,932,89]) --> 26
 * maximumAccess(60,[498,412,181,166,396,668,28,500,325,342,709,241,203,554,934,755,238,111,760,399,522]) --> 21
 * 考え方
 * ①int型の配列intArrをInteger型のリストintListに変換
 * ②Integer型のリストintListを降順ソート
 * ③while文でcounter = 1 → intArrのmaxまで繰り返す
 * ④③のwhile文の中で下記を繰り返す
 * 　④-1,同時に見れるのはnum個
 * 　④-2,intListの要素が1以上かつ一番後ろの値が正のときresult += 1
 * 　④-3,④-2の要素を削除
 * 　④-4,intListの各要素を-1かつ正の要素でフィルタリング
 * 　④-5,counter += 1
 */
public class Problem256 {
	public static int maximumAccess(int num, int[] intArr){
		List<Integer> intList = new ArrayList<Integer>();
		for(int p: intArr){
			intList.add(p);
		}
		Collections.sort(intList, Collections.reverseOrder());

		int result = 0;
		int counter = 1;
		int stop = intList.get(0);
		// 同じものを見たくないんで、一度見たものは順次削除しないといけない
		while(counter <= stop){
			for(int i=1;i<=num;i++){
				if(intList.size() > 0 && intList.get(intList.size()-1) > 0){
					result += 1;
					intList.remove(intList.size()-1);
				}
			}
			intList= intList.stream().map(x -> x-1).filter(x -> x > 0).collect(Collectors.toList());
			counter += 1;
		}

		return result;
	}
}
