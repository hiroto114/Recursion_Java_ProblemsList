import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Problem460 {
	public static void main(String[] args) {
		Function<Integer, Integer> memoizedFac = memoization(Problem460::factorial);
		if (cache.containsKey(9)) {
			System.out.println("This time using a cache...");
			System.out.println(cache.get(9));
		} else {
			System.out.println(memoizedFac.apply(9));
		}
		if (cache.containsKey(9)) {
			System.out.println("This time using a cache...");
			System.out.println(cache.get(9));
		} else {
			System.out.println(memoizedFac.apply(9));
		}
	}
	
	private static Map<Integer, Integer> cache = new HashMap<>();

	private static int factorial(int n) {
		if (n == 1 || n == 2) {
			cache.put(n, 1);
			return 1;
		}

		int result = factorial(n - 1) + factorial(n - 2);
		cache.put(n, result);
		return result;
	}

	private static Function<Integer, Integer> memoization(Function<Integer, Integer> function) {
		return input -> function.apply(input);
	}
}
