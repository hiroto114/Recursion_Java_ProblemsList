/*
 * 3 つの整数の引数 x、y、z を受け取り、この中で値が何個等しいか返す、countEqual という関数を作成してください。
 */
public class Problem321 {
	public static int countEqual(int x, int y, int z){

		if(x==y && y==z) return 3;
		if(x!=y && x==z) return 2;
		if(x!=y && y==z) return 2;
		if(x!=z && x==y) return 2;
		if(x!=z && z==y) return 2;
		if(y!=z && x==y) return 2;
		if(y!=z && x==z) return 2;

		return 0;
	}
}
