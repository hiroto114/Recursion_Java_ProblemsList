import java.util.Arrays;

/*
 * 自然数で構成される配列が与えられるので、配列内で合計値が等しくなるように 2 つのセットに分割することができるかどうか判定する、
 * hasEqual という関数を作成してください。
 * 例えば、[8,6,4,12,4,2] は、[8,6,4] と [12,4,2]、もしくは [6,12] と [8,4,4,2] へ分割することができ、true を返します。一方、[3,4,6,10] ではそのような組み合わせは存在しないので、false を返します。
 * 
 * hasEqual([1,3,4,10]) --> false
 * hasEqual([1,5,7,1]) --> true
 * hasEqual([9,17,10,13,7,12,16,4]) --> true
 * hasEqual([10,13,7,17,9,28]) --> false
 * hasEqual([8,6,4,12,4,2]) --> true
 * hasEqual([8,6,4,13,4,2]) --> false
 * hasEqual([2,1,2,1]) --> true
 * hasEqual([10,9,38,8,5,4,16]) --> false
 * hasEqual([5,12,3,10,8]) --> false
 * 
 */
public class Problem306 {
	// 動的計画法で攻める
	public static boolean hasEqual(int[] ints){
		if(ints.length <= 1) return false;
		if(ints.length == 2) return ints[0] == ints[1];
		if(Arrays.stream(ints).sum()%2==1) return false;
		boolean[] helper = new boolean[Arrays.stream(ints).sum()/2+1];
		Arrays.fill(helper, false);
		for(int i:ints){
			if(i > helper.length-1) continue;
			for(int p = helper.length-1;p>=1;p--){
				if(helper[p] == true && p + i <= helper.length-1){
					helper[p+i] = true;
				}
			} 
			helper[i] = true;
		}
		return helper[helper.length-1] == true;
	}
}
