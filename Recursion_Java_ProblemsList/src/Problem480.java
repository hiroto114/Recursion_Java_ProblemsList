
import java.util.Arrays;

/*
 * あるアイドルのファンサイン会では、CD 購入者に限り、コンピュータ抽選により当選者リストが公開されます。
 * 今回の当選者リストでは、数字の中で、素因数が 2、3、5 しか持たない数だけが順番に並べられています。
 * 例外として 1 が含まれます。
 * 
 * 整数 n が与えられたとき、n 番目の当選者番号を返す nthLuckyNumber という関数を作成してください。
 * 例えば、1、2、3、4、5、6、8、9、10、12、15 は最初の 11 名の当選者リストを表しています。
 * 14 は素因数 7 を含むので含まれません。
 * 
 * nthLuckyNumber(1) --> 1
 * nthLuckyNumber(7) --> 8
 * nthLuckyNumber(11) --> 15
 * nthLuckyNumber(100) --> 1536
 * 
 */
public class Problem480 {
	public static int nthLuckyNumber(int n) {
		double[] array = new double[125000];
		int arrayPointer = 0;
		for (int i = 0; i < 50; i++) {
			for (int m = 0; m < 50; m++) {
				for (int l = 0; l < 50; l++) {
					array[arrayPointer] = Math.pow(2, i) * Math.pow(3, m) * Math.pow(5, l);
					arrayPointer += 1;
				}
			}
		}
		Arrays.sort(array);

		return (int) array[n - 1];
	}
}
