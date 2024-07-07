import java.util.Arrays;

/*
 * Steven は過去のデータを分析して、ROI を最大化しようとしているトレードアナリストです。
 * 各日の株価を表す整数の配列 stocks が与えられるので、「各日の i 日から何日前まで連続でその i 日の価格より高いか」を配列で返す、stockSpan という関数を作成してください。
 * ただし、株価の上昇には同じ日を含みます。
 * 例えば、[1,2,5] は、[1,2,3] を返します。1 日目は 1、2 日目は 1、2 と 2 連続、3 日目は 1, 2, 5 と 3 連続で株価が上昇しているからです。
 */
public class Problem174 {
	// 一番オーソドックスなやり方
	public static int[] stockSpan(int[] stocks){
		int[] result = new int[stocks.length];
		Arrays.fill(result, 1);

		for(int i=1;i<stocks.length;i++){
			for(int m=i-1;m>=0;m--){
				if(stocks[m] < stocks[i]) result[i] += 1;
				else break;
			}
		}

		return result;
	}
}
