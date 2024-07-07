import java.util.HashMap;
import java.util.Map;
/*
 * Redd はマッチングアプリを開発しています。
 * ユーザーの属性をアルファベットで記録しており、アルファベットの並ぶパターンが同じユーザーは相性が良いと判定しています。
 * ユーザー1 の属性 user1、ユーザー2 の属性 user2 が与えられるので、
 * この 2 つが同じパターンをしているかどうか判定する、hasSameType という関数を定義してください。
 */
public class Problem111 {
    public static boolean hasSameType(String user1, String user2) {
        return hasSameTypeFromLeftToRight(user1, user2)&&hasSameTypeFromLeftToRight(user2, user1);
    }

    public static boolean hasSameTypeFromLeftToRight(String user1, String user2) {
        if (user1.length() != user2.length()) return false;

        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < user1.length(); i++) {
            char char1 = user1.charAt(i);
            char char2 = user2.charAt(i);
            if (mapping.containsKey(char1)) {
                if (mapping.get(char1) != char2) {
                    return false;
                }
            } else {
                mapping.put(char1, char2);
            }
        }
        return true;
    }
}
