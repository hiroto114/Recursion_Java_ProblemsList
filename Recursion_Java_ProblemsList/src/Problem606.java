
import java.util.Arrays;

/*
 * removeDuplicates([1,4,2,4,3,2,5]) --> [1,4,2,3,5]
 * removeDuplicates([]) --> []
 */
public class Problem606 {
    public static int[] removeDuplicates(int[] arr){
        return Arrays.stream(arr).distinct().toArray();

    }
}
