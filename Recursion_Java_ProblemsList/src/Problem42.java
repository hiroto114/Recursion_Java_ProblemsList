/**
 * Michaela は今日昼寝をしてしまったため、なかなか寝付くことができません。
 * そこで羊を 1 匹ずつ数えて眠りを待つことにしました。0 以上の整数 count が与えられるので、
 * 夢の中で count 匹羊を数える、sheeps という関数を作成してください。
 */
public class Problem42 {
    public static String sheeps(int count){
        StringBuilder result = new StringBuilder("");
        for(int i =1;i<=count;i++){
            result.append(i + " sheep ~ ");
        }

        return result.toString();
    }
}
