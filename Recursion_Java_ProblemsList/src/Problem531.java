import java.util.ArrayList;
import java.util.stream.IntStream;

public class Problem531 {
	public static ArrayList<ArrayList<Integer>> getDivisorCombinationList(int n) {
		ArrayList<ArrayList<Integer>> divisor = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i <= Math.ceil(Math.sqrt(n)); i++) {
			ArrayList<Integer> combination = new ArrayList<>();
			if (n % i != 0) continue;
			combination.add(i);
			combination.add(n / i);
			divisor.add(combination);
		}
		return divisor;
	}

	public static boolean divisorCheck(int k, int num) {
		// getDivisorCombinationList関数の整合性をチェックしてください
		return getDivisorCombinationList(num).size() == k;
	}

	public static void unitTestCheck(boolean predicate) {
		if (predicate) System.out.println("The test passed!!");
		else System.out.println("ERROR! The test failed!!");
	}

	public static void unitTests(int[] inputs, int[] outputs) {
		// ここから書いてください
		IntStream.range(0, inputs.length).forEach(i -> unitTestCheck(divisorCheck(inputs[i], outputs[i])));
	}
}
