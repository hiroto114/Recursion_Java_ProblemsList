/*
 * 私たちの住む世界で 1, 2, 3, 4, 5 と前の数に 1 を足して次の数を求めるように、
 * Jacques の住む世界ではある法則Xにしたがって数を数えていきます。自然数 n が与えられるので、
 * 以下のルールに従って処理を行い、値を返す、countPattern という関数を再帰を使って作成してください。
1 => 1
2 => 11
3 => 21
4 => 1211
5 => 111221
スタートは 1 から始まります。1 は「1 つの 1」つまり、11 と解釈されます。
11 は「2 つの 1」つまり、21 と解釈されます。21 は「1 つの 2、1 つの 1」つまり、1211 と解釈されます。
1211 は「1 つの 1、1 つの 2、2 つの 1」つまり、111221 と解釈されます。
出力が文字列であることに注意してください。
(具体例)
countPattern(1) --> 1
countPattern(2) --> 11
countPattern(3) --> 21
countPattern(4) --> 1211
countPattern(5) --> 111221
countPattern(6) --> 312211
countPattern(9) --> 31131211131221
countPattern(11) --> 11131221133112132113212221
 */
public class Problem181 {
    public static String countPattern(int n){
        return countPatternHelper("1", n);
    }
    public static String countPatternHelper(String strInput, int n){
        if(n == 1) return strInput;
        StringBuilder result = new StringBuilder("");
        int start = 0;
        for(int i=0;i<strInput.length();i++){
            if(i == strInput.length() - 1){
                result.append(String.valueOf(i - start + 1) + strInput.charAt(start));
                break;
            }
            if(strInput.charAt(i) != strInput.charAt(i+1)){
                result.append(String.valueOf(i - start + 1) + strInput.charAt(start));
                start = i + 1;
            }
        }
        return countPatternHelper(result.toString(), n-1);
    }
}
