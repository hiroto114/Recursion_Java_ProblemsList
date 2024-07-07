/*
 * Maria はスコアを多く取った人が勝つゲームに参加しています。
 * このゲームで勝つために、途中で他プレーヤーのスコアから x 桁の数字を削除することになりました。
 * 他プレーヤーのスコア num が文字列として与えられるので、最小値になるようにその数から x 桁の数字を削除して返す、deleteXDigits という関数を作成してください。
 * 
 * deleteXDigits("5876659",3) --> 5659
 * deleteXDigits("70400",1) --> 400
 * deleteXDigits("20",2) --> 0
 * deleteXDigits("20",1) --> 0
 * deleteXDigits("223",1) --> 22
 * deleteXDigits("3305",1) --> 305
 * deleteXDigits("3305",5) --> 0
 * 
 */
public class Problem297 {
	public static String deleteXDigits(String digits, int x){
		if(x <= 0) return digits;
		if(digits.length() <= x) return "0";
		for(int i=1; i<=x; i++){
			digits = deleteXDigitsHelper(digits);
		}
		return String.valueOf(Integer.parseInt(digits));
	}

	// 数字が与えられるので、1桁削って最小のものを返す関数
	public static String deleteXDigitsHelper(String digits){
		if(digits.length() <= 1) return "0";
		String result = digits;
		for(int i=0; i<digits.length(); i++){
			if(Integer.parseInt((new StringBuilder(digits).deleteCharAt(i)).toString()) < Integer.parseInt(result)){
				result = (new StringBuilder(digits).deleteCharAt(i)).toString();
			}
		}
		return result;
	}
}
