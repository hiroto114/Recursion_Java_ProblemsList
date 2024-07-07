/*
 * 自然数によって構成される配列 arr が与えられるので、
 * 配列に含まれる頂上の数を返す、numberOfTops という関数を作成してください。ただし、配列の要素は以下の場合に頂上となります。
 * 1 番目と最後を除く要素
 * 直前の要素と直後の要素よりも高い
 * 
 * numberOfTops([1,8,2,8,1]) --> 2
 * numberOfTops([11,22,13]) --> 1
 * numberOfTops([9,9,9,9]) --> 0
 * numberOfTops([2,5,2]) --> 1
 * numberOfTops([344,531,542,581,662,473,627,614,365,384,221,105,899]) --> 3
 * numberOfTops([877,211,136,94,867,107,196,388,952,140,618,410,90]) --> 3
 * numberOfTops([133,13,630,753,693,197,691,207,663,647,925,607,420,708,964,605,440,960,217,533,686,904,590,159,140]) --> 7
 * 
 */
public class Problem261 {
	public static int numberOfTops(int[] arr){
		int result = 0;
		for(int i=1;i<=arr.length-2;i++){
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
				result += 1;
			}
		}
		return result;
	}
}
