import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * sortByMaxMin([6,2,3,5,8,4]) --> [8,2,6,3,5,4]
 * sortByMaxMin([11,15,9,7,12]) --> [15,7,12,9,11]
 * sortByMaxMin([85,69,56,61,78]) --> [85,56,78,61,69]
 * sortByMaxMin([1,2,3]) --> [3,1,2]
 */
public class Problem471 {
	public static int[] sortByMaxMin(int[] arr) {
		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> result = new ArrayList<Integer>();
		Collections.sort(arrList, Collections.reverseOrder());

		for (int i = 0; i < arr.length / 2; i++) {
			result.add(arrList.get(i));
			result.add(arrList.get(arr.length - 1 - i));
		}
		if (arr.length % 2 == 1)
			result.add(arrList.get((arr.length - 1) / 2));
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
