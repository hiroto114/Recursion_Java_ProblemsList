
import java.util.ArrayList;
import java.util.List;

/*
 * 下記のような文字列として表された配列 pointsData が与えられます。
 * 速度 10m/s 以上の要素の速度 [m/s] を配列として返す upper10mpsList という関数を作成してください。
 * ["x1-x2-s"]: x1m 地点から x2m 地点まで s 秒かかる
 */
public class Problem555 {
    public static String[] upper10mpsList(String[] pointsData){
        List<String> result = new ArrayList<String>();

        for(String point: pointsData){
            if(upper10mpsListHelper(point)>=10){
                result.add(String.valueOf(upper10mpsListHelper(point)));
            }
        }

        return  result.toArray(new String[result.size()]);
    }

    public static int upper10mpsListHelper(String input){
        String[] a = input.split("-");

        return Math.abs((Integer.parseInt(a[1])-Integer.parseInt(a[0]))/Integer.parseInt(a[2]));
    }
}
