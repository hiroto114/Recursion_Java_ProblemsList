
import java.util.Arrays;

public class Problem483 {
	public static int maxLengthOfTrees(int[] intArr) {
		// ヒント見ずに挑戦！！　-> ユーザー解答から学んだことを使ったversion
		int[] cache = new int[intArr.length];
		//すべて要素を１にする。以下はfillメソッドを使って短く書いた。
		Arrays.fill(cache, 1);
		//いつもの書き方↓
		/*for (int i = 0; i < intArr.length; i++){
		    cache[i] = 1;
		}*/
		//配列の末尾のひとつ前の要素からタビュレーションを使う。
		//cache[i]の値はインデックスiから始まる木の並びの最大の長さ
		for (int i = intArr.length - 2; i >= 0; i--) {
			int maxadd = 0;
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[i] < intArr[j] && cache[j] > maxadd) {
					maxadd = cache[j];
				}
			}
			cache[i] += maxadd;
		}
		//あとは固定配列cacheの最大要素を出すだけで解ける？？！！
		int maxTree = 0;
		for (int element : cache) {
			// i にcache配列内の要素が一つずつ入る
			if (element > maxTree)
				maxTree = element;
		}
		return maxTree;

	}
}
