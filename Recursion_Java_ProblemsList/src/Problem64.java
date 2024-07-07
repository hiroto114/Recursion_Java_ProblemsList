/*
 * 単語内の文字カウント
 */
public class Problem64 {
    public static int charInBagOfWordsCount(String[] bagOfWords, char keyCharacter){
        String target = String.join("", bagOfWords);

        int result = 0;
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)== keyCharacter){
                result += 1;
            }
        }

        return result;

    }
}
