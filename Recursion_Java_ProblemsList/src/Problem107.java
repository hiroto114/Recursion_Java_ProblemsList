import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/*
 * Block は野球のリーグ戦の運営者であり、26 チーム（a チームから z チームまで）の試合の組み合わせを考えています。
 * リーグ戦では、各チームが同じ数の試合を行う必要があります。
 * Block は、どのチームが試合を行ったかを記録しており、
 * 例えば「a チーム」と「b チーム」が試合を行った場合、「ab」と記録されます。
 * このようにして、「aabcbcdda」のような記録が作成されることもあります。
あなたの仕事は、与えられた文字列 teams で、全てのチームが同じ数の試合を行っているかを判定する
findXTimes という関数を作成することです。文字列 teams は試合を行ったチームの名前が連続して記録されたものです。
 */
public class Problem107 {
    public static boolean findXTimes(String teams){
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<teams.length();i++){
            if(map.get(teams.substring(i,i+1))==null){
                map.put(teams.substring(i,i+1),1);
            }else{
                map.put(teams.substring(i,i+1),map.get(teams.substring(i,i+1))+1);
            }
        }
        
        // これはスマート。mapのバリューが1種類しかないのであればhashsetに入れたらサイズ1になるし。
        HashSet<Integer> hs = new HashSet<Integer>();

        for (String key: map.keySet()) {
            hs.add(map.get(key));
        }

        return hs.size()==1; 
    }
}
