
/**
 * Thomas は図画工作で色紙を使って飛行機を作成しています。
 * 色紙にはさまざまなサイズが用意されており、選択することができます。
 * 今、Thomas は長方形の色紙から整数値を 1 辺とする、できるだけ大きく、かつ同じ大きさの正方形を何枚も切り取ることを計画しています。
 * 長方形の大きさとして、縦 x、横 y が与えられるので、正方形の合計枚数を返す、countSquare という関数を作成してください。
 * ただし、入力 x , y はどちらも整数とします。
 * @author 0me6-
 *
 */
public class Problem44 {
    public static int countSquare(int x, int y){
        return (x/calculateLcd(x,y))*(y/calculateLcd(x,y));
    }

    // 最大公約数を求める
    public static int calculateLcd(int a, int b) {
        int c;
        for(c=Math.min(a,b);c>=1;c--){
            if(a%c==0&&b%c==0){
                break;
            }
        }
        return c;
	}
}
