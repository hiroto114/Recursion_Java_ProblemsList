
/*
 * notDivisibleNumbers(x,y) は、1 から x までの整数を y で割った時に余りがある数を見つけ、
 * "-" で区切って文字列として返す関数です。例えば、x = 10, y = 3 の場合、
 * 1,2,3,4,5,6,7,8,9,10 のうち 3 で割った時に余りがある数は 1,2,4,5,7,8,10 なので、
 * "-" で区切って "1-2-4-5-7-8-10" という文字列が返されます。
 * 
 * ただし、x = 1 かつ y = 1 の場合、1 を割る数が 1 しかないため、余りがある数は存在せず、
 * 文字列として返すものがないため、関数は定義されません。また、x や y が負の数や小数である場合、この関数は正しく動作しません。
 */
public class Problem53 {
    public static String notDivisibleNumbers(int x, int y){
        String result = "";
        for(int i=1;i<=x;i++){
            if(i % y !=0){
                result = result + i + "-";
            }
        }

        return result.substring(0,result.length()-1);
    }
}
