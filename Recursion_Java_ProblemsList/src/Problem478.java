import java.util.HashMap;
import java.util.Map;

public class Problem478 {
	public static void main(String[] args) {
		Map<String, Integer> priceTable = new HashMap<>();
		priceTable.put("Honda Civic", 24000);
		priceTable.put("Chevrolet Traverse", 30000);
		priceTable.put("Toyota Camry", 25000);
		priceTable.put("Subaru Outback	", 27000);
		priceTable.put("Tesla X", 100000);

		System.out.println(priceTable.get("Tesla X"));
		System.out.println(priceTable.get("Toyota Camry"));
		System.out.println(priceTable.get("Chevrolet Traverse"));
	}
}
