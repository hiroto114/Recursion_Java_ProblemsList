/*
 * Noah はある軍隊の総督です。現在、ランクが与えられている兵士を 1 列に整列させており、その中から 3 人の偵察部隊を編成しています。
 * 偵察部隊には条件があり、ランクが昇順か降順である必要があります。整列している兵士のランク一覧 ranks が与えられるので、
 * 条件を満たす組み合わせの個数を返す、関数 countSpyTeams を作成してください。
 * 
 * 条件: 配列[i] < 配列[j] < 配列[k] もしくは、配列[k] < 配列[j] < 配列[i]
 * 例えば、[4,7,5,6,3] が与えられた場合、（4,5,6）,（7,6,3）,（7,5,3）が条件を満たします。
 * 
 * countSpyTeams([1,1,1]) --> 0
 * countSpyTeams([4,7,5,6,3]) --> 3
 * countSpyTeams([3,2,4]) --> 0
 * countSpyTeams([2,3,4,5]) --> 4
 * countSpyTeams([1,2,3,4,5]) --> 10
 * countSpyTeams([3,8,5,98,23,1,4,6,10,14,35]) --> 60
 * 
 */
public class Problem298 {
	public static int countSpyTeams(int[] ranks) {
		int n = ranks.length;
		int[] smaller = new int[n];
		int[] larger = new int[n];

		// それぞれの要素に対して、小さい要素の数と大きい要素の数を数える
		for (int i = 0; i < n; i++) {
			int smallerCount = 0;
			int largerCount = 0;
			for (int j = 0; j < n; j++) {
				if (ranks[j] < ranks[i]) {
					smallerCount++;
				} else if (ranks[j] > ranks[i]) {
					largerCount++;
				}
			}
			smaller[i] = smallerCount;
			larger[i] = largerCount;
		}

		// スパイチームの数を計算
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += smaller[i] * larger[i];
		}

		return result;
	}
}
