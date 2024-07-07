/*
 * Alex は金券が当たるくじ引きに参加しています。
 * くじ引きは何回でも引くことができ、引いた後にそのくじより大きい金券のくじがいくつあるか表示されるようになっています。
 * くじの金券の額一覧 lotteries が与えられるので、そのくじの金券の額より大きい金券のくじが右側にいくつあるかを一覧で返す greaterOnTheRight という関数を作成してください。
 * 最後の要素の右側には要素が存在しないので、0 を返してください。
 * 例えば、[4,5,1,2,3] の場合、4 より後に 4 より大きい整数は 1 つ、5 より大きい整数は 0 と続き、答えは [1,0,2,1,0] となります。
 */
public class Problem237 {
	public static int[] greaterOnTheRight(int[] lotteries){
		if(lotteries.length==0) return new int[]{};
		if(lotteries.length==1) return new int[]{0};

		int[] result = new int[lotteries.length];
		for(int i=0;i<=lotteries.length-1;i++){
			if(i == lotteries.length-1) result[i] = 0;
			else result[i] = greaterOnTheRightHelper(lotteries,i+1,lotteries.length-1,lotteries[i]);
		}

		return result;
	}

	public static int greaterOnTheRightHelper(int[] lotteries,int start,int end, int key){
		int result = 0;
		for(int i=start;i<=end;i++){
			if(lotteries[i] > key) result += 1;
		}
		return result;
	}
}
