/*
 * 数値で構成される配列 arr が与えられるので、配列の中で最小の数値を返す関数 findMin を作成してください。
 */
public class Problem600 {
    public static int findMin(int[] arr){
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            if(result>arr[i]){
                result = arr[i];
            }
        }

        return result;
    }
}
