/*
 * n × m の四角形の中に、2^i× 2^i（i≥0）のタイルを敷き詰めていくことを考えています。
 * 自然数 n、m が与えられるので、最も少ないタイルの数を返す、minTiles という関数を再帰を使って作成してください。
 * 
 * minTiles(10,5) --> 14
 * minTiles(100,7) --> 175
 * minTiles(55,9) --> 75
 * minTiles(73,8) --> 17
 * minTiles(3,4) --> 6
 * minTiles(10,10) --> 10
 * 
 */
public class Problem231 {
	public static int minTiles(int n, int m){
		if(n == 0 || m == 0) return 0;
		int minNm = Math.min(n, m);
		int i=0;
		for(int p=0;;p++){
			if(Math.pow(2,p) > minNm){
				i = (int) Math.pow(2,p-1);
				break;
			}
		}

		int result = 0;
		result += (n/i) * (m/i);
		if(n % i != 0){
			result += minTiles(n%i, m-m%i);
		} 
		if(m % i != 0){
			result += minTiles(n, m%i);
		}
		return result;
	}
}
