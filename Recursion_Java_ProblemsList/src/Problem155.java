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
    public static int longestConsecutiveLength(String s){
        int result = 0;
        int count = 1; // →ここでインプットされた文字列の1文字目をカウントしとく
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count += 1;
                if(i == s.length()-2){
                    result = (count > result) ? count: result;    
                }
            }else{
                result = (count > result) ? count: result;
                count = 1;
            }

        }

        return result;

    }
}
