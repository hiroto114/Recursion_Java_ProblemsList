
/*
 * ブール値 p,q, r が与えられるので、以下の論理回路の出力を返す circuit3 という関数を作成してください。
 */
public class Problem507 {
    public static boolean circuit3(boolean p, boolean q, boolean r){
        return (p&&q) || !r;
    }
}
