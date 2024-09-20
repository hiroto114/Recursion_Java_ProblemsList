
import java.util.ArrayList;
import java.util.List;

/*
 * サブスクリプションリスト
 * Sanchez はメルマガを定期的に配信しています。
 * 会員のメールアドレスリスト emailList が与えられるので、正しく利用できるメールアドレスだけを配列として返す
 * validEmailList という関数を定義してください。
 * 
 * 正しいメールアドレスの条件は以下の通りです。
 * スペースがないこと
 * 「@」を 1 つのみ含んでいること
 * 「@」の後に「.」があること
 * 「@」から始まらないこと
 */
public class Problem68 {
    public static String[] validEmailList(String[] emailList){
        List<String> result = new ArrayList<String>();
        for(String email : emailList){
            if(validEmailListHelper(email)){
                result.add(email);
            }
        }

        return result.toArray(new String[result.size()]);
    }

    public static boolean validEmailListHelper(String email){
        if (email.contains(" ")) {
        	return false;
        }
        if (email.startsWith("@")) {
        	return false;
        }
        if (email.lastIndexOf(".") < email.indexOf("@")) {
        	return false;
        }
        if (email.indexOf("@") == -1) {
        	return false;
        }
        if (email.indexOf("@") != email.lastIndexOf("@")) {
        	return false;
        }
        return true;
    }
}
