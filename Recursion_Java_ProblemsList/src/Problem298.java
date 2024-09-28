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
 * 【思想】
 * 1,配列のある要素を中心としてその左側と右側でその値よりも大きいものと小さいものの数を取得する
 * 2,3つの要素の中の中心が配列の0~n-1番目のときはどうするか？
 * 3,2については1でできた配列に左側と右側に自分より大きいものと小さいものの要素の個数が配列として出ている。
 * 4,よってその配列を使って計算ができる
 */
public class Problem298 {
    public static void main(String[] args) {
        System.out.println(countSpyTeams(new int[]{1, 1, 1}) == 0);           // 期待値: 0
        System.out.println(countSpyTeams(new int[]{4, 7, 5, 6, 3}) == 3);     // 期待値: 3
        System.out.println(countSpyTeams(new int[]{3, 2, 4}) == 0);           // 期待値: 0
        System.out.println(countSpyTeams(new int[]{2, 3, 4, 5}) == 4);        // 期待値: 4
        System.out.println(countSpyTeams(new int[]{1, 2, 3, 4, 5}) == 10);    // 期待値: 10
        System.out.println(countSpyTeams(new int[]{3, 8, 5, 98, 23, 1, 4, 6, 10, 14, 35}) == 60);  // 期待値: 60
    }
	public static int countSpyTeams(int[] ranks) {
		int n = ranks.length;
		int[] leftSmaller = new int[n];
		int[] leftLarger  = new int[n];
		int[] rightSmaller = new int[n];
		int[] rightLarger  = new int[n];

		// それぞれの要素に対して、小さい要素の数と大きい要素の数を数える
		for (int i = 0; i < n; i++) {
			int leftSmallerCount = 0;
			int rightLargerCount = 0;
			int leftLargerCount = 0;
			int rightSmallerCount = 0;
			for (int j = 0; j < n; j++) {
				if (ranks[j] < ranks[i] && j < i) leftSmallerCount++;
				if (ranks[j] > ranks[i] && j > i) rightLargerCount++;
				if (ranks[j] > ranks[i] && j < i) leftLargerCount++;
				if (ranks[j] < ranks[i] && j > i) rightSmallerCount++;
			}
			leftSmaller[i]=leftSmallerCount;
			rightLarger[i]=rightLargerCount;
			
			leftLarger[i]=leftLargerCount;
			rightSmaller[i]=rightSmallerCount;
		}

		// スパイチームの数を計算
		int result = 0;
		for (int i = 0; i < n; i++) {
		    result+=leftSmaller[i]*rightLarger[i]+leftLarger[i]*rightSmaller[i];
		}

		return result;
	}
}
