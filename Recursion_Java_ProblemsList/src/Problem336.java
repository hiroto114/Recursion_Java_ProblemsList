/*
 * 32 ビットの符号なし整数型のすべてのビットが反転したときの値を調査しています。
 * 入力された値に対し、すべてのビットが反転したときの値を返す flipBits という関数を作成してください。
 */
public class Problem336 {
    public static long flipBits(int number){
        long calculateHelper = 4294967295L;
        return calculateHelper^number;
    }
}
