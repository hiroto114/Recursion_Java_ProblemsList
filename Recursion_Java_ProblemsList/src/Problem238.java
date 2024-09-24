/*
 * 以下のように文字がマッピングされています。
A : 1
B : 2
...
Z : 26
このとき、自然数 n が与えられるので、自然数を分割してデコードした文字列の数を返す decodeInteger という関数を作成してください。

例えば、123 の場合、ABC（1 2 3）、LC（12 3）、AW（1 23）の 3 通りが存在します。34123 の場合、CDABC（3 4 1 2 3）、CDLC（3 4 12 3）、CDAW（3 4 1 23）の 3 通りが存在します。

decodeInteger(123) --> 3
decodeInteger(226) --> 3
decodeInteger(34123) --> 3
decodeInteger(262626) --> 8
decodeInteger(11223) --> 8
decodeInteger(12111) --> 8
decodeInteger(0) --> 0
decodeInteger(2391224) --> 10
decodeInteger(111111) --> 13
 */
public class Problem238 {
	public static int decodeInteger(int n){
		if(n == 0) return 0;
		if(n >= 1 && n <= 9) return 1;
		if(n == 10) return 1;
		if(n >= 11 && n <= 19) return 2;
		if(n == 20) return 1;
		if(n >= 21 && n <= 26) return 2;

		int result = 0;
		// 123を1,2,3と12,3に分割する処理によるもの。
		if(n%10 >= 1 && n%10 <= 9)     result += decodeInteger(n/10);
		// 123を1,23に分割する処理によるもの。
		if(n%100 >= 10 && n%100 <= 26) result += decodeInteger(n/100);

		return result;
	}
}
