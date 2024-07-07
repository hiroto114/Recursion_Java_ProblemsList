import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * listIntersection([1,2,3,4,5,6],[1,4,4,5,8,9,10,11]) --> [1,4,5]
 * listIntersection([3,4,5,10,2,20,4,5],[4,20,22,2,2,2,10,1,4]) --> [2,4,10,20]
 * listIntersection([2,3,4,54,10,5,9,11],[3,10,23,10,0,5,9,2]) --> [2,3,5,9,10]
 */
public class Problem487 {
	public static int[] listIntersection(int[] targetList, int[] searchList) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < targetList.length; i++) {
			for (int m = 0; m < searchList.length; m++) {
				if (targetList[i] == searchList[m] && !list.contains(targetList[i])) {
					list.add(targetList[i]);
				}
			}
		}

		Collections.sort(list);

		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
