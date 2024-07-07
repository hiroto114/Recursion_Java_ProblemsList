/**
 * J 航空では機内食を個人の好みに合わせて選択することができ、
 * オーダーは個々の座席に備え付けてあるディスプレイから受け付けます。
 * 乗客はまずメインディッシュとしてビーフかチキンのどちらかを選び、
 * その後ドリンクについてもコーヒーかお茶のどちらか一方を選びます。
 * またオプションとして、サラダをつけることもできます。
 * 注文はメインディッシュ、ドリンクを各々必ず 1 つだけ含めないといけませんが、
 * サラダの有無については問いません。乗客の注文 beef, chicken, salad, coffee, tea が
 * ブール値で与えられるので、オーダーが妥当かを判定する、canProcessOrder という関数を作成してください。
 */
public class Problem16 {
    /**
     * メインディッシュとドリンクがそれぞれ1種類だけ選定されているか判定
     * @param 
     * @param
     * @param
     * @param
     * @param
     * @return 
     */
    public static boolean canProcessOrder(boolean beef, boolean chicken, boolean salad, boolean coffee, boolean tea){
        return (beef ^ chicken) && (coffee ^ tea);
    }
}
