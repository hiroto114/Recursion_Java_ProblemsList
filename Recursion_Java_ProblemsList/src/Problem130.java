/*
 * Spinozza は数字を自動でローマ数字に変換するシステムを開発しています。
 * 自然数 arabicNumber が与えられるので、それをローマ数字へと変換する、integerToRoman という関数を定義してください。
 * ローマ数字への表は以下の通りです。ローマ数字は規程上、1 から 3999 までしか表すことができないので、4000 を超えた場合は、最大である M を使うことによって、数値を変換してください。
 */
public class Problem130 {
    public static String integerToRoman(int arabicNumber){
        StringBuilder result = new StringBuilder("");
        result.append("M".repeat(arabicNumber/1000));
        arabicNumber = arabicNumber %1000;

        result.append("CM".repeat(arabicNumber/900));
        arabicNumber = arabicNumber %900;

        result.append("DCCC".repeat(arabicNumber/800));
        arabicNumber = arabicNumber %800;

        result.append("DCC".repeat(arabicNumber/700));
        arabicNumber = arabicNumber %700;

        result.append("DC".repeat(arabicNumber/600));
        arabicNumber = arabicNumber %600;

        result.append("D".repeat(arabicNumber/500));
        arabicNumber = arabicNumber %500;

        result.append("CD".repeat(arabicNumber/400));
        arabicNumber = arabicNumber %400;


        result.append("CCC".repeat(arabicNumber/300));
        arabicNumber = arabicNumber %300;

        result.append("CC".repeat(arabicNumber/200));
        arabicNumber = arabicNumber %200;

        result.append("C".repeat(arabicNumber/100));
        arabicNumber = arabicNumber %100;

        result.append("XC".repeat(arabicNumber/90));
        arabicNumber = arabicNumber %90;

        result.append("LXXX".repeat(arabicNumber/80));
        arabicNumber = arabicNumber %80;

        result.append("LXX".repeat(arabicNumber/70));
        arabicNumber = arabicNumber %70;

        result.append("LX".repeat(arabicNumber/60));
        arabicNumber = arabicNumber %60;

        result.append("L".repeat(arabicNumber/50));
        arabicNumber = arabicNumber %50;


        result.append("XL".repeat(arabicNumber/40));
        arabicNumber = arabicNumber %40;        

        result.append("XXX".repeat(arabicNumber/30));
        arabicNumber = arabicNumber %30;

        result.append("XX".repeat(arabicNumber/20));
        arabicNumber = arabicNumber %20;

        result.append("X".repeat(arabicNumber/10));
        arabicNumber = arabicNumber %10;

        result.append("IX".repeat(arabicNumber/9));
        arabicNumber = arabicNumber %9;

        result.append("VIII".repeat(arabicNumber/8));
        arabicNumber = arabicNumber %8;

        result.append("VII".repeat(arabicNumber/7));
        arabicNumber = arabicNumber %7;

        result.append("VI".repeat(arabicNumber/6));
        arabicNumber = arabicNumber %6;

        result.append("V".repeat(arabicNumber/5));
        arabicNumber = arabicNumber %5;

        result.append("IV".repeat(arabicNumber/4));
        arabicNumber = arabicNumber %4;

        result.append("III".repeat(arabicNumber/3));
        arabicNumber = arabicNumber %3;

        result.append("II".repeat(arabicNumber/2));
        arabicNumber = arabicNumber %2;

        result.append("I".repeat(arabicNumber/1));

        return result.toString();
    }
	
}
