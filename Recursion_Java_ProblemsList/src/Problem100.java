import java.util.LinkedHashMap;
import java.util.Map;
/*
 * Zollar は算数の計算練習ができるウェブサイトを立ち上げました。
 * このサイトには a 問題から z 問題までの 26 個の問題があり、サイトには復習機能が備わっています。
 * この機能では、ユーザーが一度しか解いていない問題をトップページの一番上に表示します。
 * ユーザーが解いたことのある問題一覧が、小文字のアルファベットから成る文字列 s として与えられるとき、
 * この文字列内で最初に出現し、かつ一度しか解かれていない問題のインデックスを返す firstNonRepeating という関数を定義してください。
 * このような問題が存在しない場合は -1 を返してください。例えば、文字列が "aabbcdddeffg" の場合、
 * 一度しか解かれていない最初の問題は c で、そのインデックスは 4 なので 4 を返します。
 * 
 * firstNonRepeating("aabbcdddeffg") --> 4
firstNonRepeating("abcdabcdf") --> 8
firstNonRepeating("abcddaebcdf") --> 6
firstNonRepeating("aabbbccdd") --> -1
firstNonRepeating("ddecdfgf") --> 2
firstNonRepeating("abcdeeff") --> 0
firstNonRepeating("zzcbdefghafhgbbcd") --> 5
 */
public class Problem100 {
    public static int firstNonRepeating(String s){
        Map<String,Integer> countS = new LinkedHashMap<String,Integer>();

        for(int i=0;i<s.length();i++){
            if(countS.containsKey(s.substring(i,i+1))){
                countS.replace(s.substring(i,i+1),countS.get(s.substring(i,i+1))+1);
            }else{
                countS.put(s.substring(i,i+1),1);
            }
        }

        for(Map.Entry<String,Integer> set : countS.entrySet()){
            if(set.getValue().intValue()==1){
                return s.indexOf(set.getKey());
            }
        }

        return -1;        
    }
}
