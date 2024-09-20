
import java.util.function.Function;

public class Problem433 {
	public static void main(String[] args){
		Function<Integer, Function<String,Function<String,String>>> greet = (hour) -> (name) -> (speakingWay) -> {

			StringBuilder result = new StringBuilder("");
			if(hour >= 0 && 12 > hour){
				result.append("Good Morning ");
			}else if(hour >= 12 && 18 > hour){
				result.append("Good Afternoon ");
			}else{
				result.append("Good Evening ");
			}

			if("loud".equals(speakingWay)){
				result.append(name.toUpperCase());
			}else if("quiet".equals(speakingWay)){
				result.append(name.toLowerCase());
			}else if("reverse".equals(speakingWay)){
				result.append((new StringBuilder(name)).reverse());
			}else{
				result.append(name+" "+name);
			}

			return result.toString();
		};

		System.out.println(greet.apply(1).apply("John").apply("loud"));
		System.out.println(greet.apply(2).apply("John").apply("quiet"));
		System.out.println(greet.apply(13).apply("John").apply("reverse"));
		System.out.println(greet.apply(19).apply("John").apply("repeat"));
		System.out.println(greet.apply(13).apply("Leslie Emmanuel Beadon").apply("loud"));
		System.out.println(greet.apply(19).apply("Leslie Emmanuel Beadon").apply("quiet"));
		System.out.println(greet.apply(5).apply("Leslie Emmanuel Beadon").apply("reverse"));
		System.out.println(greet.apply(1).apply("Leslie Emmanuel Beadon").apply("repeat"));

	}
}
