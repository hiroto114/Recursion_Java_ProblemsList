
/*
 * FIZZBAZZ問題
 */
public class Problem54 {
    public static String fizzBuzz(int n){
        StringBuilder result = new StringBuilder("");

        for(int i=1;i<=n;i++){
            if(i%15==0) result.append("FizzBuzz-");
            else if(i%5==0) result.append("Buzz-");
            else if(i%3==0) result.append("Fizz-");
            else result.append(i+"-");
        }

        return result.toString().substring(0,result.toString().length()-1);
    }
}
