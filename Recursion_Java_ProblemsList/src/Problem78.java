
/*
 * 偶奇の並べ替え
 * 奇数→偶数の順に並べる
 */
public class Problem78 {
    public static int[] oddEvenArray(int[] numbers){
        int[] result = new int[numbers.length];
        int resultIterator = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] %2 ==1){
                result[resultIterator]=numbers[i];
                resultIterator++;
            }
        }

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] %2 ==0){
                result[resultIterator]=numbers[i];
                resultIterator++;
            }
        }

        return result;
    }
}
