
public class Problem456 {
	public static void main(String[] args) {
		System.out.println(validateDecorator(new int[] { 10, 20, 30, 40 }));
		System.out.println(validateDecorator(new int[] { 9, 10, 20, 30 }));
		System.out.println(validateDecorator(new int[] { 3, 5, 40, 50 }));
	}

	public static String validateDecorator(int[] input) {
		int errCount = 0;
		for (int i : input) {
			if (i < 10)
				errCount += 1;
		}
		if (errCount > 0)
			return errCount + " error found";
		return "Sum of array is " + sumOfArray(input);
	}

	public static int sumOfArray(int[] input) {
		int result = 0;
		for (int i : input) {
			result += i;
		}
		return result;
	}
}
