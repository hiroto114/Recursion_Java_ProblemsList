/*
 * Jeffers は本の感想を共有できる web プラットフォームを開発しています。
 * そこでは投稿の際、文章中にいくつ単語があるか見れるようになっています。
 * 英単語のみで構成された文章 sentence が与えられるので、そこに含まれる単語数をカウントする、countWords という関数を作成してください。
 */
public class Problem117 {
	// 便利なライブラリとメソッドを使えば1発
    public static int countWords(String inputSentence){
        return inputSentence.split(" ").length;

    }
}
