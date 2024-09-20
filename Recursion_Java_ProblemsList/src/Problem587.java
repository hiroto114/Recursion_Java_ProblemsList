
public class Problem587 {
    public static int sumEvenNumbers(int a, int b){
        int result = 0;
        for(int i = Math.min(a,b);i<= Math.max(a,b);i++){
            if(i%2==0) result += i;
        }

        return result;
    }
}
