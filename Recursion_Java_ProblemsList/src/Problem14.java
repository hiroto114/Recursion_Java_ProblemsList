/**
 * Frige は明日学校があるのかわかっていません。祝日または土日の場合、基本的に学校はありません。
 * 明日の曜日 day とその日が祝日かどうかをあらわすブール値 isHoliday
 * （祝日なら true、そうでないなら false）が与えられるので、
 * 学校があるか判定する isThereSchool という関数を作成してください。
 */
public class Problem14 {
    public static boolean isThereSchool(String day, boolean isHoliday){
        if(day.equals("Saturday") || day.equals("Sunday")) return false;
        if(isHoliday) return false;
        return true;
    }
}
