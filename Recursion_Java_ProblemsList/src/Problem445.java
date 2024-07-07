import java.util.Arrays;

public class Problem445 {
	public static int[] reduceMap(int[] arr) {
		return Arrays.stream(arr).map(i -> i * i).toArray();
	}
}
