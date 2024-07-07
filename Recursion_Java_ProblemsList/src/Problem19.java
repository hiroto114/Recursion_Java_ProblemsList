/**
 * Paul は自身のサービスのベータテストユーザーを、メールアドレス登録によって受け付けようと思いました。
 * その際、ユーザーのメールアドレスが有効なものなのかをチェックするプログラムが必要になります。
 * あるメールアドレス email を受け取るので、それが正しいものであれば true を、
 * そうでなければ false を返す isValidEmail という関数を作成してください。
 * ここでの正しいアドレスというのは以下の 4 つの条件を満たすものを指します。
 * 「@」から始まらないこと
 * スペースがないこと
 * 「@」を 1 つのみ含んでいること
 * 「@」の後に「.」があること
 */
public class Problem19 {
    public static boolean isValidEmail(String email){
        //「@」から始まらないこと
        if(email.charAt(0)=='@') return false;
        //スペースがないこと
        if(email.indexOf(" ") != -1) return false;
        //「@を含んでいること
        if(!email.contains("@")) return false;
        //「@を1つのみ含んでいること
        if( email.indexOf("@") != email.lastIndexOf("@")) return false;
        //「@」の後に「.」があること
        if(email.indexOf("@") > email.lastIndexOf(".")) return false;
        return true;

    }
}
