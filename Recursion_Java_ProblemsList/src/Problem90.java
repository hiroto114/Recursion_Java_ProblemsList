
import java.util.ArrayList;
/*
 * 整数 x と累乗 m が与えられるので、m 乗の数字を足し合わせたら x になる組み合わせの数を返す、combinationsOfSum という関数を定義してください。
 * combinationsOfSum(1,1) --> 1
 * combinationsOfSum(2,1) --> 1
 * combinationsOfSum(4,1) --> 2
 * combinationsOfSum(10,2) --> 1
 * combinationsOfSum(100,2) --> 3
 * combinationsOfSum(50,2) --> 3
 * combinationsOfSum(270,2) --> 28
 * combinationsOfSum(270,3) --> 0
 * combinationsOfSum(400,2) --> 55
 * combinationsOfSum(1000,2) --> 1269
 * combinationsOfSum(243,3) --> 1
 * combinationsOfSum(5000,4) --> 0
 * combinationsOfSum(255,2) --> 23
 * combinationsOfSum(320,2) --> 25
 * combinationsOfSum(90,1) --> 189586
 */
public class Problem90 {
	public static int combinationsOfSum(int x,int m){
		//2乗したものを足し合わせてxになるなら、最大値はx**1/2のはず
		//2乗した数字の配列を作る
		//その中からの部分配列組み合わせ

		int n = (int)Math.floor(Math.pow(x, 1.0/m));
		System.out.println(n);
		ArrayList<Integer> intArr = new ArrayList<>();
		for(int i=1; i<=n; i++){
			intArr.add((int)Math.pow(i,m));
		}
		System.out.println(intArr);
		return combinationsOfSumHelper(x, intArr);
	}
	// ここ動的計画法でどうやっているのかもっと具体的に書いたほうがいいな、、
	// 時間たって忘れてしまっとる。
	// また2次元配列を使うとイメージしづらいんで、一次元配列を使って書こう。うまい書き方あったわ。
	/*
	 * ①0,1,2,3,,,,,,xまでをインデックスとする配列を作ります
	 * ②自然数のm乗の組み合わせの和でxまで行こうとする→yのm乗のyについては高々xの1/m乗以下
	 * ③①と②を考えると、、、、次になる。
	 * ④1のm乗の値をインデックスとする位置のcache値を1にします
	 * ⑤2のm乗の値についてはcacheを右側から左側に操作していって、cache値が性になっているものがあったら
	 * そのインデックス＋2のm乗のインデックスのcache値にcache値が性になっているものの値を加えます
	 * ⑥そもそも2のm乗の値のインデックスについてはcache値に1を加えます
	 * ⑦上記①～⑥を繰り返します
	 * ⑧cacheの一番最後の値が答えです
	 */
	public static int combinationsOfSumHelper(int x, ArrayList<Integer> intArr){
		// 初期化[配列の長さ+1][target+1]
		int len = intArr.size();
		int[][]dp = new int[len + 1][x + 1];
		dp[0][0] = 1;

		// 動的計画法百ます計算みたいに
		for(int i=0; i<len; i++){
			for(int j=0; j<x+1; j++){
				if(intArr.get(i) <= j) dp[i + 1][j] = dp[i][j - intArr.get(i)] + dp[i][j];
				else dp[i +1][j] = dp[i][j];
			}
		} 
		return dp[len][x];
	}

}
