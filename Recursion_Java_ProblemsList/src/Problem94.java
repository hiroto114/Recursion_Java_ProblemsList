
/*
 * 2 つの 2 進数 bits1、bits2 が文字列として与えられるので、その合計値を文字列で返す、addBinaryNumber という関数を定義してください。
 */
public class Problem94 {
	/*
	 * 既存のライブラリ・メソッドの便利機能をいかに知っているかで差が出る。
	 */
    public static String addBinaryNumber(String bits1, String bits2){
        int bitsInt1 = Integer.parseInt(bits1,2);
        int bitsInt2 = Integer.parseInt(bits2,2);

        return Integer.toBinaryString(bitsInt1+bitsInt2);
    }
}
