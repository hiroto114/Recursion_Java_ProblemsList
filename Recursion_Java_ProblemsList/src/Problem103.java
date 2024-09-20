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
 * 
 * →解答は時間計算量O(n^2)、空間計算量O(1)
 */
public class Problem103 {
    /*
     * 答えおかしくね？って思ってテストしたら下記3ケースでミスってた。
     * どうやらleftとrightで一致していてもleftの方を消したらうまくいくからそれが答えのケースがあるらしい。
     * 1.("abckktkcba")==3
     * 2.("kkkckk")==0
     * 3.("kkkkckkk")==0
     */
    public static int findIndexToDelete(String password){
        if(isPalindrome(password)) return -1;
        for(int i=0;i<password.length();i++) {
        	if(i==0) {
        		if(isPalindrome(password.substring(1))) return i;
        	}else if(i==password.length()-1) {
        		if(isPalindrome(password.substring(0,password.length()-1))) return i;
        	// どうやらここで失敗してるっぽい。
        	}else {
        		if(isPalindrome(password.substring(0,i)+password.substring(i+1))) return i;
        	}
        }
        return -2;
    }

    // 回文かどうかチェックする関数
    public static boolean isPalindrome(String s) {
        if(s.length()<=1) return true;
        int left = 0;
        int right = s.length()-1;
        while(left<right) {
        	if(s.charAt(left) != s.charAt(right)) return false;
        	left++;
        	right--;
        }
        return true;
    }
}