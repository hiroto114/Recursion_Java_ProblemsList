/*
 * 数値で構成される配列 arr が与えられるので、
 * 隣接する要素間の差の最大値を求める関数 findMaxDifference を作成してください。
 * findMaxDifference([4,8,1,10]) --> 9
 * findMaxDifference([5,5,5,5]) --> 0
 * findMaxDifference([10,7,3,0]) --> 4
 * findMaxDifference([6]) --> 0
 * findMaxDifference([-3,-7,5,10]) --> 12
 * findMaxDifference([]) --> 0
 */
public class Problem607 {
    public static int findMaxDifference(int[] arr){
        if(arr.length<=1) return 0;
        int result = Math.abs(arr[1] - arr[0]);

        for(int i=1;i<=arr.length-1;i++){
            if(result < Math.abs(arr[i] - arr[i-1])){
                result = Math.abs(arr[i] - arr[i-1]);
            }
        }

        return result;
    }
}
