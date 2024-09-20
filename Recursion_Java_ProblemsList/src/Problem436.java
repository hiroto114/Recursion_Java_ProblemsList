
import java.util.function.Function;

public class Problem436 {
	public static void main(String[] args){
		Function<Integer, Integer> cube = number -> {
			return (int)Math.pow(number,3);
		};
		Function<Integer, Integer> splitAndAdd = number -> {
			int result = 0;
			while (number != 0) {
				int digit = number % 10;
				result += digit;
				number /= 10;
			}
			return result;
		};

		int[] inputArray = {3, 11, 24, 31};
		customArray(cube, inputArray);
		customArray(splitAndAdd, inputArray);
	}

	public static void customArray(Function<Integer, Integer>f, int num[]){
		for(int i=0;i<num.length;i++){
			System.out.println(f.apply(num[i]));
		}
	}
}
