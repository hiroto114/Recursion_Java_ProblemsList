
/**
 * 素数の和
 */
public class Problem58 {
    public static int sumOfAllPrimes(int n){
        int result = 0;
        for(int i=2; i<=n; i++) {
        	if(sumOfAllPrimesHelper(i)) result += i;
        }
        return result;
    }

    public static boolean sumOfAllPrimesHelper(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }

        return true;
    }
}
