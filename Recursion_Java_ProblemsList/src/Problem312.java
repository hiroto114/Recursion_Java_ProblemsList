import java.util.ArrayList;
import java.util.List;

/*
 * Haven は宝くじの責任者で、当選番号を決めなければなりません。
 * そこで、ランダムに 2 つの値を出し、その間の連番かつ単調増加となる数値を当選番号にすることにしました。
 * 2 つの数値 n1, n2 が与えられるので、条件を満たす数値を配列で返す、chooseWinningNumber という関数を作成してください。
 * 
 * chooseWinningNumber(110,450) --> [123,234,345]
 * chooseWinningNumber(1100,18000) --> [1234,2345,3456,4567,5678,6789,12345]
 * chooseWinningNumber(47,135) --> [56,67,78,89,123]
 * chooseWinningNumber(123,1874) --> [123,234,345,456,567,678,789,1234]
 * chooseWinningNumber(65,123) --> [67,78,89,123]
 * chooseWinningNumber(24,31) --> []
 * chooseWinningNumber(450,110) --> [123,234,345]
 * 
 */
public class Problem312 {
	public static int[] chooseWinningNumber(int n1, int n2){
		List<Integer> result = new ArrayList<Integer>();
		for(int i = Math.min(n1,n2); i<=Math.max(n1,n2); i++){
			if(judgeWinningNumber(i)) result.add(i);
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	public static boolean judgeWinningNumber(int n1){
		String stN1 = String.valueOf(n1);
		for(int i=0;i<stN1.length()-1;i++){
			if(Integer.parseInt(stN1.substring(i,i+1)) + 1 != Integer.parseInt(stN1.substring(i+1,i+2))){
				return false;
			}
		}

		return true;
	}
}
