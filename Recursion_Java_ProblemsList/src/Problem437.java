
import java.util.function.Predicate;
/*
 * 文字列の配列 arr が与えられるので、
 * 文字列の ASCII 値の合計値が小さい順に並び替える sortByAscii という関数を作成してください。
 * なお、言語が提供しているソート関数に、文字列の合計値を比較する関数をコールバック関数として使用してください。
 */
public class Problem437 {
	public static void main(String[] args){
		Predicate<Integer> isEven = number -> number.intValue() % 2 == 0;
		Predicate<Integer> isOdd  = number -> number.intValue() % 2 != 0;
		int[] result1 = {1,2,3,4,5};
		int[] result2 = {2,4,6,7,8};
		int[] result3 = {3,6,8,12,15};
		int[] result4 = {4,5,7,11,14};
		System.out.println(convert(isOdd,  result1));
		System.out.println(convert(isOdd,  result2));
		System.out.println(convert(isEven, result3));
		System.out.println(convert(isEven, result4));
	}

	public static boolean convert(Predicate<Integer> f, int num[]){
		int result = 0;
		for(int i:num){
			if(f.test(i)){
				result += 1;
			}
		}

		return result >= Math.ceil(num.length/2.0);
	}
}
