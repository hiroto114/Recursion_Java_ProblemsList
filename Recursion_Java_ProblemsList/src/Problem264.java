import java.util.HashMap;
import java.util.Map;

/*
 * 最小部分文字列
 * 
 * s と t の 2 つの文字列が与えられています。文字列 s の任意の部分文字列を選択し、文字の順番を自由に入れ替えます。
 * t の全ての文字が含まれている部分文字列の最小の長さを決定し、その文字列を返す、minLengthSubstring という関数を作成してください。
 * もしそのような文字列が存在しない場合は空の文字列を返してください。入力は最小部分文字列を 1 つだけ含むことが保証されています。
 * 
 * 例えば、s = "abcabdebac", t = "cda" であるとき、"cabd" を選択し
 * 文字の順序を入れ替えると "cdab" となり、t を部分文字列として含みます。したがって、"cabd" を出力として返します。
 */
public class Problem264 {
	// 時間計算量はO(Math.min(st,ss))
	public static String minLengthSubstring(String s, String t){
		Map<Character, Integer> tMap = null;
		String result = s;
		boolean solutionExists = false;
		for(int i=0; i<s.length()-1; i++){
			tMap = countString(t);
			if(tMap.getOrDefault(s.charAt(i), 0) > 0){
				tMap.put(s.charAt(i), tMap.get(s.charAt(i)) - 1);
			}
			if(tMap.getOrDefault(s.charAt(i), 0) == 0){
				tMap.remove(s.charAt(i));
			}
			if(tMap.size() == 0){
				solutionExists = true;
				result = String.valueOf(s.charAt(i));
				break;
			}
			for(int m=i+1; m<s.length(); m++){
				if(tMap.getOrDefault(s.charAt(m), 0) > 0){
					tMap.put(s.charAt(m), tMap.get(s.charAt(m)) - 1);
				}
				if(tMap.getOrDefault(s.charAt(m), 0) == 0){
					tMap.remove(s.charAt(m));
				}
				if(tMap.size() == 0){
					solutionExists = true;
					result = (result.length() > m-i+1) ? s.substring(i, m+1): result;
				}
			}
		}
		if(solutionExists) return result;
		return "";
	}
	public static Map<Character, Integer> countString(String t){
		Map<Character, Integer> tMap = new HashMap<Character, Integer>();
		for(int i=0;i<t.length(); i++){
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
		}
		return tMap;
	}
}
