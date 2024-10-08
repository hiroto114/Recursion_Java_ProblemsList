/*
 * Garrett は R 商事の株を売買する事で儲けようと考えています。
 * R 商事の毎日の予想株価リスト stocks が与えられたとき、各日にちの株価がより高くなるまで何日待つかを示したリストを返す、
 * dailyStockPrice という関数を作成してください。株価がより高くなる日がない場合は 0 を入力してください。
 * 
 * dailyStockPrice([58,59,71]) --> [1,1,0]
 * dailyStockPrice([58,59,37,83]) --> [1,2,1,0]
 * dailyStockPrice([63,63,64]) --> [2,1,0]
 * dailyStockPrice([85,83,67,83,81,38,88,85]) --> [6,5,1,3,2,1,0,0]
 * dailyStockPrice([38,37,38,35,34,37,39,40,33,33]) --> [6,1,4,2,1,1,1,0,0,0]
 * 
 */
public class Problem296 {
	public static int[] dailyStockPrice(int[] stocks){
		int[] result = new int[stocks.length];

		for(int i=0;i<stocks.length-1;i++){
			for(int m=i+1;m<stocks.length;m++){
				if(stocks[i] < stocks[m]){
					result[i] = m - i;
					break;
				}
			}
		}

		return result;
	}
}
