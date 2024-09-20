
/*
 * ブール値 p,q が与えられるので、以下の論理回路の出力を返す circuit2 という関数を作成してください。
 */
public class Problem506 {
    public static boolean circuit2(boolean p, boolean q){
        return (p && q) || (!q);
    }
}
