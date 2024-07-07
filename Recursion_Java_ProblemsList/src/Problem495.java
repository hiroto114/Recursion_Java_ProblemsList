import java.util.Arrays;

public class Problem495 {
    public static int[] merge(int[] leftArr, int[] rightArr){
        int[] result = new int[leftArr.length + rightArr.length];
        System.arraycopy(leftArr, 0, result, 0, leftArr.length);
        System.arraycopy(rightArr, 0, result, leftArr.length, rightArr.length);
        Arrays.sort(result);

        return result;
    }
}
