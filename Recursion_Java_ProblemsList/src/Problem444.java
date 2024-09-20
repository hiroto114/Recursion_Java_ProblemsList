
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*
 * double subtractOne(double x)
 * 数値 x を受け取り、1 を引くラムダ関数。
 * 
 * double addTwo(double x)
 * 数値 x を受け取り、2 を足すラムダ関数。
 * 
 * double divideByThree(double x)
 * 数値 x を受け取り、3 で割るラムダ関数。
 * 
 * double multipleByFour(double x)
 * 数値 x を受け取り、4 を掛けるラムダ関数。
 * 
 * int roundNum(double x)
 * 数値 x を受け取り、小数点以下を切り捨てるラムダ関数。
 */
public class Problem444 {
    public static Function<Double, Double> subtractOne = x -> {
        return x - 1;
    };
    public static Function<Double, Double> addTwo = x -> {
        return x + 2;
    };
    public static Function<Double, Double> divideByThree = x -> {
        return x / 3;
    };
    public static Function<Double, Double> multipleByFour = x -> {
        return x * 4;
    };
    public static Function<Double, Double> roundNum = x -> {
        return Math.floor(x);
    };

    public static void main(String[] args){
        System.out.println(combineOperations(Arrays.asList(subtractOne, addTwo, divideByThree, multipleByFour, roundNum), 0));
        System.out.println(combineOperations(Arrays.asList(subtractOne, addTwo, divideByThree, multipleByFour, roundNum), 10));
        System.out.println(combineOperations(Arrays.asList(subtractOne, addTwo, divideByThree, multipleByFour, roundNum), 100));
    }
    public static int combineOperations(List<Function<Double, Double>> arrayList, int input){
        Double result = Double.valueOf(input);
        for(Function<Double, Double> f: arrayList){
            result = f.apply(result);
        }
        return result.intValue();
    }
}

