import java.util.HashMap;

/*
 * 重複なし最長部分文字列
 * Richard は SNS アプリを開発し、ユーザーがパスワードを作成する時にパスワードの強度を表示する機能を実装しようと思いました。
 * そこで、同じ文字を含まない文字数が長いほど強度が大きい仕組みにしようと考えています。
 * 小文字のパスワード password が与えられるので、同じ文字を含まない最長の文字列の長さを返す、longestSubstringLength という関数を作成してください。
 * 例えば、slloel では、loe が最長の部分文字列になります。
 * 
 * longestSubstringLength("abcabcab") --> 3
 * longestSubstringLength("abcdbcab") --> 4
 * longestSubstringLength("abcdcbcab") --> 4
 * longestSubstringLength("eafghijak") --> 7
 * longestSubstringLength("abcddcab") --> 4
 * longestSubstringLength("abcdddcab") --> 4
 * longestSubstringLength("aa") --> 1
 * longestSubstringLength("inciduntilloetassumendaet") --> 7
 * longestSubstringLength("cupiditatenonetomnisvoluptatumquidelectusaliquam") --> 11
 * longestSubstringLength("ametetoccaecatieosprovidentutvel") --> 11
 * longestSubstringLength("laudantiumsintlaborumpariaturquiadeserunt") --> 12
 * longestSubstringLength("omnisquiaoccaecaticommodi") --> 7
 */
public class Problem158 {
    public static int longestSubstringLength(String password){
        HashMap<Character, Integer> hashmap = new HashMap<>();  // 各文字のインデックスを格納
        int window = 0; // 同じ文字を含まない最大文字数を格納
        int start = 0;  // 同じ文字を含まない部分文字列の始まりのインデックス

        // 各文字を1つずつ取得
        for (int end = 0; end < password.length(); end++) {

            // hashmapに文字が存在していたら、startを更新
            if (hashmap.get(password.charAt(end)) != null) {
                start = Math.max(start, hashmap.get(password.charAt(end)) + 1)  ;
            } 
            
            hashmap.put(password.charAt(end), end);
            
            // windowを更新
            window = Math.max(window, end - start + 1);

        }

        return window;
    }

    public static void main(String[] args){
        System.out.println(longestSubstringLength("uddvqd"));
        System.out.println(longestSubstringLength("abcabcab"));
        System.out.println(longestSubstringLength("abcdbcab"));
        System.out.println(longestSubstringLength("abcdcbcab"));
        System.out.println(longestSubstringLength("eafghijak"));
        System.out.println(longestSubstringLength("inciduntilloetassumendaet"));
    }
}
