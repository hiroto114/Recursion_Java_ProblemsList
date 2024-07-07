import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Problem461 {
	private static Map<Integer, Integer> cache = new HashMap<>();

	public static void main(String[] args) {
		Function<Integer, Integer> memoizedFac = memoization(Problem461::factorial);
		System.out.println(memoizedFac.apply(10));
		System.out.println(memoizedFac.apply(10));
	}

	private static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		if (cache.containsKey(n)) {
			System.out.println("This time using a cache...");
			return cache.get(n);
		}

		int result = n * factorial(n - 1);
		cache.put(n, result);
		return result;
	}

	private static Function<Integer, Integer> memoization(Function<Integer, Integer> function) {
		return input -> function.apply(input);
	}
}
