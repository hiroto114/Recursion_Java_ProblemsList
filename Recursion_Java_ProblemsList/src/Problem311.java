/*
 * Lucy はスーパーのタイムセールに来ています。
 * ここではジャガイモとにんじんのみが一列に並んでおり、好きなだけ取っていっても値段は均一になっています。
 * Lucy はなるべく多く獲得したい気持ちと、ジャガイモとにんじんの数は同じにしたい気持ちがあります。
 * ジャガイモを 0、にんじんを 1 で表した配列 vegitables が与えられたとき、ジャガイモとにんじんの数が等しくなる最大の範囲の数を返す、関数 maxRange を作成してください。
 * 
 * maxRange([1,0]) --> 2
 * maxRange([1,0,1]) --> 2
 * maxRange([1,0,1,0]) --> 4
 * maxRange([0,1,1,0,1,1,1,1]) --> 4
 * maxRange([0,0,0,1,1,0,0,0,0]) --> 4
 * maxRange([1,1,1,0,1,0]) --> 4
 * maxRange([0,1,1,1,0,1,1,1,0,1]) --> 2
 * 
 */
public class Problem311 {
	public static int maxRange(int[] vegitables){
		for(int i=vegitables.length;i>=1;i--){
			for(int m=0;m<=vegitables.length-i;m++){
				if(maxRangeHelper(vegitables,m,m+i-1)){
					return i;
				}
			}
		}

		return 0;
	}

	public static boolean maxRangeHelper(int[] vegitables,int first, int end){
		int count0 = 0;
		int count1 = 0;

		for(int i=first;i<=end;i++){
			if(vegitables[i]==0)count0 += 1;
			if(vegitables[i]==1)count1 += 1;
		}

		return count0 == count1;
	}
}
