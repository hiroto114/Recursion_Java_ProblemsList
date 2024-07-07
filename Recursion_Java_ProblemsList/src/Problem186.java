import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Bill は映画監督で今まで何本も映画を作成してきました。
 * 現在、自分が作った映画がどれくらいヒットしたか気になっています。
 * そこで、後に上映された映画の累計来場者数より来場者数が多い映画があるかを調べ始めました。
 * 各映画の来場者数 visitors が与えられるので、その映画より後に上映された累計来場者数より大きいものを全て返す getAllMovies という関数を作成してください。
 * 
 * getAllMovies([16,17,4,3,5,2]) --> [17,5,2]
 * getAllMovies([16,17,3,4,3,5,2]) --> [5,2]
 * getAllMovies([1,32,31,30,25,0,5,0]) --> [25,5,0]
 * getAllMovies([1,9,31,8,5,0]) --> [31,8,5,0]
 * getAllMovies([6,3,0,0,2,1]) --> [2,1]
 * getAllMovies([100,29,20,3,2,1]) --> [100,29,20,2,1]
 * 
 * 下記やりかたなら時間計算量O(n)でいける。
 * 
 */
public class Problem186 {
	public static int[] getAllMovies(int[] visitors) {
		int total = Arrays.stream(visitors).sum();
		System.out.println(total);
		ArrayList<Integer> list = new ArrayList<>();
		int amount = visitors[visitors.length - 1];
		list.add(amount);
		for (int i = visitors.length - 2; i >= 0; i -= 1) {
			if (amount < visitors[i]) {
				list.add(visitors[i]);
			}
			amount += visitors[i];
		}
		Collections.reverse(list);

		// 連結リストをint型の配列に変換
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
