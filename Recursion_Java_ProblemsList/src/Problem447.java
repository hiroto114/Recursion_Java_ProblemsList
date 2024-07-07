import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/*
 * array handlers
 * 文字列をキーとし、ラムダ関数を値とする連想配列。
 * 
 * void insert(String key, callable function)
 * 関数名を表すキーと、関数を実行するラムダ関数をペアとしてデータ構造に挿入します。
 * 
 * callable retrieve(string key)
 * キー（関数名）を受け取り、ハッシュマップにペアとしてマップされたラムダ関数を返します。
 */
public class Problem447 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> pythagora = (x, y) -> {
			return (int) Math.sqrt(x * x + y * y);
		};
		BiFunction<Integer, Integer, Integer> addition = (x, y) -> {
			return x + y;
		};
		BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> {
			return x * y;
		};
		LambdaMachine lambdaMachine = new LambdaMachine();

		lambdaMachine.insert("pythagora", pythagora);
		System.out.println(lambdaMachine.retrieve("pythagora").apply(3, 4));

		lambdaMachine.insert("addition", addition);
		System.out.println(lambdaMachine.retrieve("addition").apply(2, 5));

		lambdaMachine.insert("multiplication", multiplication);
		System.out.println(lambdaMachine.retrieve("multiplication").apply(4, 10));
	}
}

class LambdaMachine {
	public int handlersPointer = 0;
	public Map<String, BiFunction<Integer, Integer, Integer>> handlers = new HashMap<String, BiFunction<Integer, Integer, Integer>>();

	public void insert(String key, BiFunction<Integer, Integer, Integer> function) {
		handlers.put(key, function);
	}

	public BiFunction<Integer, Integer, Integer> retrieve(String key) {
		return handlers.get(key);
	}


}
