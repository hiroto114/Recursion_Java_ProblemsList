import java.util.ArrayList;
import java.util.List;

/*
 * 配列 arr が与えられるので、配列を 1 番目 -> n 番目 -> 2 番目 -> n-1 番目 … と並び替える shuffleArray を作成してください。
 * 
 * shuffleArray([1]) --> [1]
 * shuffleArray([4,5]) --> [4,5]
 * shuffleArray([3,6,8]) --> [3,8,6]
 * shuffleArray([3,6,8,7]) --> [3,7,6,8]
 * shuffleArray([3,6,8,7,2]) --> [3,2,6,7,8]
 */
public class Problem300 {
    public static int[] shuffleArray(int[] arr){
        if(arr.length<=1) return arr;
        List<Integer> result = new ArrayList<Integer>();
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            if(left != right){
                result.add(arr[left]);
                result.add(arr[right]);
            }else{
                result.add(arr[left]);
            }
            left += 1;
            right -= 1;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
