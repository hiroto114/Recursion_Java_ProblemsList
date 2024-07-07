/*
 * Novak はソフトウェアのログイン画面を作成しており、入力されたパスワードが画面上で見えない機能を実装しています。
 * あるパスワード password が与えられるので、パスワードの文字数分 * で返す passwordStars という関数を作成してください。
 */
public class Problem146 {
    public static String passwordStars(String password){
        return "*".repeat(password.length());
    }
}
