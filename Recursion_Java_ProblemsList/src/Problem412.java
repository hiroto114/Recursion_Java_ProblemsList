import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 最後に単調増加なやつをスタックで見つける。
 * consecutiveWalk([3,4,20,45,56,6,4,3,2,3,9]) --> [9,3,2]
 * consecutiveWalk([4,5,4,2,4,3646,34,64,3,0,-34,-54]) --> [-54]
 * consecutiveWalk([4,5,4,2,4,3646,34,64,3,0,-34,-54,4]) --> [4,-54]
 * consecutiveWalk([]) --> []
 * consecutiveWalk([1]) --> [1]
 * consecutiveWalk([1,2,3,2,4]) --> [4,2]
 */
public class Problem412 {
	public static int[] consecutiveWalk(int[] arr){
		Stack<Integer> helper = new Stack<Integer>();
		for(int i : arr){
			if(helper.size()==0){
				helper.push(i);
				continue;
			}
			if(helper.peek()>=i){
				helper.clear();
				helper.push(i);
				continue;
			}
			helper.push(i);
		}

		List<Integer> result = new ArrayList<Integer>();
		while(helper.size()>0){
			result.add(helper.pop());
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
