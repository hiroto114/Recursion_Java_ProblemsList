import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 自然数によって構成される配列 intArr と自然数 target が与えられるので、
 * 配列の中の任意の要素を足し合わせて target 以下になるような最大の要素数を返す、maximizeCount という関数を作成してください。
 * ただし、全ての配列の要素 intArr[i] は、intArr[i] < 10,000 とします。
 * 
 * maximizeCount([1,2,3,4],10) --> 4
 * maximizeCount([6,1,2],5) --> 2
 * maximizeCount([30,10,20,30,30],100) --> 4
 * maximizeCount([30,10,20,30,30],5) --> 0
 * maximizeCount([30,60,100,20,60,30,30,10],100) --> 4
 * maximizeCount([3,3,1,1,1,2,4,3,1],6) --> 5
 * 
 */
public class Problem234 {
	public static int maximizeCount(int[] intArr, int target){
		List<Integer> list= Arrays.stream(intArr).boxed().collect(Collectors.toList());
		int result = intArr.length;
		int helper = list.stream().mapToInt(Integer::intValue).sum();
		int helperMax ;

		while(helper>target){
			helperMax = Collections.max(list);
			helper -= helperMax;
			list.remove(Integer.valueOf(helperMax));
			result -= 1;
		}

		return result;
	}
}
