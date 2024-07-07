import java.util.HashMap;
import java.util.Map;

/*
 * この問題では、donor という高階関数を作成します。
 * この関数は、特定の国の総寄付金額を管理するためのクロージャを生成します。
 * donor 関数は国名を文字列 countryName として受け取り、その国に関連する寄付金額を管理するクロージャを返します。
 * 
 * クロージャは、それが作成された環境の変数を記憶することができる特殊な関数です。
 * この問題では、異なる国ごとに独立した寄付金額の状態を管理する必要があります。
 * クロージャを使用することで、各国の寄付金額を個別に追跡し、他の国の寄付状況に影響されないようにすることができます。
 * つまり、一つの donor 高階関数から生成される各クロージャは、それぞれ異なるプライベート変数を持ち、
 * その国固有の寄付状況を独立して管理できます。
 */
public class Problem455 {
    private static Map<String, Integer> cache = new HashMap<String, Integer>();

    private static void donor(String countryName, int n) {
        cache.put(countryName, cache.getOrDefault(countryName, 0) + n);
	    System.out.println(countryName + ": $" + cache.get(countryName));
    }

    public static void main(String[] args) {
       donor("Japan", 4000000);
       donor("Italy", 7000000);
       donor("Canada", 3000000);
       donor("Japan", 1000000);
       donor("Canada", 3000000);
       donor("Italy", 0);
    }
}
