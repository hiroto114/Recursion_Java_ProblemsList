
import java.util.Arrays;

public class Problem491 {
    public static int[] doubledArray(int[] arr){
        return Arrays.stream(arr).map(i->i*2).toArray(); 
    }
}
