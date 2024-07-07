/*
 * 10進数から16進数への書き換え
 */
public class Problem60 {
    /*
     * 既存のライブラリを使って書こう
     */
	public static String decimalToHexadecimal(int decNumber){
        return Integer.toHexString(decNumber).toUpperCase();
    }
}
