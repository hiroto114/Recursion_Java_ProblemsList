
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Cole はある企業の人事として働いており、従業員のリストを整理しています。
 * 従業員のリスト employees と来月解雇されるリスト unemployed が与えられるので、
 * 来月残留する従業員の配列を返す fireEmployees という関数を定義してください。
 */
public class Problem71 {
    public static String[] fireEmployees(String[] employees, String[] unemployed){
        List<String> result = new ArrayList<String>();
        for(String employee : employees){
            if(!Arrays.asList(unemployed).contains(employee)){
                result.add(employee);
            }
        }

        return  result.toArray(new String[result.size()]);
    }
}
