
/*
 * パティシエの Bailey は直径の異なる 3 つの丸いケーキを重ねてウェディングケーキを作っています。
 * ケーキは下から直径が大きい順に並べ、同じ大きさのケーキを重ねることはできません。
 * 3 つのケーキのサイズが与えられるので、ウエディングケーキが作れるかどうかを返す canMakeWeddingCake という関数を定義してください。
 */
public class Problem500 {
    public static boolean canMakeWeddingCake(int[] cakes){
        return cakes[0] != cakes[1] && cakes[0] != cakes[2] && cakes[1] != cakes[2];

    }
}
