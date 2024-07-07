import java.util.ArrayList;
import java.util.List;

/*
 * 今 N 人の囚人が異なる大きさの箱を抱えており、箱の中には水が満タンに含まれています。
 * 配列 arr の各要素は各囚人が所有する水の分量を示しています。囚人は 1 列に並んでおり、
 * 一定時間 T ごとに列の先頭の囚人が水をバケツに移し替える作業を行っています（バケツは T 秒ごとに空になります）。
 * しかし、バケツの大きさは決まっているため、バケツ以上の分量の水を持つ囚人は、バケツ満タンに水を移し替えた後、
 * 移しきれなかった水を持って列の後ろにもう一度並ぶ必要があります。手持ちの水が無くなった囚人から順に抜けていき、全員の手持ちがゼロになるまでこのプロセスを繰り返します。
 * 
 * 各囚人の水の量 arr とバケツの分量 num が与えられるので、抜けた囚人の番号を順に並べた配列を返す、arrayQueue という関数を作成してください。バケツには必ず水が含まれているとします。
 * 例えば、arr が [3,8,5] で、num が 4 のときを考えてみましょう。配列 [3,8,5] には 1,2,3 の番号が振られており、求める配列を newArr とします。
 * 
 * T 秒後: arr = [8,5]、newArr = [1]（囚人 1 が新しい配列に追加されます）
 * 2T 秒後: arr = [5,4]、newArr = [1]
 * 3T 秒後: arr = [4,1]、newArr = [1]
 * 4T 秒後: arr = [1]、newArr = [1,2]（囚人 2 が新しい配列に追加されます）
 * 5T 秒後: arr = []、newArr = [1,2,3]（最後に囚人 3 が新しい配列に追加されます。）
 * したがって、求める配列は [1,2,3] になります。
 * 
 * arrayQueue([3,8,5],4) --> [1,2,3]
 * arrayQueue([2,7,4],3) --> [1,3,2]
 * arrayQueue([9,10,4,7,2],6) --> [3,5,1,2,4]
 * arrayQueue([4,9,7,4,5],3) --> [1,4,5,2,3]
 * arrayQueue([18,8,10,20,14,11,9,21],4) --> [2,3,6,7,5,1,4,8]
 * arrayQueue([803,884,455,343,826,261,723,580,621,464,263],94) --> [6,11,4,3,10,8,9,7,1,5,2]
 * arrayQueue([977,546,851,540,506,716,309,352,783,413,810,777,109,458,295,806,735,187,811,530,254],405) --> [7,8,13,15,18,21,2,4,5,6,9,10,11,12,14,16,17,20,1,3,19]
 * 
 */
public class Problem263 {
	public static int[] arrayQueue(int[] arr, int num){
		List<Integer> result = new ArrayList<Integer>();
		int arrIndex = 0;
		int arrLength = arr.length;
		while(result.size() != arrLength){
			if(arrIndex == arr.length) arrIndex = 0;
			if(arr[arrIndex] == 0){
				arrIndex += 1;
				continue;
			}
			if(arr[arrIndex] <= num){
				result.add(arrIndex + 1);
				arr[arrIndex] = 0;
				arrIndex += 1;
				continue;
			}
			if(arr[arrIndex] > num){
				arr[arrIndex] -= num;
				arrIndex += 1;
				continue;
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
