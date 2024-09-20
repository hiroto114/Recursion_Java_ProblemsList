
import java.util.Arrays;
/*
 * Walker はあるワードゲームの大会で審判をしています。
 * そのゲームはアナグラムと言い、ある言葉の並びを入れ替えて他の単語を作るというものです（例：マンガ -> ガマン）。
 * 2 つの言葉 string1、string2 が与えられるので、2 つがアナグラムになっているか判定する isAnagram という関数を作成してください。
 * ここでは大文字と小文字の区別は付けません。また、スペースは文字として扱いません。
 */
public class Problem88 {
    public static boolean isAnagram(String string1, String string2){
        string1 = string1.replaceAll(" ","").toLowerCase();
        string2 = string2.replaceAll(" ","").toLowerCase();

        return stringSorter(string1).equals(stringSorter(string2));
    }

    /**
     * 文字列をソートして返却する
     * @param string1 ソートしたい文字列
     * @return ソートされた文字列
     */
    public static String stringSorter(String string1){
        //String型をchar型配列に変換
        char[] chars = string1.toCharArray();

        //String型をchar型配列に変換
        Arrays.sort(chars);

        //並び替えるString型を用意
        string1 = new String(chars);
        return string1;
    }
}
