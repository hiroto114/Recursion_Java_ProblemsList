
/*
 * 数値で構成される配列 arr と数値 n が与えられるので、
 * arr の先頭に n を加えた配列を返す addElementToTheTop という関数を作成してください。
 */
public class Problem595 {
    public static int[] addElementToTheTop(int[] arr, int n){
        int[] result = new int[arr.length+1];
        result[0] = n;
        for(int i=1;i<result.length;i++){
            result[i] = arr[i-1];
        }

        return result;
    }
}
