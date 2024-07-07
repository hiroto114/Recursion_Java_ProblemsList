/*
 * 配列 intArr と整数 k が与えられるので、サイズ k の連続する部分配列の最小値を返す、minWindowArrK を作成してください。
 * 
 * minWindowArrK([2,3,1,1,12,3,10],1) --> [2,3,1,1,12,3,10]
 * minWindowArrK([2,3,1,1,12,3,10],3) --> [1,1,1,1,3]
 * minWindowArrK([2,3,1,1,12,3,10],4) --> [1,1,1,1]
 * minWindowArrK([3,9,10,2,4,5],3) --> [3,2,2,2]
 * minWindowArrK([3,9,10,2,4,5],5) --> [2,2]
 * minWindowArrK([30,50,60,20,30,64,80],3) --> [30,20,20,20,30]
 * minWindowArrK([30,50,60,20,30,64,80],2) --> [30,50,20,20,30,64]
 * minWindowArrK([24,5,67,60,24,64,23,536,345],3) --> [5,5,24,24,23,23,23]
 */
public class Problem175 {
	public static int[] minWindowArrK(int[] intArr, int k){
		int[] result = new int[intArr.length-k+1];

		for(int i=0;i<intArr.length-k+1;i++){
			result[i] = minWindowArrKHelper(intArr,i,i+k-1);
		}

		return result;
	}

	public static int minWindowArrKHelper(int[] intArr, int start,int end){
		int result = intArr[start];

		for(int i=start;i<=end;i++){
			if(result>intArr[i]){
				result = intArr[i];
			}
		}

		return result;
	}
}
