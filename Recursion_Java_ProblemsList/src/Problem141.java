import java.util.HashMap;
import java.util.Map;

/*
 * Kilson はリズムゲームをプレイしており、画面上に表示される文字と同じパターンでボタン入力をする必要があります。
 * ユーザーのボタン入力 inputChar、画面上に表示される単語一覧 wordList が与えられるので、
 * 2 つが同じパターンかどうか判定する hasSameStructure という関数を定義してください。空白は同じ文字としてカウントしないものとします。
 * hasSameStructure("abc","hello world") --> false
hasSameStructure("tut","hot mild cold") --> false
hasSameStructure("tut","hot mild mild") --> false
hasSameStructure("aabac","word word dictionary word word") --> false
hasSameStructure("aabac","word word dictionary word string") --> true
hasSameStructure("abcabc","soccer baseball tennis soccer baseball tennis") --> true
hasSameStructure("zabccabcz","book comic phone music music comic phone music book") --> true
hasSameStructure("zzz","math math math") --> true
 */
public class Problem141 {
    public static boolean hasSameStructure(String inputChar, String wordList){
        String arr1[] = wordList.split(" ");
        if(arr1.length != inputChar.length()) return false;
        Map<String,String> map= new HashMap<>();
        for(int i=0; i<inputChar.length(); i++){
            if(map.get(inputChar.substring(i, i+1)) == null){
                map.put(inputChar.substring(i, i+1), arr1[i]);
            }
            if(map.get(arr1[i]) == null){
                map.put(arr1[i], inputChar.substring(i, i+1));
            }
            if(!map.get(inputChar.substring(i, i+1)).equals(arr1[i])){
                return false;
            }    
            if(!map.get(arr1[i]).equals(inputChar.substring(i, i+1))){
                return false;
            }    
        }
        return true;

    }
}
