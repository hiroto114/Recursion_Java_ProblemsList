import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/*
 * 
 * nonDuplicateNames(['a','b'],["aa","ec","dd","ee","lc","aa"]) --> [bb]
 * nonDuplicateNames(['k','b','p','j'],["kk","bb","bb","cc","ll","kk"]) --> [jj,pp]
 * nonDuplicateNames(['p','l','m'],["mm","nj","ak","mm","mm","mm"]) --> [ll,pp]
 * nonDuplicateNames(['a','c','s','w'],["ms","ke","as","ml","yu","ms"]) --> [aa,cc,ss,ww]
 * nonDuplicateNames(['a'],["ba","ab"]) --> [aa]
 * 
 * Treesetについてoracleより
 * 「TreeMapに基づくNavigableSet実装です。要素の順序付けは、自然順序付けを使って行われるか、
 * セット構築時に提供されるComparatorを使って行われます。そのどちらになるかは、
 * 使用するコンストラクタによって決まります。」
 * 
 */
public class Problem503 {
    public static String[] nonDuplicateNames(char[] characterList, String[] pastArray){
        TreeSet resultSet = new TreeSet();
        List<String> pastList = Arrays.asList(pastArray);
        for(char i : characterList){
            if(!pastList.contains(String.valueOf(i)+String.valueOf(i))){
                resultSet.add(String.valueOf(i)+String.valueOf(i));
            }
        }

        String[] result = new String[resultSet.size()];
        int i = 0;
        for (Object v : resultSet) {
            result[i++] = String.valueOf(v);
        }
        return result;
    }
}
