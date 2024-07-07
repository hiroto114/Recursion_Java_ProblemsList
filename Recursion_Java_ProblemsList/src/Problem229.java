/*
 * Smith は再帰的なプログラムを作成しました。
 * このプログラムでは、最初の行には 0 を書き、
 * それ以降の各行では前の行を見て、各 0 を 01 に、各 1 を 10 に置き換えます。
 * 行を表す n と、文字の位置を表す k（>0）が与えられるので、n 行目にある、k 番目の記号を返す、kthElement という関数を再帰を使って作成してください。
 * 例えば、1 行目は 0、2 行目は 01、3 行目は 0110、4 行目は 01101001 のようになります。
 * 
 * kthElement(4,5) --> 1
 * kthElement(2,1) --> 0
 * kthElement(2,2) --> 1
 * kthElement(4,6) --> 0
 * kthElement(5,8) --> 1
 * kthElement(7,31) --> 0
 * kthElement(9,47) --> 0
 * kthElement(9,102) --> 0
 * 
 */
public class Problem229 {
	public static int kthElement(int n, int k){
		if(n==1) return 0;
		if(n==2 && k == 1) return 0;
		if(n==2 && k == 2) return 1;

		if(k%2 == 0) return kthElement(n-1,k/2) == 1 ? 0 : 1 ;
		return kthElement(n-1,k/2+1)==1 ? 1 : 0 ;   
	}
}
