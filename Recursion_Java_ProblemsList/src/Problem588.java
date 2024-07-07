/*
 * 文字列 s と回数 times が与えられるので、文字列内の各文字を、
 * 指定された回数だけ繰り返して出力する関数 repeatStringChars を作成してください。
 * 別の関数 repeatChar を使用して、各文字を指定された回数だけ繰り返します。
 * 
 * repeatStringChars("Hello",3) --> HHHeeellllllooo
 * repeatStringChars("ab",10) --> aaaaaaaaaabbbbbbbbbb
 */
public class Problem588 {
    public static String repeatStringChars(String s, int times){
        String result = "";

        for(int sI=0;sI<s.length();sI++){
            for(int timesI = 1;timesI<=times;timesI++){
                result += s.substring(sI,sI+1);
            }
        }

        return result;
    }
}
