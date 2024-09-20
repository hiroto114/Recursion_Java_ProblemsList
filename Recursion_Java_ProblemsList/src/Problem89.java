
import java.util.HashMap;
import java.util.Map;

/*
 * Reed は頭の回転の速さを測るテストを行なっています。
 * それは、順番がバラバラの文字を見たときに、並び替えたら回文になるかどうか答えるというものでした。
 * 文字列 s が与えられるので、並び替えたときに回文にできるかどうかを判定する、canFormPalindrome という関数を作成してください。
 */
public class Problem89 {
    public static boolean canFormPalindrome(String s){
        Map<String,Integer> map= new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.substring(i,i+1))){
                map.replace(s.substring(i,i+1),map.get(s.substring(i,i+1))+1);
            }else{
                map.put(s.substring(i,i+1),1);
            }
        }

        int oddCount = 0;
        for(String key : map.keySet()){
            if(map.get(key).intValue()%2==1) oddCount += 1;
            if(oddCount==2) return false;
        }

        return true;
    }
}
