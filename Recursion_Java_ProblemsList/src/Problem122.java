import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Pearson は学校の遠足に教師として参加し、担当しているクラスの生徒を1列に並ばせていました。
 * 身長順に並ばせていましたが、数人だけ順番通りに並ばない生徒がいました。
 * 生徒たちを表すサイズ 2 以上の配列 student が与えられるので、
 * 順番に整列しないグループを返す、unsortedStudents という関数を定義してください。
 * Pearson は理不尽なので、例えば、[5,4,3] の 4 のようにきちんと整列している生徒でも、
 * 整列していない生徒に挟まれている生徒は整列していないとみなします。
 * 
 * unsortedStudents([1,2,5,3,4]) --> [5,3,4]
unsortedStudents([1,2,5,4,3]) --> [5,4,3]
unsortedStudents([1,3,2]) --> [3,2]
unsortedStudents([1,2,5,4,3,6,7,8]) --> [5,4,3]
unsortedStudents([5,4,3,6,7,8]) --> [5,4,3]
unsortedStudents([5,6,7,8,9,10]) --> []
unsortedStudents([1,2,3,4,0]) --> [1,2,3,4,0]
unsortedStudents([50,3]) --> [50,3]
unsortedStudents([3,50]) --> []
unsortedStudents([5,4,3,6]) --> [5,4,3]
 */
public class Problem122 {
    public static int[] unsortedStudents(int[] student){
        int[] sortedStudents = student.clone();
        Arrays.sort(sortedStudents);

        List<Integer> indexResultList=new ArrayList<>();
        for(int i=0; i<student.length; i++){
            if(student[i] != sortedStudents[i]){
                indexResultList.add(i);
            }
        }

        if(indexResultList.size() == 0) return new int[]{};
        if(indexResultList.size() == 1) return Arrays.copyOfRange(student, indexResultList.get(0), indexResultList.get(0) + 1);
        return Arrays.copyOfRange(student, indexResultList.get(0), indexResultList.get(indexResultList.size() - 1) + 1);
    }
}
