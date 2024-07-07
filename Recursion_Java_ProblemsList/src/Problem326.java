/*
 * Jordan は、ATM の一部の機能として、入力される PIN が有効かどうかチェックするプログラムの作成を任されました。
 * 文字列 pin が与えられるので、それが有効かどうかチェックする関数、isPinValid という関数を作成してください。
 * PIN が有効になる条件は以下の通りです。
 * 
 * 4 文字か 6 文字
 * 数値のみ
 * 
 * isPinValid("9003") --> true
 * isPinValid("90038") --> false
 * isPinValid("356798") --> true
 * isPinValid("900A") --> false
 * isPinValid("A0Cd") --> false
 * isPinValid("6#00") --> false
 * isPinValid("3&6798") --> false
 * isPinValid("35A7P8") --> false
 * isPinValid("35A7 7") --> false
 * 
 */
public class Problem326 {
	public static boolean isPinValid(String pin){
		if(pin.length()!=4 && pin.length() !=6) return false;
		try {
			int pinNumber = Integer.parseInt(pin);
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
