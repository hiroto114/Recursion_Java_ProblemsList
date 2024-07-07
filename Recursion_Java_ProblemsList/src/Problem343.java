/*
 * 0 以上の整数 n が与えられるので、「+」、「-」、「*」、「/」、「++」を使わずに 1 を足す、plusOne という関数を作成してください。
 * 例えば、431 が与えられたとき、(110101111)2 の右端の 0 以降の 1 を全て 0 へフリップして、(110100000)2 を取得し、
 * 最後に先ほどの 0 を 1 へフリップすると、(110110000)2 = (432)10 を取得することができます。
 * 
 * plusOne(2) --> 3
 * plusOne(5) --> 6
 * plusOne(7) --> 8
 * plusOne(11) --> 12
 * plusOne(32) --> 33
 * plusOne(534) --> 535
 * plusOne(203444343) --> 203444344
 * 
 */
public class Problem343 {
	public static int plusOne(int n){
		String strN = Integer.toBinaryString(n);
		int index1 = strN.lastIndexOf("0");
		if(index1 != -1){
			strN = (new StringBuilder(strN)).replace(index1, index1+1, "1").toString();

			if(index1 != strN.length()-1){
				strN = (new StringBuilder(strN)).replace(index1+1, strN.length(), "0".repeat(strN.length()-1-index1)).toString();
			}
		}else{
			strN = "1" + "0".repeat(strN.length());
		}

		return Integer.parseInt(strN, 2);
	}
}
