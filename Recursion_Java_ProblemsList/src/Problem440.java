
import java.util.ArrayList;
import java.util.List;

/*
 * 自然数によって構成される配列 ages が与えられるので、
 * filter 関数を活用して 18 歳以上のみで構成される配列を返す ageCheck という関数を作成してください。
 */
public class Problem440 {
	public static int[] ageCheck(int[] ages){
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<ages.length;i++){
			if(ages[i]>=18){
				list.add(ages[i]);
			}
		}

		int[] array = new int[list.size()];
		for(int i=0;i<list.size();i++){
			array[i] = list.get(i);
		}

		return array;
	}
}
