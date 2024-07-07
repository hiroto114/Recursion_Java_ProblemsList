public class Problem598 {
    public static int findElementIndex(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n) return i;
        }

        return -1;
    }
}
