/*
 * Shakur はユーザーの文章記述を改善するアプリを開発しています。
 * それは、ユーザーに英文を記述してもらい、記述文から書き方の癖を分析してアドバイスを送るというものです。
 * そこで、ユーザーが何回大文字を含んだ単語を書いたか把握する必要があります。
 * ユーザーの英文 sentence が与えられるので、大文字が使われた単語の数を返す、countCapitalWords という関数を定義してください。
 */
public class Problem102 {
	/*
	 * 正規表現を使うよりもCharacter.isUpperCaseを使うほうが断然わかりやすいな。
	 */
    public static int countCapitalWords(String sentence){
        String[] splitArray = sentence.split("\\s+");
        
        int result = 0;
        for(int i=0;i<splitArray.length;i++){
            if(splitArray[i].matches(".*[A-Z]{1}.*")){
                result++;
            }
        }

        return result;
    }
}
