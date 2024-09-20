
/*
 * リスト内の要素の足し合わせ
 */
public class Problem63 {
    public static int addEveryOtherElement(int[] intArr){
        int result = 0;
        for(int i:intArr){
            result += i;
        }
        return result;
    }
}
