/**
 * 回文判定メソッド作成
 */
public class Problem24 {
	/**
	 * 既存のライブラリを使うと超絶きれに書ける。
	 * 現場で求められているのは時間計算量と空間計算量、および可読性のトレードオフ。
	 * パフォーマンスが変わらず、尚且つ可読性も高めるには、既存のライブラリを使うしかない。
	 */
    public static boolean isPalindrome(String stringInput){
        String replacedString = stringInput.replaceAll(" ", "").toLowerCase();
        return replacedString.equals((new StringBuilder(replacedString)).reverse().toString());
    }
}
