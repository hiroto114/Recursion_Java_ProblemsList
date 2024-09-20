
/*
 * Sock は、自然数 n を受け取り、フィボナッチ数列の n 項目の数を返す関数をキャッシュを用いて実装しました。
 */
public class Problem528 {
	// 問題文中で指定がない場合、テスト対象の関数は修正する必要はありません。
	public static long fibonacci(int n) {
		long[] cache = new long[n + 1];
		cache[0] = 0;
		cache[1] = 1;

		for (int i = 2; i <= n; i++) {
			cache[i] = cache[i - 1] + cache[i - 2];
		}

		return cache[n];
	}

	// テストで使用する関数です。変更の必要はありません。
	public static void unitTestCheck(boolean predicate) {
		if (predicate) System.out.println("The test passed!!");
		else System.out.println("ERROR! The test failed!!");
	}

	// unitTests()が実行され、テストの結果がチェックされます。、
	public static void unitTests() {
		// ① 問題文にある一つ目のテストケースを記述しましょう。
		unitTestCheck(fibonacci(3) == 2);
		unitTestCheck(fibonacci(4) == 3);
		unitTestCheck(fibonacci(6) == 8);
		unitTestCheck(fibonacci(9) == 34);
		unitTestCheck(fibonacci(10) == 55);

	}
}
