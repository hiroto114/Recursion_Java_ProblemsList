
public class Problem486 {
    public static int seachList(int[] numList, int value){
        for(int iterator =0;iterator<numList.length;iterator++){
            if(numList[iterator]==value){
                return iterator;
            }
        }
        return -1;
    }
}
