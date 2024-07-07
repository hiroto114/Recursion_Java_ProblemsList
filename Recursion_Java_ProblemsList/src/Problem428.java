import java.util.function.Consumer;
import java.util.function.Function;

public class Problem428 {
	public static void main(String[] args){
		Function<String, Consumer<String>> printTaxByState = howToCheck -> email -> {

			if("doesNotStartWithAt".equals(howToCheck)){
				if(email.charAt(0)!='@'){
					System.out.println("Email is correct.");
				}else{
					System.out.println("Email is not correct.");
				}
			}else if("doesNotHaveSpace".equals(howToCheck)){
				if(!email.contains(" ")){
					System.out.println("Email is correct.");
				}else{
					System.out.println("Email is not correct.");
				}
			}else if("hasUppercaseAndLowercase".equals(howToCheck)){
				if(email.matches("[a-z ]+$")||email.matches("[A-Z ]+$")){
					System.out.println("Email is not correct.");
				}else{
					System.out.println("Email is correct.");
				}
			}
		};
		Consumer<String> getTaxInAZ = printTaxByState.apply("doesNotStartWithAt");
		getTaxInAZ.accept("@gmail.com");
		getTaxInAZ.accept("kkk@gmail.com");

		Consumer<String> getTaxInCA = printTaxByState.apply("doesNotHaveSpace");
		getTaxInCA.accept("Hello world");
		getTaxInCA.accept("Helloworld");

		Consumer<String> getTaxInNC = printTaxByState.apply("hasUppercaseAndLowercase");
		getTaxInNC.accept("hello world");
		getTaxInNC.accept("HELLO WORLD");
		getTaxInNC.accept("Hello world");
	}
}
