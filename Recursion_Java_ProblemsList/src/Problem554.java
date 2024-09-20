
/*
 * 文字列として表された二点の正の座標の配列 pointsList が与えられるので、
 * それぞれ整数型の距離に変換して返す calcDistanceList という関数を作成してください。
 */
public class Problem554 {
    public static String[] calcDistanceList(String[] pointsList){
        String[] result = new String[pointsList.length];
        for(int i=0;i<result.length;i++){
            result[i] = calcDistanceListHelper(pointsList[i]);
        }
        return result;
    }

    public static String calcDistanceListHelper(String a){
        String[] aXY = a.split("-");
        return String.valueOf(Math.abs(Integer.parseInt(aXY[0])-Integer.parseInt(aXY[1])));  
    }
}
