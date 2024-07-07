/*
 * string toHex(int number)
 * 10 進数を受け取り、16 進数で返す関数。
 * 
 * string toOct(int number)
 * 10 進数を受け取り、8 進数で返す関数。
 * 
 * string toBin(int number)
 * 10 進数を受け取り、2 進数で返す関数。
 */
public class Problem434 {
	public static void main(String[] args){

		// 与えられた数字を16進数、8進数、2進数に変換し、標準出力
		System.out.println(convert("toHex", 100));
		System.out.println(convert("toOct", 100));
		System.out.println(convert("toBin", 100));
	}

	/**
	 * 与えられた数字をn進数に変換
	 * @param convertMethod n進数
	 * @param targetNumber 変換対象の数字
	 * @return n進数に変換後の値
	 */
	public static int convert(String convertMethod, int targetNumber){
		if("toHex".equals(convertMethod)){
			return Integer.parseInt(Integer.toHexString(targetNumber));
		}else if("toOct".equals(convertMethod)){
			return Integer.parseInt(Integer.toOctalString(targetNumber));
		}else{
			return Integer.parseInt(Integer.toBinaryString(targetNumber));
		}
	}
}
