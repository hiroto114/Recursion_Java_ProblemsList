import java.util.ArrayList;

/*
 * Christine はすごろくをしています。このすごろくは全てのマスに数字が書いてあり、
 * その数字分左右にコマを動かして 0 のマスに止まれば勝利というルールでした。
 * プレーヤーはコマを初めに置く位置を決めることができますが、位置によってはゴールが絶対にできないこともあります。
 * 数字が書いてあるマスを示した配列 spaces とスタートの位置 start が与えられたとき、
 * 値 0 のマスに到達できるかどうかを確認する、canGoal という関数を作成してください。
 * 
 * 例えば、[3,2,0,1,3],0 が与えられたとき、0マス目:+3 -> 3マス目:+1 -> 2マス目:0 となり、true を返します。
 * 
 * canGoal([0],0) --> true
 * canGoal([3,2,0,1,3],0) --> true
 * canGoal([2,3,0,1,3],1) --> false
 * canGoal([5,3,4,0,3,2,3],0) --> true
 * canGoal([5,3,4,0,3,4,3],5) --> false
 * 
 */
public class Problem310 {
	// 再帰で解こう
	public static boolean canGoal(int[] spaces, int start){
		if(start < 0 || start > spaces.length - 1) return false;
		ArrayList<Integer> result = new ArrayList<Integer>();
		return canGoalHelper(spaces, start, result);
	}
	public static boolean canGoalHelper(int[] spaces, int start, ArrayList<Integer> reached){
		// ベースケース
		if(start < 0 || start > spaces.length - 1) return false;
		if(spaces[start] == 0) return true;
		if(start + spaces[start] > spaces.length - 1 && start - spaces[start] < 0) return false;
		if(reached.contains(start)) return false;
		reached.add(start);
		return canGoalHelper(spaces, spaces[start] + start, reached) || canGoalHelper(spaces, start - spaces[start], reached);
	}
}
