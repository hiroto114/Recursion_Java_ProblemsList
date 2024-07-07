import java.util.function.BiFunction;
import java.util.function.Function;

public class Problem457 {
	public static void main(String[] args) {
		String[] arr = new String[] { "h", "E", "L", "L", "O" };
		Function<String[], String> f1 = capitalizeDecorator.apply(toString);
		Function<String[], String> f2 = lowercaseResultDecorator.apply(toString);
		BiFunction<String, String, String> f3 = printInfoDecorator.apply(concat);
		System.out.println(f1.apply(arr));
		System.out.println(f2.apply(arr));
		System.out.println(f3.apply(f1.apply(arr), f2.apply(arr)));
	}

	public static Function<String[], String> toString = arr -> {
		return String.join("", arr);
	};

	public static BiFunction<String, String, String> concat = (s1, s2) -> {
		return s1 + s2;
	};

	public static Function<Function<String[], String>, Function<String[], String>> capitalizeDecorator = f -> arr -> {
		String[] arrCloned = arr.clone();
		arrCloned[0] = arrCloned[0].toUpperCase();
		return f.apply(arrCloned);
	};

	//このデコレータは関数 f を受け取り、新しいラムダ関数を返します。
	//このラムダ関数は、関数 f の結果を受け取り、
	//その結果を全て小文字（例："HELLO" が "hello" になる）に変換して返します。
	public static Function<Function<String[], String>, Function<String[], String>> lowercaseResultDecorator = f -> arr -> {
		return f.apply(arr).toLowerCase();
	};

	// このデコレータは関数 f を受け取り、新しいラムダ関数を返します。
	// このラムダ関数は、2 つの引数を受け取り（例："HELLO" と "hello"）、
	// それらを関数 f で連結し、加えて連結前の引数を情報（例：f("HELLO", "hello") の結果は 
	//"HELLO + hello = HELLOhello" になる）に変換して返します。
	public static Function<BiFunction<String, String, String>, BiFunction<String, String, String>> printInfoDecorator = f -> (
			input1, input2) -> {
		return input1 + " + " + input2 + " = " + f.apply(input1, input2);
	};
}
