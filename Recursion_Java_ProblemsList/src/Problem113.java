import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Whalum は兄が買うものはなんでも欲しがる性格です。
 * 兄弟で一緒にネットショッピングをするときも、兄が買うものと同じものを買おうとしていました。
 * 兄の注文リスト listA と Whalum の注文リスト listB が与えられるので、
 * 兄が買うもので Whalum の注文リストに入ってないものを返す、missingItems という関数を作成してください。
 * もし、被りが一切存在しない時は、兄の注文リストをそのまま返してください。
 * 
 * missingItems([1,2,3,4,5,6,7,8],[1,3,5]) --> [2,4,6,7,8]
 * missingItems([1,2,3,4,5],[1,2]) --> [3,4,5]
 * missingItems([1,1],[2,2]) --> [1,1]
 * missingItems([9,8,7,6,5],[1,2]) --> [9,8,7,6,5]
 * missingItems([1,2],[9,8,7,6,5]) --> [1,2]
 * missingItems([3,4,5,1,2],[1,2]) --> [3,4,5]
 * missingItems([8,3,45,67,23,9,3],[5,7]) --> [8,3,45,67,23,9,3]
 * missingItems([8,3,45,67,23,9,3],[5,45]) --> [8,3,67,23,9,3]
 * missingItems([8,3,45,67,23,9,3],[3]) --> [8,45,67,23,9]
 * missingItems([8,3,45,67,23,9,3],[]) --> [8,3,45,67,23,9,3]
 * なんか余分なことをしている。。
 * 
 */
public class Problem113 {
    public static int[] missingItems(int[] listA, int[] listB){
        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<listA.length;i++){
            if(!contains(listB,listA[i])){
                resultList.add(listA[i]);
            }
        }

        int result[] = new int[resultList.size()];
        for(int i=0;i<result.length;i++){
            result[i] = resultList.get(i);
        }
        return result;

    }
    public static boolean contains(final int[] arr, final int key) {
         Arrays.sort(arr);  
         return Arrays.binarySearch(arr, key) >= 0; 
    }
}
