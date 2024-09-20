import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Problem448 {
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
		LambdaMachine1 lambdaMachine = new LambdaMachine1();

		lambdaMachine.insert("pythagora", pythagora);
		lambdaMachine.insert("addition", addition);
		lambdaMachine.insert("multiplication", multiplication);

		System.out.println(lambdaMachine.roundRobinRetrieve().apply(6, 8));
		System.out.println(lambdaMachine.roundRobinRetrieve().apply(6, 8));
		System.out.println(lambdaMachine.roundRobinRetrieve().apply(6, 8));
		System.out.println(lambdaMachine.roundRobinRetrieve().apply(6, 8));
	}
}

class LambdaMachine1 {
	public List<BiFunction<Integer, Integer, Integer>> handlers = new ArrayList<BiFunction<Integer, Integer, Integer>>();
	public int handlersPointer = 0;

	public void insert(String key, BiFunction<Integer, Integer, Integer> function) {
		handlers.add(function);
	}

	public BiFunction<Integer, Integer, Integer> roundRobinRetrieve() {
		return handlers.get(handlersPointer++ % handlers.size());
	}
}