public class Problem418 {
	public static void main(String[] args){
		System.out.println(fizzbuzz(9));
		System.out.println(fizzbuzz(20));
	}

	public static String fizzbuzz(int input){
		StringBuilder result = new StringBuilder();

		for(int i=1;i<=input;i++){
			if(i%15==0){
				result.append("FizzBuzz-");
			}else if(i%3==0){
				result.append("Fizz-");
			}else if(i%5==0){
				result.append("Buzz-");
			}else{
				result.append(i+"-");
			}
		}
		return result.toString().substring(0,result.length()-1);
	}
}
