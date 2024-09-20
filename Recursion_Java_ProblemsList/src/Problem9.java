
/**
 * 姓と名がそれぞれ lastName と firstName として与えられるので、
 * イニシャルを返す、nameInitials という関数を定義してください。
 */
public class Problem9 {
    public static String nameInitials(String firstName, String lastName){
        return firstName.substring(0,1) + '.' + lastName.substring(0,1);
    }
}
