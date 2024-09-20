
/*
 * アルファベットの文字列 s が与えられるので、文字列に含まれる小文字の数を計算する関数 countLowerCase を作成してください。
 */
public class Problem609 {
    public static int countLowerCase(String s){
        int result = 0;
        for(int i=0;i<s.length();i++){
            if(s.substring(i,i+1).matches("[a-z]")){
                result += 1;
            }
        }

        return result;
    }
}
