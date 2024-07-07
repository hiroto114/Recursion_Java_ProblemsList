/*
 * 整数で構成される配列が与えられるので、
 * 最大値のインデックスを返す getMaxIndex という関数を定義してください。
 * ただし、最大値が複数存在する場合は、一番最後の要素を優先してください。
 */
public class Problem464 {
	public static int getMaxIndex(int[] arr) {
		int maxIndex = 0;
		int maxValue = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxIndex = i;
				maxValue = arr[i];
			}
		}

		return maxIndex;
	}
}
