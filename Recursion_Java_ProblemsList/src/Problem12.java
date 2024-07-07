/**
 * boolean p とboolean q を使って、以下の図で示されるド・モルガンの定理を証明する、
 * testDemorganLaw という関数を作成してください。
 * @author 0me6-
 *
 */
public class Problem12 {
    public static boolean testDemorganLaw(boolean p, boolean q){
        return !(p&&q) == !p || !q;
    }
}
