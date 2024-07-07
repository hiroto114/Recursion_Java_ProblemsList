/*
 * Allen はすごろく型のボードゲームをやっています。そのゲームは row行 × col列 でマスが作られており、
 * どのマスを進んでも良いことになっています。しかし、動かすコマは左上からスタートし、右か下にしか動けない制約があります。
 * row行と col列 が与えられた場合、コマが進むことができるルートがいくつあるかを返す、getRoutes という関数を作成してください。
 * 
 * getRoutes(3,6) --> 21
 * getRoutes(6,3) --> 21
 * getRoutes(2,84) --> 84
 * getRoutes(1,84) --> 1
 * getRoutes(4,4) --> 20
 * getRoutes(4,6) --> 56
 * getRoutes(5,6) --> 126
 * getRoutes(10,6) --> 2002
 * 
 * 【考え方】
 * ①これを2後継数で解こうとするとJavaには便利なライブラリがないから挫折する
 * ②ほかにいい方法はないか？
 * ③→再帰だ！！！
 * 
 */
public class Problem307 {
	public static int getRoutes(int row, int col){
		if(row == 1) return 1;
		if(col == 1) return 1;

		return getRoutes(row - 1, col) + getRoutes(row, col - 1);
	}

}
