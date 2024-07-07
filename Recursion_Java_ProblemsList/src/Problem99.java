/*
 * Amuedo は全ての単語のスペルが反対になる世界に来てしまいました。
 * この世界で文章を読むためには、あらゆる単語のスペルを反対にしなければいけません。
 * 文章 sentence が与えられるので、各単語のみを逆向きに表示する、reverseWords という関数を作成してください。
 * 
 * reverseWords("olleh dlrow") --> hello world
reverseWords("hello world") --> olleh dlrow
reverseWords("Please wait outside of the house") --> esaelP tiaw edistuo fo eht esuoh
reverseWords("He started to believe in ghosts") --> eH detrats ot eveileb ni stsohg
reverseWords("Red is greener than purple") --> deR si reneerg naht elprup
 */
public class Problem99 {
    public static String reverseWords(String sentence){
        String[] splitSentence = sentence.split(" ");
        for(int i=0; i<splitSentence.length; i++){
            splitSentence[i] = reverseString(splitSentence[i]);
        }
        return String.join(" ", splitSentence);
    }

    public static String reverseString(String input){
        return (new StringBuilder(input)).reverse().toString();
    }
}
