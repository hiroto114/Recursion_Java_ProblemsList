import java.util.function.Function;

public class Problem429 {
	public static void main(String[] args) {
		Function<Integer, Integer> dogToHuman = dogAge -> 20 + (dogAge - 2) * 7;
		Function<Integer, Integer> catToHuman = catAge -> 24 + (catAge - 2) * 4;

		System.out.println(qualifiedForInsurance(dogToHuman, 7));
		System.out.println(qualifiedForInsurance(dogToHuman, 8));
		System.out.println(qualifiedForInsurance(catToHuman, 11));
		System.out.println(qualifiedForInsurance(catToHuman, 12));
	}

	public static boolean qualifiedForInsurance(Function<Integer, Integer> f, int number) {
		return (f.apply(number)) <= 60;
	}
}
