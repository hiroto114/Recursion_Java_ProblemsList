/*
 * Mendolia は会社用に新たなパスワードを発行しています。
 * パスワードは a - z の小文字で回文でなければならない制約がありました。
 * 会社には回文になっていない場合、自動で回文にするために文字を削除するシステムが備わっています。
 * 空白を含まないパスワード password が与えられるので、その文字列が回文になるために削除されるべきインデックスを返す、findIndexToDelete という関数を定義してください。
 * 文字は 1 つだけ削除されるとします。もし与えられた文字列がすでに回文である場合は、-1 を返してください。
 * どの文字を削除しても回文とならない場合は -2 を返してください。ただし、該当するインデックスが複数ある場合、前方のインデックスを優先してください。
 * 
 * findIndexToDelete("aaab") --> 3
 * findIndexToDelete("forkayak") --> -2
 * findIndexToDelete("baa") --> 0
 * findIndexToDelete("abca") --> 1
 * findIndexToDelete("aaa") --> -1
 * findIndexToDelete("englishsilgne") --> -1
 * findIndexToDelete("abckktkcba") --> 3
 * findIndexToDelete("abckstvcba") --> -2
 * findIndexToDelete("kasabk") --> 4
 * findIndexToDelete("kastabk") --> -2
 * findIndexToDelete("englishsiilgne") --> 8
 * findIndexToDelete("englishslgne") --> 4
 * findIndexToDelete("kkkckk") --> 0
 * findIndexToDelete("kkkkckkk") --> 0
 */
public class Problem103 {
    public static int findIndexToDelete(String password){

        // 両端からチェックしていきます。
        int right = password.length() - 1;
        int left = 0;


        while (left < right) {
            // 端が等しくないとき
            if (password.charAt(left) != password.charAt(right)) {

                // leftを削除した文字列が回文かどうかチェックします。
                if (isPalindrome(password, left+1, right)) return left;
                // rightを削除した文字列が回文かどうかチェックします。
                if (isPalindrome(password, left, right-1)) return right;

                return -2;
            }

            // 端が等しいときは内側へ進めます。
            left++;
            right--;
        }

        return -1;
    }

    // leftとright（端）を受け取って、回文かどうかチェックする関数
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
