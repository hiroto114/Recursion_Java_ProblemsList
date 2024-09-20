
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem493 {
    public static int smallestMissingNumber(int[] arr){
        for(int i=0;true;i++){
            if(!Arrays.stream(arr).boxed().collect(Collectors.toList()).contains(i)){
                return i;
            }
        }
    }
}
