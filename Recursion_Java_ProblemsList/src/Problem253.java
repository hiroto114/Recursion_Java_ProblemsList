import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 小学生の Alec は n 個のカードを持っています。
 * 各タイルには 1 文字のアルファベットが印刷されており、組み合わせることで様々な文字列を作成できます。
 * Alec が所有しているカード cards が与えられたとき、全ての組み合わせの個数を返す letterCombination という関数を作成してください。
 * 例えば、UK のケースでは、U、K、KU、UK の 4 通りが考えられます。
 * 
 * letterCombination("S") --> 1
 * letterCombination("UK") --> 4
 * letterCombination("EAT") --> 15
 * letterCombination("BBC") --> 8
 * letterCombination("AALLPP") --> 270
 * letterCombination("ABCDEF") --> 1956
 * 
 * 思ったのは、JavaにはPythonみたく便利なライブラリがないんで、この手の問題で短く書けない。簡単に。
 * こういったパターンの問題が出たら再帰＋前回の結果を保持しておくデータ構造を用意するしかない。
 * 運が良ければ動的計画法で再帰を使わずに解ける。
 */
public class Problem253 {
	// 現状の書きっぷりだと、UK→U,UK,KUには対応できるけどKには対応出来ぬ、、
	public static int letterCombination(String cards){
		Map<Character, Integer> cardMap = new HashMap<Character, Integer>();
		for(int i=0; i<cards.length(); i++){
			cardMap.put(cards.charAt(i), cardMap.getOrDefault(cards.charAt(i), 0) + 1);
		}
		Set<String> cardPattern = new HashSet<String>();
		return letterCombinationHelper(cardMap, cardPattern);
	}

	public static int letterCombinationHelper(Map<Character, Integer> cardMap, Set<String> cardPattern){
		if(cardMap.size() == 0) return cardPattern.size();
		Character targetCard = '-';
		// 時間計算量O(1)で終わるため問題なし。
		for(Map.Entry<Character, Integer> cardMapPointer: cardMap.entrySet()){
			targetCard = cardMapPointer.getKey();
			cardMap.put(targetCard, cardMap.get(targetCard) - 1);
			if(cardMapPointer.getValue() == 0) cardMap.remove(targetCard);
			break;
		}

		if(cardPattern.size() == 0) return letterCombinationHelper(cardMap, new HashSet<String>(Arrays.asList(String.valueOf(targetCard))));
		Set<String> newCardPattern = new HashSet<String>();
		newCardPattern.add(String.valueOf(targetCard));
		newCardPattern.addAll(cardPattern);
		for(String i: cardPattern){
			// 一番最初に文字を加えた版
			newCardPattern.add(targetCard + i);
			// その中間
			for(int m=0; m<i.length()-1; m++){
				newCardPattern.add(i.substring(0, m+1) + targetCard + i.substring(m+1));
			}
			// 一番最後に文字を加えた版
			newCardPattern.add(i + targetCard);
		}
		return letterCombinationHelper(cardMap, newCardPattern);
	}
}
