import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Roger はあるカードゲームでイカサマしようと思っています。
 * そのゲームは、デッキの一番上から 1 枚カードを取り出した後、その次に上にあるカードを一番下に持っていくルールです。
 * Roger はカードを取り出す順番を昇順にしたいと思いました。整数によって構成されるデッキ deck が与えられるので、
 * デッキを昇順にカードを取り出すことができる並びに変更する、increasingDeck という関数を作成してください。
 * 
 * 例えば、[18,14,12,3,4,6,8] が入力された場合、[3,14,4,12,6,18,8] が答えになります。[3,14,4,12,6,18,8] でカードを表にしてくと、
 * 3 を出して 14 をデッキの一番下に挿入します。このとき、デッキは [4,12,6,18,8,14] になります。
 * 4 を出して 12 を下へ移動。デッキは [6,18,8,14,12]
 * 6 を出して 18 を下へ移動。デッキは [8,14,12,18]
 * 8 を出して 14 を下へ移動。デッキは [12,18,14]
 * 12 を出して 18 を下へ移動。デッキは [14,18]
 * 14 を出して 18 を下へ移動。デッキは [18]
 * 18 を出す。
 * 数字は昇順に公開されたので、[3,14,4,12,6,18,8] が正解となります。
 * 
 * increasingDeck([18]) --> [18]
 * increasingDeck([18,12]) --> [12,18]
 * increasingDeck([18,14,12,3,4,6,8]) --> [3,14,4,12,6,18,8]
 * increasingDeck([47,35,17,13,11,15,2,3,5,7]) --> [2,13,3,47,5,15,7,35,11,17]
 * 
 * 1,入力配列deckをソート
 * 2,ArrayListのdeckListには0~n-1までを登録
 * 3,deckListを並べ替えて0~n-1がどの位置に来るのかを計算
 * 4,2と3のペアが対応になっていて、3の順番にソートされていればよい
 * 5,3の順番にソートされた順の値が来ればよいのだからその順に結果を作ればよい
 */
public class Problem285 {
	public static int[] increasingDeck(int[] deck){
		Arrays.sort(deck);
		int[] arrayIndex = new int[deck.length];
		List<Integer> deckList = new ArrayList<Integer>();
		for(int i=0; i<deck.length; i++){
			deckList.add(i);
		}
		// 下記処理にて各要素がどの位置に移動されるのかわかる。
		// それをもとに結果を計算する。
		for(int i=0; i< deck.length; i++){
			arrayIndex[i] = deckList.get(0);
			if(deckList.size() > 0)	deckList.remove(0);
			if(deckList.size() > 0)	deckList.add(deckList.get(0));
			if(deckList.size() > 0)	deckList.remove(0);
		}

		int[] result = new int[deck.length];        
		for(int i=0; i<deck.length; i++){
			result[arrayIndex[i]] = deck[i];
		}
		return result;
	}
}
