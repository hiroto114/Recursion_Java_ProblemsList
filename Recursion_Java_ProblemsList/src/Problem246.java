/*
 * Lopez はフリーマーケットにやってきました。ここでは物を売買してお金を増やしたり使ったりできます。
 * 時間帯的に Lopez は 3 つの行動しかできません。Lopez の行動一覧（物を売るか買うか）を表す配列 actions と予算 num が与えられるので、
 * 予算 num 未満になる 3 つの行動の組み合わせは何通りあるか返す、smallerThanX という関数を作成してください。
 * 
 * 例えば、[1,2,3,4], 9 のケースでは、配列の中の 3 つの要素を足し合わせて 9 未満になる組み合わせは、（1,2,3）,（1,2,4）,（1,3,4）の 3 通りになります。
 */
public class Problem246 {
	public static int smallerThanX(int[] action, int num){
		int result = 0;
		for(int i=0;i<action.length-2;i++){
			for(int m=i+1;m<action.length-1;m++){
				for(int n=m+1;n<action.length;n++){
					if(action[i]+action[m]+action[n]<num) result ++;
				}
			}
		}

		return result;
	}
}
