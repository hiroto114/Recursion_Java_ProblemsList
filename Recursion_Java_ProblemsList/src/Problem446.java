
import java.util.Arrays;

public class Problem446 {
	public static int[] reduceFilter(int[] arr) {
		return Arrays.stream(arr).filter(i -> i % 2 == 1).toArray();
	}
}
