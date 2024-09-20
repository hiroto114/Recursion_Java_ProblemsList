
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem488 {
	public static int firstRepeatingNumber(int[] nums) {
		Map<Integer, Integer> count = new LinkedHashMap<Integer, Integer>();
		for (int num : nums) {
			count.put(num, count.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> i : count.entrySet()) {
			if (i.getValue() > 1)
				return i.getKey();
		}
		return -1;
	}
}
