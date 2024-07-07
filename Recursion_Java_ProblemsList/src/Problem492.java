import java.util.Arrays;

/*
 * 中央の要素が隣接するどの要素よりも小さくない場合は、中央の要素をそのまま返し、
 * もし真ん中の要素が左隣の要素より小さければ、
 * 左側に必ずピーク要素が存在することになるので常に左半分の配列から真ん中の要素を起点にピーク要素を探すようにしてください。
 */
public class Problem492 {
	public static int findPeak(int[] arr) {
		if (arr.length == 1) return arr[0];
		if (arr.length == 2) return arr[0] >= arr[1] ? arr[0] : arr[1];
		int index = (arr.length % 2 == 0) ? (arr.length - 1) / 2 : arr.length / 2;

		if (arr[index - 1] <= arr[index] && arr[index + 1] <= arr[index]) return arr[index];

		if (index == 0) return arr[0] >= arr[1] ? arr[0] : arr[1];
		if (arr[index - 1] >= arr[index]) return findPeak(Arrays.copyOfRange(arr, 0, index));
		return findPeak(Arrays.copyOfRange(arr, index + 1, arr.length));
	}
}
