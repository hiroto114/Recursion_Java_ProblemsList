/*
 * ブール値 p,q が与えられるので、以下の論理回路の出力を返す circuit4 という関数を作成してください。
 */
public class Problem508 {
    public static boolean circuit4(boolean p, boolean q){
        return (p && q) || (!p && !q);
    }
}
