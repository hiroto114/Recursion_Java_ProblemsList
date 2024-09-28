/*
 * パスカルの三角形において、n 段目の数字を配列で返す、pascalRow という関数を作成してください。
 * 
 * pascalRow(0) --> [1]
 * pascalRow(1) --> [1,1]
 * pascalRow(3) --> [1,3,3,1]
 * pascalRow(4) --> [1,4,6,4,1]
 * pascalRow(8) --> [1,8,28,56,70,56,28,8,1]
 * 
 */
public class Problem309 {
	public static int[] pascalRow(int n){
		if(n==0) return new int[]{1};
		if(n==1) return new int[]{1,1};

		return calculatePascalNextRow(pascalRow(n-1));
	}

	public static int[] calculatePascalNextRow(int[] input){
		int[] result = new int[input.length+1];
		result[0] = input[0];
		result[result.length-1] = input[input.length-1];
		for(int i=1;i<=result.length-2;i++){
			result[i] = input[i-1] + input[i];
		}

		return result;
	}
}
