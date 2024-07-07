import java.util.Arrays;
import java.util.Comparator;

/*
 * 文字列の配列 arr が与えられるので、
 * 文字列の ASCII 値の合計値が小さい順に並び替える sortByAscii という関数を作成してください。
 * なお、言語が提供しているソート関数に、文字列の合計値を比較する関数をコールバック関数として使用してください。
 */
public class Problem438 {
	public static String[] sortByAscii(String[] arrs){

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				for(String arr:arrs){
					System.out.print(arr+" ");
				}
				System.out.println();
				return sortByAsciiHelper(o1).compareTo(sortByAsciiHelper(o2));
			}
		};

		Arrays.sort(arrs,comparator);
		return arrs;
	}

	public static Integer sortByAsciiHelper(String input){
		Integer result = 0;
		for(int i=0;i<input.length();i++){
			result += input.charAt(i);
		}
		return result;

	}
}
