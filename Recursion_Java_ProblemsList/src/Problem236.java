/*
 * 0 から 9 までの整数 digit、自然数 idStart、idEnd が与えられるので、
 * idStart 以上 idEnd 以下の中に digit が出現する回数を返す、countBetweenNumbers という関数を作成してください。
 * 例えば、1, 10, 13 の場合、10、11、12、13 の中に 1 は 5 つ含まれます。
 */
public class Problem236 {
	public static int countBetweenNumbers(int digit, int idStart, int idEnd){
		int result = 0;

		for(int i = idStart ; i <= idEnd ; i++){
			result += countBetweenNumbersHelper(String.valueOf(i), String.valueOf(digit));
		}

		return result;
	}

	public static int countBetweenNumbersHelper(String input, String target){
		int result = 0;
		for(int i=0;i<input.length();i++){
			if(input.substring(i,i+1).equals(target)) result += 1;
		}
		return result;
	}
}
