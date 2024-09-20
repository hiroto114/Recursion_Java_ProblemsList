
public class Problem580 {
    public static String mirrorString(String s){
        return s + (new StringBuilder(s)).reverse().toString();
    }
}
