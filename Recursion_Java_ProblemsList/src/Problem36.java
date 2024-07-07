/**
 * Tayler は友達から年利 20% で 10,000 ドル借金をしています。
 * そこで関数を開発することによって数年後に借金がどれほど膨らむのかシュミレーションすることにしました。
 * 年数 year が与えられるので、返済額を計算する howMuchIsYourDebt という関数を作成してください。小数点以下は切り捨てとします。
 * @author 0me6-
 *
 */
public class Problem36 {
    public static int howMuchIsYourDebt(int year){
        return (int) (10000*Math.pow(1.2,year));
    }
}
