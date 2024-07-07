import java.util.HashMap;
import java.util.Map;

/*
 * Nordley は同じ文字で始まって同じ文字で終わる文章を多く含ませる文学作品の存在を知り、興味を持ちました。
 * そこで、そのような表現が最も多い作品は何か調べようと思いました。文字列 string が与えられるので、
 * 部分文字列の中で最初と最後が同じ文字で終わる文字列の個数を返す、countSubstring という関数を再帰を使って作成してください。
 * 例えば、"aba" では、a, b, a, aba の 4 つの部分文字列が条件に合致します。
 * 
 * countSubstring("a") --> 1
 * countSubstring("aa") --> 3
 * countSubstring("aaa") --> 6
 * countSubstring("abc") --> 3
 * countSubstring("aba") --> 4
 * countSubstring("abcab") --> 7
 * countSubstring("abcaba") --> 10
 * countSubstring("helloworld") --> 14
 * 
 */
public class Problem233 {
	public static int countSubstring(String string){
		Map<Character,Integer> map= new HashMap<>();
		for(int i=0;i<string.length();i++){
			if(map.containsKey(string.charAt(i))){
				map.replace(string.charAt(i),map.get(string.charAt(i))+1);
			}else{
				map.put(string.charAt(i),1);
			}
		}

		int result = 0;
		for(Integer pointer: map.values()){
			result += (1+pointer.intValue())*pointer.intValue()/2;
		}

		return result;
	}
}
