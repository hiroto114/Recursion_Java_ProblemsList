/*
 * zeckendorf はどんな値でもフィボナッチ数の和で表せることに気づきました。
 * 整数 m が与えられるので、フィボナッチ数列の任意の値の和が m に等しくなるような最小の個数を返す、zeckendorf という関数を作成してください。
 * 
 * 例えば、入力が 20 の場合、フィボナッチ数列の中で使える値は、0, 1, 1, 2, 3, 5, 8, 13 になります。2 + 5 + 13 = 20 が個数を最小にできる計算になるため、答えは 3 になります。
 * 
 * zeckendorf(9) --> 2
 * zeckendorf(11) --> 2
 * zeckendorf(20) --> 3
 * zeckendorf(579) --> 4
 * zeckendorf(1095) --> 5
 * 
 */
public class Problem286 {
	public static int zeckendorf(int m){
		return printFibRepresntation(m); 
	}

	public static int printFibRepresntation(int n) { 
		int count = 0;
		while (n > 0) { 
			int f = nearestSmallerEqFib(n); 

			n = n - f; 
			count += 1;
		} 
		return count;
	} 

	public static int nearestSmallerEqFib(int n) { 
		if (n == 0 || n == 1) 
			return n; 

		int f1 = 0, f2 = 1, f3 = 1; 
		while (f3 <= n) { 
			f1 = f2; 
			f2 = f3; 
			f3 = f1 + f2; 
		} 
		return f2; 
	} 
}
