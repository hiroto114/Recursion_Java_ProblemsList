
/**
 * x-y グラフにおいて、点 A（x,y）が与えられるので、原点から点 A までの距離を返す、
 * distanceToOrigin という関数を定義してください。（x, y はともに整数）
 *
 */
public class Problem5 {
    public static double distanceToOrigin(int x, int y){
        return Math.sqrt(x*x + y*y);
    }
}
