
import java.util.HashMap;
import java.util.function.Function;

/*
 * 日本円を他の国の通貨に変換するツールを作成しています。
 * このツールは convertJPYtoForeignCurrency という関数を通じて実装され、
 * その関数は特定の通貨単位を引数として受け取り、日本円からその通貨への変換を行うクロージャを返します。
 * 
 * クロージャは通常の関数と異なり、それが定義されたスコープにある変数を覚えており、
 * そのスコープが消えた後でもそれら変数にアクセスできる特性を持っています。
 * クロージャを使用することで、グローバルスコープに変数を露出させることなく、
 * 必要なデータ（通貨単位と換算率）を関数内にカプセル化し、再利用性とコードの安全性を高めます。
 * 
 * 他の通貨への換算は、以下を使用してください。また、小数点以下切り捨てで計算してください。
 * "USD": 135
 * "EUR": 150
 * "GBP": 170
 */
public class Problem450 {
	public static void main(String[] args) {
		HashMap<String, Integer> rate = new HashMap<>();
		rate.put("USD", 135);
		rate.put("EUR", 150);
		rate.put("GBP", 170);

		Function<String, Function<Integer, String>> convertJPYtoForeignCurrency = unit -> {
			Function<Integer, String> f = yen -> {
				int money = (int) (yen / rate.get(unit));
				return "JPY: " + yen + " => " + unit + ": " + money;
			};
			return f;
		};

		Function<Integer, String> doller = convertJPYtoForeignCurrency.apply("USD");
		System.out.println(doller.apply(10000));

		Function<Integer, String> euro = convertJPYtoForeignCurrency.apply("EUR");
		System.out.println(euro.apply(10000));

		Function<Integer, String> pound = convertJPYtoForeignCurrency.apply("GBP");
		System.out.println(pound.apply(10000));
	}

	Function<String, Function<String, Integer>> fc2 = unit1 -> {
		Function<String, Integer> f = unit2 -> {
			return Integer.parseInt(unit2);
		};
		return f;
	};
}
