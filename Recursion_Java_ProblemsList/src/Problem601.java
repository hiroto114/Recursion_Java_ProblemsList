/*
 * 文字列で構成される配列 arr が与えられるので、配列の要素の順序を逆にする関数 reverseArray を作成してください。
 */
public class Problem601 {
    public static String[] reverseArray(String[] arr){
        String[] result = new String[arr.length];

        for(int i=0;i<arr.length;i++){
            result[i] = arr[arr.length-i-1];
        }

        return result;
    }
}
