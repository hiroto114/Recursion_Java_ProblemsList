
/*
 * 整数で構成される配列が与えられるので、奇数の合計値を計算する sumOfOddElement という関数を定義してください。
 */
public class Problem463 {
    public static int sumOfOddElement(int[] arr){
        int result =0;
        for(int iterator=0;iterator<arr.length;iterator++){
            if(arr[iterator]%2==1)result += arr[iterator];
        }

        return result;
    }
}
