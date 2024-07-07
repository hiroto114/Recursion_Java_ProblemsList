/*
 * Naomi はアナグラムに夢中になっています。
 * アナグラムとは、ある言葉の文字を入れ替えることによって、別の言葉を生み出す遊びです。
 * Naomi は目に映った文字列を 2 つ抜き出し、アナグラムになるか確かめています。
 * 同じサイズの文字列 str1 と str2 が与えられるので、str2 を str1 のアナグラムにするために必要な入れ替え回数を返す、makeAnagram という関数を作成してください。
 * 1 回につき、str2 の中の文字を任意の文字と入れ替えることができます。
 * 
 * makeAnagram("abc","abd") --> 1
 * makeAnagram("abcde","abcde") --> 0
 * makeAnagram("drop","word") --> 1
 * makeAnagram("causing","killing") --> 4
 * makeAnagram("dropping","changing") --> 5
 * 
 */
public class Problem252 {
	public static int makeAnagram(String str1, String str2) {
		// 関数を完成させてください
		int count = 0;

		for(int i = 0; i < str1.length(); i++){
			int index = str2.indexOf(str1.charAt(i));
			if(index == -1) count++;
			else{
				str2 = str2.substring(0, index) + str2.substring(index+1);
			}
		}

		return count;
	}
}
