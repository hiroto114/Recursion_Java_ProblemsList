import java.util.HashSet;
import java.util.Iterator;

public class Problem499 {
    public static int organizeCupboard(int[] dishes){
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int a : dishes){
            hs.add(a);
        }

        int result = 0;
        for(Iterator<Integer> it = hs.iterator(); it.hasNext(); ) {
            result += (int)it.next();
        }

        return result;
    }
}
