/*
 * 整数で構成されるサイズ 2 以上の配列 arr が与えられるので、i 番目の要素が result[i] 以外の積で構成される配列を返す、
 * productArray という関数を作成してください。
 * 
 * productArray([1,2]) --> [2,1]
 * productArray([1,2,3]) --> [6,3,2]
 * productArray([1,2,0,3,4]) --> [0,0,24,0,0]
 * productArray([1,2,3,4]) --> [24,12,8,6]
 * productArray([3,4,5,6,7,3,2,4,6]) --> [120960,90720,72576,60480,51840,120960,181440,90720,60480]
 * productArray([3,4,0,6,0,3,2,4,6]) --> [0,0,0,0,0,0,0,0,0]
 * productArray([1,2,3,4,5]) --> [120,60,40,30,24]
 * productArray([8,3,5,2,9,5,3,19]) --> [76950,205200,123120,307800,68400,123120,205200,32400]
 * 
 */
public class Problem346 {
	public static int[] productArray(int[] arr){
		int zeroCount = 0;
		int zeroIndex = -1;
		int allProduct = 1;
		for(int i =0;i<arr.length;i++){
			if(arr[i]==0){
				zeroCount += 1;
				zeroIndex = i;
			}else{
				allProduct *= arr[i];
			}
		}

		int[] result = new int[arr.length];
		if(zeroCount >=2) return result;
		if(zeroCount ==1){
			result[zeroIndex] = allProduct;
			return result;
		}

		for(int i=0;i<arr.length;i++){
			result[i] = allProduct/arr[i];
		}
		return result;
	}
}
