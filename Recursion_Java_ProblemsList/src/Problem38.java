/**
 * Terry は Mercedes-Benz で高級車をローンで購入しました。
 * 月々のローン initialLoan と期限内にお金を払ったか払っていないかを表すブール値 didPayOnTime が与えられるので、
 * $2.5 の手数料とローンの利子を請求する、interestsPaid という関数を作成してください。
 * 期限内にお金が支払われなかった場合、15% の利子となり、支払われた場合は 2% の利子が請求されます。
 */
public class Problem38 {
    public static double interestsPaid(int initialLoan, boolean didPayOnTime){
        double interest = didPayOnTime ? 0.02 : 0.15;
        double fee = 2.5;
        return initialLoan * (1 + interest) + fee;
    }
}
