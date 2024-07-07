import java.util.Arrays;

/*
 * ブラックジャック
 * Jimmy はカジノでブラックジャックを行いました。Jimmy の手札 playerCards、ディーラーの手札 houseCards が与えられるので、
 * Jimmy が勝利した場合 true、ディーラーが勝利した場合 false を返す、winnerBlackjack という関数を定義してください。
 * 
 * 条件は以下の通りです。
 * カードはマークと値によって構成されています
 * カードの値は、A = 1、2-10 はそのままの値、J = 11、Q = 12、K = 13 とします
 * プレイヤーの手札の合計値が 21 を超えている場合はプレイヤーの敗北となります
 * ディーラーの手札の合計値が 22 未満でかつプレイヤーのカードの合計値より大きければ、プレイヤーの敗北となります
 * ドローだった場合はプレイヤーの敗北となります
 */
public class Problem67 {
    public static boolean winnerBlackjack(String[] playerCards, String[] houseCards){
        int playerCardsSum = calculateCardNumberSum(playerCards);
        int houseCardsSum  = calculateCardNumberSum(houseCards);

        if(playerCardsSum > 21) return false;
        if(houseCardsSum < 22 && houseCardsSum > playerCardsSum) return false;
        if(houseCardsSum == playerCardsSum) return false;

        return true;
    }

    public static int calculateCardNumberSum(String[] playerCards){
        return Arrays.stream(playerCards)
                        .mapToInt(Problem67::generateCardNumberFromCardInfo)
                        .sum();
    }

    public static int generateCardNumberFromCardInfo(String input){
        switch (input.charAt(1)) {
            case 'A':
                return 1;
            case 'J':
                return 11;
            case 'Q':
                return 12;
            case 'K':
                return 13;
            default:
                return Integer.parseInt(input.substring(1));
        }
    }
}
