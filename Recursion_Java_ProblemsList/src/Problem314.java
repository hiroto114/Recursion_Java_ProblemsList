/*
 * Lawrence は町開発のために、幅が広い山を探していました。
 * 各地点の高さを一覧にした配列 heights が与えられるので、最も幅が広い山の長さを返す、findMaxWidth という関数を作成してください。
 * 各地点ごとに 1 メートルの幅があるとし、山がない場合は 0 を返します。
 * 
 * findMaxWidth([1,2]) --> 0
 * findMaxWidth([1,2,3]) --> 0
 * findMaxWidth([5,3,2,1]) --> 0
 * findMaxWidth([2,4,4,1]) --> 0
 * findMaxWidth([7,6,9,12,8,7,10]) --> 5
 * findMaxWidth([7,6,9,12,8,8,10,12,13]) --> 4
 * findMaxWidth([7,6,9,12,8,8,10,12,13,15,11,10,8,5]) --> 9
 * 
 */
public class Problem314 {
	public static int findMaxWidth(int[] heights){
		// 長さが2以下ならそもそも山は作れない
		if(heights.length <= 2) return 0;
		int result = 0;
		// ここに解の候補を入れる
		int expectedResult = 1;
		// iを山の頂点と見立てて、left・rightで山の左端、右端とする。
		int left = 0;
		int right = 0;
		// iを山の頂点として、左（left）と右（right）を探索していく
		for(int i=1;i<=heights.length-2;i++){
			expectedResult = 1;
			// 左（left）を探索する
			left = i-1;
			while(left >= 0){
				if(heights[left] >= heights[left+1]){
					break;
				}
				expectedResult += 1;
				left -= 1;
			}
			if(left == i - 1){
				continue;
			}

			// 右（right）を探索する
			right = i + 1;
			while(right <= heights.length - 1){
				if(heights[right-1] <= heights[right]){
					break;
				}
				expectedResult += 1;
				right += 1;
			}
			if(right == i + 1){
				continue;
			}
			// resultには今までの集計結果、expectedResultには解の候補が入っているので、Math.maxで
			// 集計すること。
			result = Math.max(result, expectedResult);
		}

		return result;
	}
}
