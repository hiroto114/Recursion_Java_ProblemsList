/*
 * Reagan は計算機アプリを作成しており、累乗を行う機能を追加しています。
 * この機能に拡張性をつけるために、再帰で累乗の処理を行う予定です。
 * 整数 x と整数 n が与えられるので、再帰を使って x^nを返す、powerXOfN という関数を作成してください。
 * ただし、言語による float 型の誤差をなくすために、最後の出力時に小数第 2 位以降を切り捨ててください。
 */
public class Problem226 {
    public static double powerXOfN(double x, int n){
        // xのn乗を計算＋少数第2位以降を切り捨て
        return Math.floor(Math.pow(x,n)*10)/10;
    }
}
