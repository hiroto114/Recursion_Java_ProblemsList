import java.util.HashMap;
import java.util.Map;

public class Problem501 {
	public static int getPointStrackOut(int[] targets) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < targets.length; i++) {
			if (!map.containsKey(targets[i]) && targets[i] >= 1 && targets[i] <= 9) {
				map.put(targets[i], 1);
			}
		}

		return map.size() * 10;
	}
}
