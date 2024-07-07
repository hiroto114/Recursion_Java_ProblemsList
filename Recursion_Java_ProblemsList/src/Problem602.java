public class Problem602 {
    public static int countAdjacentPairs(char[] arr){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]) count += 1;
        }

        return count;
    }
}
