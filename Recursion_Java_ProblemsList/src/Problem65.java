
/*
 * 文字コード
 */
public class Problem65 {
    public static boolean isFirstStringLarger(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        return getAsciiString(s1) > getAsciiString(s2);
    }

    public static int getAsciiString(String input){
        int result = 0;
        for(int i=0;i<input.length();i++){
            result += (int) input.charAt(i);
        }

        return result;
    }
}
