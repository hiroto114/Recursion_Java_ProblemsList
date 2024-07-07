import java.util.Set;
import java.util.TreeSet;

public class Problem502 {
	public static String[] twoLetterNames(String[] nameList) {
		Set<String> set = new TreeSet<>();
		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].length() == 2) {
				set.add(nameList[i]);
			}

		}

		String[] result = new String[set.size()];
		set.toArray(result);
		return result;

	}
}
