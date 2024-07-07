/*
 * 二項係数を、連続する整数 n に対する各行に k を
 * 0 から n まで順に並べて得られる三角形状の数の並びをパスカルの三角形と呼びます。
 * パスカルの三角形において、n 段目の左から k 番目の係数を返す binomialCoefficient という関数を動的計画法を用いて作成してください。
 * 
 * binomialCoefficient(1,1) --> 1
 * binomialCoefficient(2,2) --> 1
 * binomialCoefficient(4,2) --> 6
 * binomialCoefficient(7,4) --> 35
 * 
 */
public class Problem479 {
	public static int binomialCoefficient(int n, int k) {
		return binomialCoefficientHelper(n) / binomialCoefficientHelper(k) / binomialCoefficientHelper(n - k);
	}

	public static int binomialCoefficientHelper(int n) {
		if (n <= 1)
			return 1;
		else
			return n * binomialCoefficientHelper(n - 1);
	}
}
