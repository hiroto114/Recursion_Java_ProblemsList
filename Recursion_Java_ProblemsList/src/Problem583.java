
public class Problem583 {
    public static String findMinMax(int num1, int num2){
        String result = "";

        result += "Max: "+ Math.max(num1,num2);
        result += ", Min: " + Math.min(num1,num2);

        return result;
    }
}
