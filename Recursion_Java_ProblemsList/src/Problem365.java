/*
 * 自然数 x, y, z が与えられるので、x, y, z の最大公約数を返す、threeGCD という関数を作成してください。
 */
public class Problem365 {
	public static int threeGCD(int x, int y, int z){
		return euclidean(euclidean(x,y),z);
	}
	public static int euclidean(int num1, int num2){
		int a = num1;
		int b = num2;

		while (b != 0){
			int m = a % b;
			a = b;
			b = m;
		}

		return a;
	}

}
