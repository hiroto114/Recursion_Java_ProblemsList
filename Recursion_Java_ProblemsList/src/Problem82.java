
import java.util.ArrayList;
import java.util.List;/*
 * James は学校にあるロッカーのパスワードシステムを開発していました。
 * そのシステムでは桁数を自由に決めることができ、数字の入力のみでパスワード設定をできるようにしました。
 * このシステムでは 1 から n 桁までの数字を、全てパスワードに入れなければいけません。
 * （例：4 桁の場合、1・2・3・4 を必ずパスワードに入れなければなりません）。
 * パスワード設定時に入力される数字 numbers が与えられるので、足りない数字を返す missingIntegers という関数を作成してください。
 */
public class Problem82 {
    public static int[] missingIntegers(int[] numbers){
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=numbers.length;i++){
            if(!containsNumber(numbers,i)){
                result.add(i);
                continue;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static boolean containsNumber(int[] target,int number){
        for(int i=0;i<target.length;i++){
            if(target[i]==number){
                return true;
            }
        }
        return false;
    }
}
