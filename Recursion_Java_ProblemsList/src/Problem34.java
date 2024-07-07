/**
 * Lauren はアプリ開発のチームに所属され、新規登録のパスワードの実装を担当することになりました。
 * パスワード password が与えられるので、それが正しいかフォーマットになっているかブール値によって判定する、
 * isValidPassword という関数を作成してください。パスワードの条件は以下の通りです。
 * スペースがない
 * 大文字と小文字を含む
 * 数字を含む
 * 文字列が 6 以上
 * 記号は含まない
 */
public class Problem34 {
    public static boolean isValidPassword(String password){
        if(password.contains(" ")) return false;
        if(password.equals(password.toLowerCase())) return false;
        if(password.equals(password.toUpperCase())) return false;
        if(!(password.matches(".*[0-9]{1}.*"))) return false;
        if(password.length()<=5) return false;
        if(password.matches(".*[\\.{}].*")) return false;

        return true;
    }
}
