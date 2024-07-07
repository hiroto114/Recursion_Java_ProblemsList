import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 整数で構成される配列 num1 と num2 が与えられるので、両方の配列に表示されている要素を小さい順で配列で返す、
 * intersectionOfArraysRepeats という関数を作成してください。
 */
public class Problem178 {
    public static int[] intersectionOfArraysRepeats(int[] intArray1, int[] intArray2){
        List<Integer> intList1 = helper(intArray1);
        List<Integer> intList2 = helper(intArray2);
        List<Integer> result = new ArrayList<Integer>();

        for(int i=0;i<intList1.size();i++){
            if(intList2.contains(intList1.get(i))){
                result.add(intList1.get(i));
                intList2.remove((Integer)intList1.get(i));
            }
        }

        Collections.sort(result);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static List<Integer> helper(int[] input){
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++){
            intList.add(input[i]);
        }
        return intList;
    }
}
