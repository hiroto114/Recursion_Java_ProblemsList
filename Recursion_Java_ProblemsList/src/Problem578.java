public class Problem578 {
    public static String modifyString(String s, int length){
        if(s.length()<=length) return s;
        if(length <= 0) return "";

        return s.substring(0,length);
    }
}
