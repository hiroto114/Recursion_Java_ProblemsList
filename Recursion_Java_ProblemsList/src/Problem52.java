
/*
 * 3 回以上欠席して、単位を取得できない判定
 */
public class Problem52 {
    public static String doYouFail(String string){
        int absentCount = 0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='A') absentCount += 1;         
        }

        return absentCount < 3 ? "pass" : "fail" ;
    }
}
