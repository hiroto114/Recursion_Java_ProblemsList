
/*
 * 各文字の ASCII 値の合計が最大になるインデックスを返却
 */
public class Problem66 {
    public static int maxAscilString(String[] stringList){
        int maxResult = getAscilFromString(stringList[0]);
        int maxIndex = 0;
        for(int i=0;i<stringList.length;i++){
            if(maxResult < getAscilFromString(stringList[i])){
                maxResult = getAscilFromString(stringList[i]);
                maxIndex = i;
            }            
        }

        return maxIndex;
    }

    public static int getAscilFromString(String input){
        int result = 0;
        for(int i=0;i<input.length();i++){
            result += (int) input.charAt(i);
        }

        return result;
    }
}
