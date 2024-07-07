/*
 * アメリカ合衆国の法人税は、連邦税と州税があります。
 * 連邦税の税率は収益の 21％、州税は州ごとに税率が決まっています。各州での税率は以下の表を参考にしてください。
 * 
 * 州名	税率
 * アリゾナ（AZ）	4.9
 * カリフォルニア（CA）	8.84
 * テキサス（TX）	0
 * ノースカロライナ（NC）	2.5
 * その他	5
 * 
 * 閏年は特別とされ、その年の連邦税は免除されます。
 * 会社の利益 profit、州名 state、年 year が与えられるので、企業が支払わなければいけない法人税を計算する、
 * calculateCorporationTax という関数を作成してください。なお最終的な法人税は小数点を切り上げてください。
 */
public class Problem353 {
	public static int calculateCorporationTax(String state, int year, int profit){
		return (int)Math.ceil(profit * getStateTax(state) + profit * getFederalTax(year));
	}

	public static boolean isLeapYear(int year){
		boolean result = true;
		if(year%100 ==0 && year%400!=0) result = false;
		if(year%4!=0) result = false;
		return result;
	}

	public static double getStateTax(String state){
		double result = 0;
		switch(state){
			case "AZ":
				result = 0.049;
				break;
			case "CA":
				result = 0.0884;
				break;
			case "TX":
				result = 0;
				break;
			case "NC":
				result = 0.025;
				break;
			default:
				result = 0.05;
				break;
		}

		return result;
	}

	public static double getFederalTax(int year){
		if(isLeapYear(year)) return 0;
		return 0.21;
	}
}
