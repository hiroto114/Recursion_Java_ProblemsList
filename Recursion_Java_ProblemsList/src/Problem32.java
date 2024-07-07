/*
 * 入力された E メールアドレスの 4 文字目から @ までを「...」で隠して表示する、
 * hideAddress という関数を作成してください。
 * @ の前が 4 文字以下の場合は、与えられたメールアドレスをそのまま返してください。
 */
public class Problem32 {
    public static String hideAddress(String address){
        // 文字列の先頭から "a" を検索
        int index = address.indexOf("@");

        // @の前が4文字以下の場合
        if(index <=4) return address;
        // 4文字目～＠までを...で隠して表示
        return address.substring(0,3)+"...@"+address.substring(index+1,address.length());
    }
}
