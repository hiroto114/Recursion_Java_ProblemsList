
import java.util.ArrayList;
import java.util.List;

public class Problem470 {
	public static int[] primeArray(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (primeJudge(i)) {
				list.add(i);
			}
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static boolean primeJudge(int n) {
		if (n <= 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		for (int a = 2; a <= Math.sqrt(n); a++) {
			if (n % a == 0)
				return false;
		}
		return true;
	}
}
