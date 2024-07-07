import java.util.function.Function;

public class Problem430 {
	public static void main(String[] args){
		Function <Integer, Integer> isOdd = x -> {
			int result = 0;
			for(int i=1;i<=x;i++){
				if(i%2==1){
					result += i;
				}
			}
			return result;
		};
		Function<Integer, Integer> isMultipleOf3Or5 = x -> {
			int result = 0;
			for(int i=1;i<=x;i++){
				if(i%3==0||i%5==0){
					result += i;
				}
			}
			return result;
		};
		Function<Integer, Integer> isPrime = x -> {
			int result = 0;
			for(int i=1;i<=x;i++){
				if(judgePrime(i)){
					result += i;
				}
			}
			return result;
		};

		System.out.println(summation(isOdd, 3));
		System.out.println(summation(isOdd, 10));
		System.out.println(summation(isOdd, 25));

		System.out.println(summation(isMultipleOf3Or5, 3));
		System.out.println(summation(isMultipleOf3Or5, 10));
		System.out.println(summation(isMultipleOf3Or5, 100));

		System.out.println(summation(isPrime, 2));
		System.out.println(summation(isPrime, 10));
		System.out.println(summation(isPrime, 100));
	}

	public static int summation(Function<Integer, Integer> f, int number){
		return f.apply(number);
	}

	public static boolean judgePrime(int number){
		if(number==1){
			return false;
		}
		for(int i=2;i<=number-1;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
}
