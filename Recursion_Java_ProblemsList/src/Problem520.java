
public class Problem520 {
	public static boolean correctOrder(
			boolean ramen, boolean friedRice, boolean dumplings) {
		if (ramen)
			return friedRice != dumplings;
		return false;
	}
}
