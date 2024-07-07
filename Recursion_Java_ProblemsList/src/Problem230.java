/*
 * Selma は借金するまで毎月 5 万円を消費しようと考えました。その後、もともと所有していた金額になるまで、毎月 5 万円ずつ貯める予定です。
 * 彼の預金額 num が与えられるので、負の数になるまで 5 を引いていき、その後 5 を足していく、reduceByFive という関数を再帰を使って作成してください。
 */
public class Problem230 {
    public static String reduceByFive(int num){
        StringBuilder result = new StringBuilder("");
        int reduceByFiveHelper = num;
        while(reduceByFiveHelper >= 0){
            result.append(String.valueOf(reduceByFiveHelper)+",");
            reduceByFiveHelper -= 5;
        }

        while(reduceByFiveHelper <= num){
            result.append(String.valueOf(reduceByFiveHelper)+",");
            reduceByFiveHelper += 5;            
        }

        return result.toString().substring(0,result.toString().length()-1);

    }
}
