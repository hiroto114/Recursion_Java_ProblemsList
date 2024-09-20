
/*
 * 数値で構成される配列 arr が与えられるので、
 * arr の末尾から要素を 1 つ削除した配列を返す removeElementFromTheEnd という関数を作成してください。
 */
public class Problem593 {
    public static int[] removeElementFromTheEnd(int[] arr){
        if(arr.length==0) return new int[0];
        int[] result = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            result[i] = arr[i];
        }

        return result;
    }
}
