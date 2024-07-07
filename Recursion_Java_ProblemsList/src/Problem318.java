/*
 * 文字列 s が与えられるので、真ん中の文字を返す、getMiddle という関数を作成してください。
 * ただし、文字列の長さが偶数の際は、真ん中の 2 つを返してください。
 * 
 * getMiddle("recursion") --> r
 * getMiddle("hello") --> l
 * getMiddle("even") --> ve
 * getMiddle("odd") --> d
 * getMiddle("hello world") --> 
 */
public class Problem318 {
	public static String getMiddle(String s){
		if(s.length()%2 ==0){
			return s.substring(s.length()/2-1,s.length()/2+1);
		}else{
			return s.substring(s.length()/2,s.length()/2+1);
		}
	}
}
