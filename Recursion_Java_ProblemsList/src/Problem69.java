/*
 * Stern は点 A、B、C が 3 つ書かれている黒板を発見しました。
 * そこには「自信があったら ∠ABC を求めてください」と書いてあったため、Stern は挑戦することにしました。
 * x-y 平面上の点A（x1,y1）、点B（x2,y2）、点C（x3,y3）が配列として与えられるので、
 * ∠ABC を返す、angleB という関数を作成してください。角度の小数点以下は全て切り捨ててください。
 */
public class Problem69 {
    public static int angleB(int[] a, int[] b, int[] c){
        double abSquare = Math.pow(a[0]-b[0],2) + Math.pow(a[1]-b[1],2);
        double bcSquare = Math.pow(b[0]-c[0],2) + Math.pow(b[1]-c[1],2);
        double caSquare = Math.pow(c[0]-a[0],2) + Math.pow(c[1]-a[1],2);

        // Math.acosでcosの値のラジアンを出せるかんじ
        // →Math.toDegreesでラジアンに対する角度を出す
        return (int)Math.toDegrees(Math.acos((abSquare-caSquare+bcSquare)/(2*Math.sqrt(abSquare*bcSquare))));

    }
}
