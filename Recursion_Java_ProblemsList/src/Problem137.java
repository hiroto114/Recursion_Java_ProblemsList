/*
 * Keezer は子供向けに回文を探すゲームを開発しています。
 * 文字列 string が与えられるので文字列の中に含まれる最長の回文を返す、longestPalindromicSubstring という関数を定義してください。
 * 該当する回文が複数ある場合は最初に出てくる回文を優先してください。
 */
public class Problem137 {
	/**
	 * 動的計画法を使うと空間計算量は使うが、時間計算量を大幅に短縮できる。
	 * @param string
	 * @return
	 */
    public static String longestPalindromicSubstring(String string){
        int max = (int)-Integer.MAX_VALUE;
        int left = 0;
        int right = 0;

        for (int i = 0; i < string.length(); i++) {

            // 2パターンの回文をチェック
            int len1 = expandFromMiddle(string, i, i);      // abcdcbaパターン
            int len2 = expandFromMiddle(string, i, i+1);    // abcddcbaパターン

            // 大きい方を取得
            int curr = Math.max(len1, len2);

            // maxより大きければ、maxを更新します
            if (max < curr) {
                max = curr;
                // len, iを使ってleftとrightの位置を特定
                left = i - (max-1)/2;
                right = i + max/2;
            }
        }

        // 文字を切り取って返します
        return string.substring(left, right+1);
    }
    
    // 真ん中から左右に広がって、回文の長さを返す関数
    public static int expandFromMiddle(String string, int left, int right) {
        while (left >= 0 && right <= string.length() - 1 && string.charAt(right) == string.charAt(left)) {
            left--;
            right++;
        }

        return (right - 1) - (left + 1) + 1;
    }
/*  自分が当初思い描いた案。
    public static String longestPalindromicSubstring(String string){
        int maxLength = string.length();
        for(int i=maxLength;i>0;i--){
            for(int m=0;m+i<=string.length();m++){
                if(longestPalindromicSubstringHelper(string.substring(m,m+i))){
                    return string.substring(m,m+i);
                }
            }
        }
        return string.substring(0,1);
    }

    public static boolean longestPalindromicSubstringHelper(String string){
        String b = (new StringBuilder(string)).reverse().toString();

        return string.equals(b);
    }
*/
}
