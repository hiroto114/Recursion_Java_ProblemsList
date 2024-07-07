/*
 * 自然数 n が与えられるので、2×1, 2×2, ..., 2×n までの総和の総和を返す、multipleOfTwoTotal という関数を作成してください。
 * 例えば、n = 3 のとき、(2×1 + 2×2 + 2×3) + (2×1 + 2×2) + (2×1) = 20 が返されます。
 */
public class Problem372 {
	public static int multipleOfTwoTotal(int n){
		if(n==0){
			return 0;
		}else if(n==1){
			return 2;
		}else{
			return multipleOfTwoTotalHelper(n)+multipleOfTwoTotal(n-1);
		}
	}

	public static int multipleOfTwoTotalHelper(int n){
		return (1+n)*n;
	}
}
