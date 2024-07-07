public class Problem604 {
    public static int calculateSum(int[] arr){
        int count = 0;
        for(int a:arr){
            count += a;
        }
        return count;
    }
}
