/*
 * 姓 lastName 名 firstName が与えられるので、lastName の長さが firstName の長さ以上かどうか判定する isLastNameLonger という関数を作成してください。
 */
public class Problem374 {
    public static boolean isLastNameLonger(String firstName, String lastName){
        return lastName.length() >= firstName.length();
    }
}
