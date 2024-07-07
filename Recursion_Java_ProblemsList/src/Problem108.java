/*
 * Jeffers は本の感想を共有できる web プラットフォームを開発しており、
 * 投稿の内容から自動でジャンル分けをするシステムを入れようとしました。
 * そのために、文章を各単語に分解する必要があります（例：I like music -> I と like と music に分解）。
 * 英単語のみで構成された文章 sentence が与えられるので、各単語を配列に格納して返す、
 * generateWordListという関数を作成してください。
 */
public class Problem108 {
	// これは全然難しくない。便利なライブラリを駆使すれば1行で書ける。
    public static String[] generateWordList(String sentence){
        return sentence.split(" ");
    }
}
