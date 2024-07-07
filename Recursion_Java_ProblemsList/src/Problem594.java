/*
 * 配列の先頭から要素を削除
 */
public class Problem594 {
    public static int[] removeElementFromTheTop(int[] arr){
        if(arr.length==0) return new int[0];;
        int[] result = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            result[i-1] = arr[i];
        }

        return result;
    }
}
