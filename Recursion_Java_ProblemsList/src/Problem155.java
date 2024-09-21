/*
 * Luke は音楽ストリーミングアプリの開発者であり、ユーザーのデータ分析を行なっています。
 * そのアプリではユーザーが画面操作をするたびにデータが集まるようになっています（例：再生ボタンが押されたら 'a'、スキップボタンが押されたら 'b' が出力される仕組み）。
 * 出力された文字列 s が与えられるので、その中で最も多く連続で出力されたアルファベットの数を返す、longestConsecutiveLength という関数を作成してください。
 * longestConsecutiveLength("bb") --> 2
 * longestConsecutiveLength("recursion") --> 1
 * longestConsecutiveLength("helloworld") --> 2
 * longestConsecutiveLength("hellogood") --> 2
 * longestConsecutiveLength("ccccssccccc") --> 5
 * longestConsecutiveLength("abbcccddddeeeeedcba") --> 5
 * longestConsecutiveLength("aaabbbCCCdddEEE") --> 3
 * longestConsecutiveLength("AAAAAbbbcccdddeee") --> 5
 * longestConsecutiveLength("abcdeabcd") --> 1
 * longestConsecutiveLength("boobbookkeeper") --> 2
 * longestConsecutiveLength("Successfully") --> 2
 * 
 */
public class Problem155 {
    /**
     * 思想
     * 1,String sの部分文字列の左端と右端、結果を詰める変数を用意
     * 2,右端が文字列に含まれる範囲内で次の操作を実施する
     * 3,左端と右端の値が一致していればこの時の値をresultに反映
     * 4,右端を1つ右にずらす
     * 5,もしも不一致ならここまでの結果をresultに反映
     */
    public static int longestConsecutiveLength(String s){
        int start = 0;
        int end = 0;
        int result = 1;
        while(end < s.length()){
            if(s.charAt(start) == s.charAt(end)){
                result = Math.max(result, end - start + 1);
                end += 1;
            } else {
                result = Math.max(result, (end-1) - start + 1);
                start = end;
            }
        }
        return result;
    }
}
