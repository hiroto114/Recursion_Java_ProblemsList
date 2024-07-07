/*
 * 配列の逆表示
 */
public class Problem411 {
	public static int[] reverse(int[] arr){
		Stack stack = new Stack();
		for(int i=0;i<arr.length;i++){
			stack.push(arr[i]);
		}

		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			result[i] = (int)stack.pop();
		}
		return result;
	}
}
