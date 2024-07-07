import java.util.Arrays;

/*
 * 自然数 n を受け取り、エラトステネスの篩と呼ばれるアルゴリズムによって
 * 整数 n 未満の全ての素数を配列に格納し、最終的に素数の個数を返す primesUpToNCount 関数
 */
public class Problem527 {
	public static int primesUpToNCount(int n) {
		boolean[] cache = new boolean[n];
		Arrays.fill(cache, true);

		for (int i = 2; i < Math.sqrt(n); i++) {
			//if (!cache[i]) continue;
			int p = 2;
			while (i * p < n) {
				cache[i * p] = false;
				p++;
			}
		}

		int primeCount = 0;
		for (int i = 2; i < cache.length; i++) {
			if (cache[i])
				primeCount += 1;
		}

		return primeCount;
	}

	public static void main(String[] args) throws Exception {
		//System.out.println(primesUpToNCount(2));
		Assertion.run(primesUpToNCount(2) == 0);
		Assertion.run(primesUpToNCount(3) == 1);
		Assertion.run(primesUpToNCount(5) == 2);
		Assertion.run(primesUpToNCount(10) == 4);
		Assertion.run(primesUpToNCount(19) == 7);
		Assertion.run(primesUpToNCount(25) == 9);
		Assertion.run(primesUpToNCount(1000) == 168);
	}
}
