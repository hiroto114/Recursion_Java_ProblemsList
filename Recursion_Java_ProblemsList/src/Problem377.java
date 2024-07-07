/*
 * 文字列 s と文字 letter が与えられるので、s 内の letter を全て削除した文字列を返す
 * replaceWithChar という関数を作成してください。ただし、letter が含まれていない場合は、s をそのまま返してください。
 */
public class Problem377 {
    public static String replaceWithChar(String s, char letter){
        return s.replaceAll(String.valueOf(letter),"");

    }
}
