/*
 * 湖の中でアメーバが繁殖しています。
 * 
 * 最初の段階ではアメーバは住んでいません
 * 毎日アメーバーの数は倍増します
 * 1 日何回でも 1 匹ずつアメーバを追加することができます
 * total が与えられるので、total にちょうど到達するために追加しなければならない最小のアメーバー数を返す、minimumAmoeba という関数を作成してください。
 * 
 * minimumAmoeba(0) --> 0
 * minimumAmoeba(1) --> 1
 * minimumAmoeba(2) --> 1
 * minimumAmoeba(5) --> 2
 * minimumAmoeba(8) --> 1
 * minimumAmoeba(27) --> 4
 * minimumAmoeba(35) --> 3
 * minimumAmoeba(245) --> 6
 * minimumAmoeba(2147483647) --> 31
 * 
 */
public class Problem335 {
	public static int minimumAmoeba(int total){
		if(total == 0) return 0;
		if(total == 1) return 1;
		if(total == 2) return 1;
		int result = 0;
		while(total > 0){
			for(int i=0;;i++){
				if(Math.pow(2,i) > total){
					result += 1;
					total -= Math.pow(2, i-1);
					break;
				}
			}
		}

		return result;
	}
}
