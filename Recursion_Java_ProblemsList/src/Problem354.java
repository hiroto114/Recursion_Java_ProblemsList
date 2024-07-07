/*
 * Jorge は高級レストランで家族と食事をしています。
 * クレジットカード会社 creditCardType と食事代（税抜き）cost が与えられるので、
 * 以下の条件に沿った、processPayment という関数を作成してください。
 * 
 * このレストランでは Visa か MasterCard 以外は対応しておらず、-1.0 を返します。
 * 消費税は一律 10% です。
 * ウェイターへのチップは食事代（税抜き）が 3 で割り切れるとき 3%、5 で割り切れるとき 5%、
 * 7 で割り切れるとき 7%、それ以外の場合は一律で 10% を請求します。
 * 合計金額が 300 ドルを超えると、クレジットカードが残高不足になり、-1.0 を返します。
 * 
 * processPayment("MasterCard",150) --> 169.5
 * processPayment("American Express",93) --> -1
 * processPayment("Visa",210) --> 237.3
 * processPayment("Visa",259) --> -1
 * processPayment("Visa",260) --> 299
 * processPayment("American Express",928) --> -1
 * processPayment("Visa Retired",683) --> -1
 * processPayment("Discover Card",10) --> -1
 * processPayment("American Express",160) --> -1
 * 
 */
public class Problem354 {
    public static double processPayment(String creditCardType , int cost){
        // もしも利用可能なカードだった場合
        if(availableCard(creditCardType)){
            // 合計金額
            double totalPayment = (cost)*(1.10)+(cost)*CaluculateWaiterChipFeeTax(cost);
            // もしも300円より大かった場合支払えない。以下だった場合支払える。
            return totalPayment > 300 ? -1.0 : totalPayment;
        // もしも利用不可なカードだった場合
        }else{
            return -1.0;
        }
    }

    /**
     * 利用可能なクレジットカード会社かどうか
     */
    private static boolean availableCard(String creditCardType){
        return "Visa".equals(creditCardType)||"MasterCard".equals(creditCardType);
    }

    /**
     * ウェイターに払うチップ料金の率を計算
     */
    private static double CaluculateWaiterChipFeeTax(int costWithoutTax){
        if(costWithoutTax % 3 ==0) return 0.03;
        if(costWithoutTax % 5 ==0) return 0.05;
        if(costWithoutTax % 7 ==0) return 0.07;
        return 0.10;
    }
}
