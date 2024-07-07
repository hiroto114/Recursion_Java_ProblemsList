/*
 * Morgan はマイナンバーカードを発行していましたが、占いに行った時に Morgan にとって現在の ID は不吉と言われたため、変更することにしました。
 * 奇数の ID である n が与えられるので、その中から 1 つだけ数字を他の数字と入れ替え、最大の偶数を作成する getMaxEven という関数を作成してください。
 * 
 * getMaxEven(1235785) --> 1535782
 * getMaxEven(20435) --> 50432
 * getMaxEven(6791) --> 1796
 * getMaxEven(3878167) --> 3878176
 * getMaxEven(54297) --> 57294
 * getMaxEven(85647) --> 85746
 * getMaxEven(60625) --> 65620
 * 
 */
public class Problem243 {
	public static int getMaxEven(int n){
		String[] helper =  String.valueOf(n).split("");
		int result = 0;

		for(int i=0;i<=helper.length-1;i++){
			if(Integer.valueOf(helper[i])%2==0){
				result = Math.max(result,getMaxEvenHelper(helper,i));
			}
		}
		return result;
	}

	/*
	 * String[] aの一番最後とi番目の要素を交換→整数にjoinして返却。
	 */
	public static int getMaxEvenHelper(String[] a,int i){
		String[] b = a.clone();
		String temp = b[i];
		b[i] = b[b.length-1];
		b[b.length-1] = temp;
		return Integer.parseInt(String.join("",b));
	}
}
