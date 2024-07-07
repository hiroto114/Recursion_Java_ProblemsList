import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Mike は友達 3 人とお金を賭けながらサイコロゲームで遊んでいます。
 * このゲームでは 36 面で構成されているサイコロを n 回振ることができサイコロの目が出ると$4獲得し、蓄積していくことができます。
 * ただし、出た目が前に自分が出した目の数字よりも低い場合、バーストし、今までの蓄積は全て失われます。バーストは $4 獲得の前に起こります。

プレイヤーのサイコロ目を表す配列 player1、player2、player3、player4 が与えられるので、
勝利プレイヤー、その金額、勝利を決定した連続部分配列を文字列として返す、diceStreakGamble という関数を作成してください。
ただし、最終的に獲得した金額が同じ場合は最初にサイコロを投げた人を優先してください。このゲームではプレイヤー1、2、3、4の順にサイコロを投げます。
 */
public class Problem173 {
    /**
     * こんな感じの形式で（具体例）
     * Winner: Player 1 won $12 by rolling [1,2,3]
     */
    public static String diceStreakGamble(int[] player1, int[] player2, int[] player3, int[] player4){
        Map<Integer, List<Integer>> player1Result = diceStreakGambleHelper(player1);
        Map<Integer, List<Integer>> player2Result = diceStreakGambleHelper(player2);
        Map<Integer, List<Integer>> player3Result = diceStreakGambleHelper(player3);
        Map<Integer, List<Integer>> player4Result = diceStreakGambleHelper(player4);
        int playerResult = 0;
        int playerWonMoneyResult = 0;
        List<Integer> rollingResult = new ArrayList<Integer>();
        // ここら辺の処理は別関数に分けて処理を書いたほうが本関数の目的がわかる
        for(Map.Entry<Integer, List<Integer>> iterator: player1Result.entrySet()){
            if(playerWonMoneyResult < iterator.getKey().intValue()){
                playerResult = 1;
                playerWonMoneyResult = iterator.getKey().intValue();
                rollingResult = iterator.getValue();
            }
        }
        for(Map.Entry<Integer, List<Integer>> iterator: player2Result.entrySet()){
            if(playerWonMoneyResult < iterator.getKey().intValue()){
            playerResult = 2;
            playerWonMoneyResult = iterator.getKey().intValue();
            rollingResult = iterator.getValue();
            }
        }
        for(Map.Entry<Integer, List<Integer>> iterator: player3Result.entrySet()){
            if(playerWonMoneyResult < iterator.getKey().intValue()){
            playerResult = 3;
            playerWonMoneyResult = iterator.getKey().intValue();
            rollingResult = iterator.getValue();
            }
        }
        for(Map.Entry<Integer, List<Integer>> iterator: player4Result.entrySet()){
            if(playerWonMoneyResult < iterator.getKey().intValue()){
            playerResult = 4;
            playerWonMoneyResult = iterator.getKey().intValue();
            rollingResult = iterator.getValue();
            }
        }

        return "Winner: Player " + playerResult +" won $" + playerWonMoneyResult + " by rolling "
            + rollingResult.toString().replace(" ","");
    }

    public static Map<Integer, List<Integer>> diceStreakGambleHelper(int[] input){
        Map<Integer, List<Integer>> result = new HashMap<Integer, List<Integer>>();
        int resultMoney = 4;
        List<Integer> rollingResult = new ArrayList<Integer>();
        rollingResult.add(input[0]);
        for(int i=1; i<input.length; i++){
            if(input[i-1] <= input[i]){
                resultMoney += 4;
                rollingResult.add(input[i]);
            }
            if(input[i-1] >  input[i]){
                rollingResult.clear();
                resultMoney = 4;
                rollingResult.add(input[i]);
            }
        }
        System.out.println(resultMoney);
        result.put(resultMoney, rollingResult);
        return result;
    }
}
