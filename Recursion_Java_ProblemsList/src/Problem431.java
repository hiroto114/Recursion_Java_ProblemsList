
import java.util.function.IntConsumer;

/*
 * void getWeightOnEarth(int weight)
 * 質量を受け取ると、地球上での重さを出力するラムダ関数。
 * 
 * void getWeightOnMars(int weight)
 * 質量を受け取ると、火星上での重さを出力するラムダ関数。
 * 
 * void getWeightOnJupiter(int weight)
 * 質量を受け取ると、木星上での重さを出力するラムダ関数。
 * 
 */
public class Problem431 {
	public static void main(String[] args){
		IntConsumer getWeightOnEarth = number -> {
			System.out.println("The weight on Earth is "+(int)Math.floor(number*9.8));
		};
		IntConsumer getWeightOnMars = number -> {
			System.out.println("The weight on Mars is "+(int)Math.floor(number*3.7));
		};
		IntConsumer getWeightOnJupiter = number -> {
			System.out.println("The weight on Jupiter is "+(int)Math.floor((int)number*24.8));
		};
		convert(getWeightOnEarth, 50);
		convert(getWeightOnMars, 70);
		convert(getWeightOnJupiter, 90);
	}

	public static void convert(IntConsumer f, int number){
		f.accept(number);
	}
}
