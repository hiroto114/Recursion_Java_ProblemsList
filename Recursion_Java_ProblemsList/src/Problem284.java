import java.util.HashMap;
import java.util.Map;

/*
 * 文字列の配列 stringList、文字の並び順を決定する alphabet が与えられるので、
 * stringList が順番にソートされているかどうかを判断する、isSortedByAlphabet という関数を作成してください。
 * すべての文字は小文字で、アルファベットの中の文字の位置によって優先度が決まります。
 * 空の文字列「""」は全ての文字列の中で最も優先度が高いことに注意してください。"test" は "testing" よりも小さいことを意味します。
 * 
 * それでは例を見てみましょう。["hello","world"], "hwabcdefgijklmnopqrstuvxyz" の場合、alphabet の中で h は w より前にあるので、
 * 与えられた順番は true を返します。["lore","lorke","role"], "lorkeabcdfghijmnpqstuvwxyz" の場合、l は r の前にあるので、role は配列の最後と確定します。
 * l, o, r と比較していき、k は e の前にあるので、正しい順番は ["lorke","lore","role"] なので false を返します。
 * 
 * isSortedByAlphabet(["hello","world"],"hwabcdefgijklmnopqrstuvxyz") --> true
 * isSortedByAlphabet(["hello","world","apple","bear","pear"],"hwabcdefgijklmnopqrstuvxyz") --> true
 * isSortedByAlphabet(["aa","a"],"abcdefghijklmnopqrstuvwxyz") --> false
 * isSortedByAlphabet(["engine","engineer"],"abcdefghijklmnopqrstuvwxyz") --> true
 * isSortedByAlphabet(["lore","lorke","role"],"lorkeabcdfghijmnpqstuvwxyz") --> false
 * isSortedByAlphabet(["kuvp","q","qavi","qavik"],"ngxlkthsjuoqcpavbfdermiywz") --> true
 * isSortedByAlphabet(["adipisci","autem","cum","et","ex","magnam","nam","nihil","non","odit","officiis","qui","saepe","sint","suscipit","tempore","totam","vel","voluptatem","voluptatem"],"abcdefghijklmnopqrstuvwxyz") --> true
 * 
 */
public class Problem284 {
	public static boolean isSortedByAlphabet(String[] stringList, String alphabet){
		Map<String,Integer> countAlphabet = summarizeString(alphabet);
		for(int i=0;i<stringList.length-1;i++){
			if(!isSorted(stringList[i],stringList[i+1],countAlphabet)){
				return false;
			}
		}
		return true;
	}

	public static Map<String,Integer> summarizeString(String input){
		Map<String,Integer> result = new HashMap<String,Integer>();
		for(int i=0;i<input.length();i++){
			result.put(input.substring(i,i+1),i);
		}
		return result;
	}

	public static boolean isSorted(String s1, String s2, Map<String,Integer> sortRule){
		for(int i=0;i<Math.min(s1.length(),s2.length());i++){
			if(sortRule.get(s1.substring(i,i+1)) < sortRule.get(s2.substring(i,i+1))){
				return true;
			}
			if(sortRule.get(s1.substring(i,i+1)) > sortRule.get(s2.substring(i,i+1))){
				return false;
			}
		}
		if(s1.length() > s2.length()){
			if(s1.substring(0,s2.length()).equals(s2)){
				return false;
			}
		}
		return true;
	}
}
