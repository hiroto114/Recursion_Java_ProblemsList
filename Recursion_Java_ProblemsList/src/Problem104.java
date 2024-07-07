import java.util.HashSet;
import java.util.Set;

/*
 * Faraone は宿題で英文を作るように頼まれました。
 * ただし、a - z までの全てのアルファベットを含まなければいけない条件がついています。
 * 英文 string が与えられるので、a - z までの全ての文字を含んでいるか判定する、isPangram という関数を作成してください。
 */
public class Problem104 {
    public static boolean isPangram(String string){
        string = string.toLowerCase();
        Set<String> stringSet = new HashSet<String>();
        for(int i=0;i<string.length();i++){
            if(string.substring(i, i+1).matches("[a-z]{1}")){
                stringSet.add(string.substring(i, i+1));
            }
        }
        return stringSet.size()==26;
    }
}
