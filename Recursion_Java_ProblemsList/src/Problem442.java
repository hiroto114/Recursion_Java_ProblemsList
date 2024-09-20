
import java.util.Arrays;

public class Problem442 {
	public static String[] palindromeArray(String[] stringList){
		return Arrays.stream(stringList)
				.filter(s -> isPalindrome(s))
				.toArray(String[]::new); 
	}

	public static boolean isPalindrome(String input){
		input = (input.toLowerCase()).replaceAll(" ","");

		String result = (new StringBuilder(input)).reverse().toString();
		return input.equals(result);       
	}
}
