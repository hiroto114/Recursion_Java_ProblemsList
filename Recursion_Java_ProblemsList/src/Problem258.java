import java.util.ArrayList;
import java.util.List;

/*
 * 整数によって構成される配列 intArr と、整数 sumInt が与えられるので、配列の中の 2 つの要素を足して
 * sumInt に一致するインデックスを返す、twoSum という関数を作成してください。
 * 組み合わせが複数存在する場合は、値の小さいインデックスを優先してください。
 * また、組み合わせが存在しない場合は、空の配列を返してください。
 * 
 * twoSum([1,2,3,4],5) --> [0,3]
 * twoSum([1,1],2) --> [0,1]
 * twoSum([1,1],5) --> []
 * twoSum([1,2,3],4) --> [0,2]
 * twoSum([3,10,11,15],14) --> [0,2]
 * twoSum([375,406,515,406,207,293,923,94,862,329,767,785,364],1114) --> [9,11]
 * twoSum([574,11,955,912,933,105,993,61,678,4,618,916,866,25,313,840,699,653,141,748,464,816,512,461,123],1664) --> [11,19]
 * twoSum([444,73,978,616,585,298,548,632,390,970,822,839,71,541,362,697,134,580,692,227,191,395],1136) --> [0,18]
 * twoSum([468,883,524,54,892,447,326,536,189,214,450],540) --> [6,9]
 * twoSum([747,34,628,747,214,334,808,866,71,547],1022) --> [4,6]
 * twoSum([214,666,347,904,817,209,365,563,479,231,58,162,324,40,632,267,949,126,863,749,773,705,217,903],1766) --> [4,16]
 * 
 */
public class Problem258 {
	public static int[] twoSum(int[] intArr, int sumInt){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<intArr.length;i++){
			for(int m=i+1;m<intArr.length;m++){
				if(intArr[i]+intArr[m] == sumInt){
					list.add(i);
					list.add(m);
					break;
				}
			}
			if(list.size()>0) break;
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
