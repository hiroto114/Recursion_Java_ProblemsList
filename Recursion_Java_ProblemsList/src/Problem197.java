import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Lincoln はある金融機関から融資を受けており、信用スコアをつけられていました。
 * その信用スコアは、お金を支出したら a、返済をしたら b という風に文字が溜まっていき、それらを活用した計算式で決まります。
 * 溜まった文字 alphabets と自然数 n が与えられるので、以下の条件を満たす minimizeStringValue という関数を作成してください。
 * 信用スコア = （1 つ目のアルファベットの個数）2 + （2 つ目のアルファベットの個数）2 + ...
 * 信用スコアが最小値になるように alphabet から n 個文字を取り除く
 * 信用スコアを返す
 * 例えば、abccc, 1 が与えられたとき、a:1、b:1、c:3 なので、文字を取り除く前の値は 1^2 + 1^2 + 3^2 になります。
 * この中から 1 つだけ文字を取り除くことができるので、c を取り除くと最小値になります。したがって、1^2 + 1^2 + 2^2 = 6 となります。
 * 
 * minimizeStringValue("aannc",2) --> 3
 * minimizeStringValue("aabbaacd",3) --> 7
 * minimizeStringValue("abcde",2) --> 3
 * minimizeStringValue("abc",4) --> 0
 * minimizeStringValue("cdevggcde",5) --> 4
 */
public class Problem197 {
    public static int minimizeStringValue(String alphabets, int n){
        if(alphabets.length()<=n) return 0;
        Map<String,Integer> map= new HashMap<String,Integer>();

        for(int i=0;i<alphabets.length();i++){
            if(map.containsKey(alphabets.substring(i,i+1))){
                map.replace(alphabets.substring(i,i+1),map.get(alphabets.substring(i,i+1))+1);
            }else{
                map.put(alphabets.substring(i,i+1),1);
            }
        }

        int max = 0;
        while(n>0){
            max = Collections.max(map.values());       
            map.replace(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey(),max-1);
	        n -= 1;
        }

        int result = 0;
        for (String key : map.keySet()) {        
            result += map.get(key)*map.get(key);
        }

        return result;
    }
}
