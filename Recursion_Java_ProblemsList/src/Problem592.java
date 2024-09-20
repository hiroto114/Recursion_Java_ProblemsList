
/*
 * 数値で構成される配列 arr と数値 n が与えられるので、
 * arr の末尾に n を加えた配列を返す addElementToTheEnd という関数を作成してください。
 */
public class Problem592 {
    public static int[] addElementToTheEnd(int[] arr, int n){
        int[] result = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            result[i] = arr[i];
        }
        result[result.length-1] = n;
        return result;
    }
}
