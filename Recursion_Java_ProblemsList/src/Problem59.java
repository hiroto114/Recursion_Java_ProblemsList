/*
 * 10進数から2進数への書き換え
 */
public class Problem59 {
	/*
	 * 既存のライブラリを使って書くとかなりすっきりする
	 */
    public static String decimalToBinary(int decNumber){
        return Integer.toBinaryString(decNumber);
    }
}
