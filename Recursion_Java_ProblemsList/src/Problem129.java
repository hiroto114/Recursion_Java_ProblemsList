import java.util.HashMap;

/*
 * Spinozza はローマ数字を自動で普通の数字に変換するシステムを開発しています。
 * ローマ数字 romanNumber が与えられるので、それを自然数へと変換する、romanToInteger という関数を定義してください。
 * ローマ数字への表は以下の通りです。
 * romanToInteger("IV") --> 4
romanToInteger("IX") --> 9
romanToInteger("XXXVIII") --> 38
romanToInteger("LIV") --> 54
romanToInteger("LXXXIX") --> 89
romanToInteger("XCVIII") --> 98
romanToInteger("MCMXCIII") --> 1993
romanToInteger("MMXV") --> 2015
romanToInteger("MMXX") --> 2020
I→1
V→5
X→10
L→50
C→100
D→500
M→1000
 */
public class Problem129 {
	/*
	 * 考え方として、、
	 * ①
	 */
    public static int romanToInteger(String romanNumber){
        HashMap<Character, Integer> table = new HashMap<>();

        table.put('I',1);
        table.put('V',5);
        table.put('X',10);
        table.put('L',50);
        table.put('C',100);
        table.put('D',500);
        table.put('M',1000);

        int total = 0;

        // ローマ数字を1文字ずつ取得し、数字へ変換していきます
        for (int i = 0; i < romanNumber.length() - 1; i++) {
            // i番目のローマ数字がi+1番目より小さい場合、負の値になります
            if (table.get(romanNumber.charAt(i)) < table.get(romanNumber.charAt(i+1))) total -= table.get(romanNumber.charAt(i));
            else total += table.get(romanNumber.charAt(i));
        }

        // 最後のローマ数字は比較できないので、必ず正の数になります
        return total + table.get(romanNumber.charAt(romanNumber.length() - 1));
        
    }
}
