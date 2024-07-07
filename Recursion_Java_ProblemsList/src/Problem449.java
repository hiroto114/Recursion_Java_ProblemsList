import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * todoCaller = todoCall(["Read a Book", "Work out", "Recursion"])
 * 
 * todoCaller() --> Read a Book
 * todoCaller() --> Work out
 * todoCaller() --> Recursion
 * todoCaller() --> All done!
 */
public class Problem449 {
	public static void main(String[] args){
		Function<List<String>,Supplier<String>> todoCall = (list) ->{
			Supplier<String> f = () -> {
				if(list.size() == 0) return "All done!";
				String res = list.get(0);
				list.remove(0);
				return res;
			};
			return f;
		};

		List<String> todo = new ArrayList<String>();
		todo.add("Read a Book");
		todo.add("Work out");
		todo.add("Recursion");

		Supplier<String> todoCaller = todoCall.apply(todo);
		System.out.println(todoCaller.get());
		System.out.println(todoCaller.get());
		System.out.println(todoCaller.get());
		System.out.println(todoCaller.get());

	}
}

