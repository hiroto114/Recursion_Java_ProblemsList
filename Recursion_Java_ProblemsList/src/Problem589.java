/*
 * 文字列 s が与えられるので、各アルファベットの小文字を大文字に、
 * 大文字を小文字に変換する関数 swapStringCase を作成してください。
 * 別の関数 swapCase を使って、各文字の大文字と小文字を交換します。
 */
public class Problem589 {
    public static String swapStringCase(String s){
        String result = "";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                result += Character.toLowerCase(s.charAt(i));
            }else if(Character.isLowerCase(s.charAt(i))){
                result += Character.toUpperCase(s.charAt(i));
            }else{
                result += s.charAt(i);
            }
        }

        return result;
    }
}
