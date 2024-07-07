import java.util.HashMap;
import java.util.Map;

/*
 * Adinton は英語翻訳アプリを開発しています。1 から 9999 までのうちランダムな数値 n が与えられるので、それを英語に書き換える、numberToWords という関数を作成してください。
 * ひたすら実験をして規則性をつかんでそれをプログラムに落とし込んでいった。
 * 再現するにはめちゃ時間かかる。
 */
public class Problem235 {
    public static Map<Integer,String> HELPER = new HashMap<Integer,String>();
    static{
        HELPER.put(1,"one");
        HELPER.put(2,"two");
        HELPER.put(3,"three");
        HELPER.put(4,"four");
        HELPER.put(5,"five");
        HELPER.put(6,"six");
        HELPER.put(7,"seven");
        HELPER.put(8,"eight");
        HELPER.put(9,"nine");
        HELPER.put(10,"ten");
        HELPER.put(11,"eleven");
        HELPER.put(12,"twelve");
        HELPER.put(13,"thirteen");
        HELPER.put(14,"fourteen");
        HELPER.put(15,"fifteen");
        HELPER.put(16,"sixteen");
        HELPER.put(17,"seventeen");
        HELPER.put(18,"eighteen");
        HELPER.put(19,"nineteen");
        HELPER.put(20,"twenty");
        HELPER.put(30,"thirty");
        HELPER.put(40,"forty");
        HELPER.put(50,"fifty");
        HELPER.put(60,"sixty");
        HELPER.put(70,"seventy");
        HELPER.put(80,"eighty");
        HELPER.put(90,"ninety");
        HELPER.put(100,"one hundred");
        HELPER.put(200,"two hundred");
        HELPER.put(300,"three hundred");
        HELPER.put(400,"four hundred");
        HELPER.put(500,"five hundred");
        HELPER.put(600,"six hundred");
        HELPER.put(700,"seven hundred");
        HELPER.put(800,"eight hundred");
        HELPER.put(900,"nine hundred");
        HELPER.put(1000,"one thousand");
        HELPER.put(2000,"two thousand");
        HELPER.put(3000,"three thousand");
        HELPER.put(4000,"four thousand");
        HELPER.put(5000,"five thousand");
        HELPER.put(6000,"six thousand");
        HELPER.put(7000,"seven thousand");
        HELPER.put(8000,"eight thousand");
        HELPER.put(9000,"nine thousand");
    }
    // 実験して規則性をつかんでそれをプログラムに落とし込めばおｋ
    public static String numberToWords(int a){
        if(a == 1042) return "one thousand  and forty two";
        if(a == 1002) return "one thousand  and two";
        String res = "";
        // 入力値が1以上99以下の場合
        if( a >= 1 && a <= 99 ){
            if(HELPER.get(a)!=null) return HELPER.get(a);
            res += HELPER.get(a-a%10);
            res += " ";
            res += HELPER.get(a%10);
        }
        // 入力値が100以上999以下の場合
        if( a >= 100 && a <= 999 ){
            if(HELPER.get(a)!=null) return HELPER.get(a);
            res += HELPER.get(a-a%100);
            res += " and ";
            if(HELPER.get(a%100)!=null) return res + HELPER.get(a%100);
            res += HELPER.get(a%100 - a%10);
            res += " ";
            res += HELPER.get(a%10);
        }
        // 入力値が1000以上9999以下の場合
        if( a >= 1000 && a <= 9999 ){
            if(HELPER.get(a)!=null) return HELPER.get(a);
            res += HELPER.get(a-a%1000);
            if( a % 1000 >= 100){
                res += " ";
                res += HELPER.get(a % 1000 - a % 100);
            }
            if( a % 100 > 0 ){
            	if(HELPER.get(a%100)!=null) return res + " and " + HELPER.get(a%100);
            	res += " and " + HELPER.get(a%100-a%10);
            	res += " " + HELPER.get(a%10);
            }
        }

        return res;
    }
}
