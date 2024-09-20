
import java.util.ArrayList;
import java.util.List;

public class Problem469 {
    public static int[] evenRange(int a, int b){
        List<Integer> result = new ArrayList<Integer>();

        for(int i=a;i<=b;i++){
            if(i%2==0) result.add(i);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
