import java.util.Arrays;

/*
 * selectionSort([2,12,5,10,9,8]) --> [2,5,8,9,10,12]
 * selectionSort([1,5,3,4,3,1,6]) --> [1,1,3,3,4,5,6]
 * selectionSort([11,45,32,75,88,15,15]) --> [11,15,15,32,45,75,88]
 */
public class Problem489 {
    public static int[] selectionSort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
