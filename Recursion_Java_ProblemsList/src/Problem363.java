/*
 * 自然数 n, k が与えられるので、n が k で何回割り切れるか返す、countDivisibleByK という関数を作成してください。
 * 例えば、28 は 2 で割ると 14、14 を 2 で割ると 7 なので、2 で割った回数 2 を返します。ただし、k は 2 以上とします。
 * 
 * countDivisibleByK(3,2) --> 0
 * countDivisibleByK(30,5) --> 1
 * countDivisibleByK(10,2) --> 1
 * countDivisibleByK(24,2) --> 3
 * countDivisibleByK(243,3) --> 5
 * countDivisibleByK(1024,2) --> 10
 * countDivisibleByK(1048576,2) --> 20
 */
public class Problem363 {
	public static int countDivisibleByK(int n, int k){
		int result = 0;
		while(n%k==0){
			result += 1;
			n = n/k;
		}

		return result;
	}
}
