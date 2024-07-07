/*
 * 紀元前 70 年頃、古代ローマの軍事的指導者ガイウス・ユリウス・カエサル（Gaius Iulius Caesar）は
 * 秘密文書を敵に解読されないために文字列に含まれる全ての単語を数文字分シフトさせる方法を思いつきました。
 * 小文字によって構成された文字列 message、自然数 n が与えられるので、暗号を作成する caesarCipher という関数を作成してください。
 * z の次は a に戻ることに注意してください。また空白によってメッセージが読み取られないよう、返される文字列の空白は全て取り除いてください。
 * caesarCipher("i love you",0) --> iloveyou
 * caesarCipher("i love you",1) --> jmpwfzpv
 * caesarCipher("i love you",2) --> knqxgaqw
 * caesarCipher("the future belongs to those who believe in the beauty of their dreams",2) --> vjghwvwtgdgnqpiuvqvjqugyjqdgnkgxgkpvjgdgcwvaqhvjgktftgcou
 * caesarCipher("it is during our darkest moments that we must focus to see the light",5) --> nynxizwnsltzwifwpjxyrtrjsyxymfybjrzxykthzxytxjjymjqnlmy
 * caesarCipher("do not go where the path may lead go instead where there is no path and leave a trail",10) --> nyxydqygrobodrozkdrwkivoknqysxcdo
 */
public class Problem95 {
    public static String caesarCipher(String message, int n){
        String replacedMessage = message.replaceAll(" ","");
        StringBuilder result = new StringBuilder("");
        
        for(int i=0; i<replacedMessage.length(); i++){
            result.append(convertBehind(replacedMessage.charAt(i), n));
        }

        return result.toString();
    }

    /**
     * 文字cを後ろにn分進ませたときの文字を返却
     */
    public static char convertBehind(char c, int n){
        return (char)(((c - 97 + n ) % 26) + 97);
    }
}
