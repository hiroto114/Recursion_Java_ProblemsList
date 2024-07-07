/*
 * 今年の株取引の記録が ["取得したときの株価-所有株数-現在の株価"] のような文字列の配列として記録されています。
 * 配列 stockList が与えられるので、reduce を使って今年の損益を計算する calcProfitsOrLosses という関数を作成してください。
 * 
 * calcProfitsOrLosses(["2000-200-3000","11-1000-50","100-100-50"]) --> 234000
 * calcProfitsOrLosses(["546-51-231","482-17-361","701-19-556","44-1-598","658-8-76"]) --> -24979
 * calcProfitsOrLosses(["197-67-857","586-2-969","412-81-829","501-52-601","462-32-176"]) --> 74811
 * calcProfitsOrLosses(["1-100-2","3-10-5"]) --> 120
 */
public class Problem557 {
    public static int calcProfitsOrLosses(String[] stockList){
        int result = 0;
        for(String stock : stockList){
            result += calcProfitsOrLossesHelper(stock);
        }

        return result;
    }

    public static int calcProfitsOrLossesHelper(String input){
        String[] result = input.split("-");

        return (Integer.parseInt(result[2])-Integer.parseInt(result[0]))*Integer.parseInt(result[1]);
    }
}
