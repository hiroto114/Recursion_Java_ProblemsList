/*
 * Maria はスコアを多く取った人が勝つゲームに参加しています。
 * このゲームで勝つために、途中で他プレーヤーのスコアから x 桁の数字を削除することになりました。
 * 他プレーヤーのスコア num が文字列として与えられるので、最小値になるようにその数から x 桁の数字を削除して返す、deleteXDigits という関数を作成してください。
 * 
 * deleteXDigits("5876659",3) --> 5659
 * deleteXDigits("70400",1) --> 400
 * deleteXDigits("20",2) --> 0
 * deleteXDigits("20",1) --> 0
 * deleteXDigits("223",1) --> 22
 * deleteXDigits("3305",1) --> 305
 * deleteXDigits("3305",5) --> 0
 * 
 */
public class Problem297 {
    public static String deleteXDigits(String number, int x) {
        if(number.length()<=x) return "0";
        for(int i=0;i<x;i++){
            // 一文字ずつ削っていって最大値を見つける
            number = deleteOneStringForHighestScore(number);
        }
        return number;
    }

	// 数字が与えられるので、1桁削って最大のものを返す関数
    public static String deleteOneStringForHighestScore(String number){
        String result = number;
        String expectedResult = "";
        for(int i=0;i<number.length();i++){
            // 暫定結果と他の1文字を削った値を比較して最大値を更新していく
            expectedResult = (new StringBuilder(number)).deleteCharAt(i).toString();
            if(Integer.parseInt(result) > Integer.parseInt(expectedResult)){
                result = expectedResult;
            }
        }
        // resultの先頭0を削除
        return String.valueOf(Integer.parseInt(result));
    }
}
