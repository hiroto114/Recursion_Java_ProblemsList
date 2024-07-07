import java.util.HashMap;

/*
 * Pair of Cards というゲームをプレイしています。このゲームは以下のルールになっています。

同じランク（※カードの強さ）のカードの枚数が多いプレイヤーが勝利する（2 が 3 枚 > 10 が 2 枚）
上記枚数が同じ場合は、そのカードのランクによって勝敗が決まる（2 が 2 枚 < 10 が 2 枚）
上記も同じ場合は、次に枚数の多いカードを同様に比べ、勝敗が決まるまですべてのカードを比べる
最終的に勝敗が決まらない場合は draw とする
カードの強さ : 2 < 3 < 4 < 5 < 6 … J < Q < K < A
プレイヤー1、2 の手札を表す配列 player1、player2 が与えられるので、勝利プレイヤー文字列で返す、winnerPairOfCards という関数を作成してください。

例1 : プレイヤー1 が ["♣4","♥8","♥8","♠8","♣J"] で、プレイヤー2 が ["♣4","♥J","♥J","♠Q","♣3"] の場合、
プレイヤー1 は 8 を 3 枚持ち、プレイヤー2 は J を 2 枚持っているので、プレイヤー1 が勝利します。

例2 : プレイヤー1 が ["♣4","♥8","♥8","♠4","♣J"] で、プレイヤー2 が ["♣4","♥J","♥J","♠Q","♣3"] の場合、
プレイヤー1 は 4 を 2 枚、8 を 2 枚持ち、プレイヤー2 は J を 2 枚持つので、両者のランクの数は同じです。
一方、両者のカードを比較してみると、プレイヤー2 のカード（J）の方がプレイヤー1（8）よりも強いので、プレイヤー2 の勝利となります。

例3 : プレイヤー1 が ["♣4","♥7","♥7","♠Q","♣J"] で、プレイヤー2 が ["♥7","♥7","♣K","♠Q","♦2"] の場合、
プレイヤー1 は 7 を 2 枚持ち、プレイヤー2 も 7 を 2 枚持つので、両者のランクの数もカードの強さも同じです。
次に 1 枚のカードを見ると、プレイヤー2 のカード K の方がプレイヤー1 のカード Qよりも強いので、プレイヤー2 の勝利となります。
 */
public class Problem176 {
	public static String winnerPairOfCards(String[] player1, String[] player2){
		// 関数を完成させてください
		HashMap<Integer, Integer> hashmap1 = countEachCardNum(player1);
		HashMap<Integer, Integer> hashmap2 = countEachCardNum(player2);
		int key1, key2;
		do{
			key1 = keyOfMaxEntry(hashmap1);
			key2 = keyOfMaxEntry(hashmap2);
			if(hashmap1.isEmpty() && hashmap2.isEmpty())return "draw";
			if(hashmap1.get(key1) > hashmap2.get(key2))return "player1";
			if(hashmap1.get(key1) < hashmap2.get(key2))return "player2";
			if(key1 > key2)return "player1";
			if(key1 < key2)return "player2";

		}while(hashmap1.remove(key1) != null && hashmap2.remove(key2) != null);

		return "draw";
	}

	public static HashMap<Integer, Integer> countEachCardNum(String[] player){
		HashMap<Integer, Integer> hashmap = new HashMap <>();

		for(int i=0; i<player.length; i++){
			int num = getCardValue(player[i]);
			if(hashmap.get(num) == null)hashmap.put(num, 1);
			else hashmap.put(num, hashmap.get(num)+1);
		}
		return hashmap;
	}

	//Entry最大のkeyを返す
	public static int keyOfMaxEntry(HashMap<Integer, Integer> hashmap){
		int maxKey = 0;
		int maxEntry = 0;
		for(int key : hashmap.keySet()){

			if(maxEntry <= hashmap.get(key)){
				maxEntry = hashmap.get(key);
				if(maxKey < key)maxKey = key;
			}
			System.out.println("maxkey:" + maxKey + " maxEntry:" + maxEntry);
		}
		return maxKey;
	}

	public static int getCardValue(String string){
		switch (string.substring(1)){
		case "2": return 1;
		case "3": return 2;
		case "4": return 3;
		case "5": return 4;
		case "6": return 5;
		case "7": return 6;
		case "8": return 7;
		case "9": return 8;
		case "10": return 9;
		case "J": return 10;
		case "Q": return 11;
		case "K": return 12;
		case "A" : return 13;
		default : return 0;

		}

	}

	public static void main(String[] args){
		System.out.println(winnerPairOfCards(new String[]{"♣4","♥7","♥7","♠Q","♣J"},new String[]{"♥10","♥6","♣K","♠Q","♦2"})); // player1 
		System.out.println(winnerPairOfCards(new String[]{"♣4","♥7","♥7","♠Q","♣J"},new String[]{"♥7","♥7","♣K","♠Q","♦2"})); // player2 
		System.out.println(winnerPairOfCards(new String[]{"♣A","♥2","♥3","♠4","♣5"},new String[]{"♥A","♥2","♣3","♠4","♦5"})); // draw 
		System.out.println(winnerPairOfCards(new String[]{"♣A","♥A","♥A","♠4","♣5"},new String[]{"♥A","♥A","♣A","♠4","♦5"})); // draw
		System.out.println(winnerPairOfCards(new String[]{"♣9","♥8","♥7","♠4","♣5"},new String[]{"♥10","♥8","♣7","♠4","♦5"})); // player2
		System.out.println(winnerPairOfCards(new String[]{"♣A","♥A","♥2","♠3","♣4"},new String[]{"♥6","♥6","♣Q","♠Q","♦8"})); // player1 
		System.out.println(winnerPairOfCards(new String[]{"♣A","♥A","♥A","♠3","♣4"},new String[]{"♥6","♥6","♣Q","♠Q","♦Q"})); // player1 
		System.out.println(winnerPairOfCards(new String[]{"♣K","♥K","♥K","♠A","♣A"},new String[]{"♥6","♥6","♣Q","♠Q","♦Q"})); // player1 
		System.out.println(winnerPairOfCards(new String[]{"♣6","♠3","♠J","♦2","♥3"},new String[]{"♠8","♥2","♦8","♥9","♦J"})); // player2 
		System.out.println(winnerPairOfCards(new String[]{"♥3","♠9","♦3","♣Q","♦A"},new String[]{"♥4","♥3","♠10","♦3","♥4"})); // player2
		System.out.println(winnerPairOfCards(new String[]{"♥3","♠9","♦3","♣Q","♦3"},new String[]{"♥4","♥A","♠10","♦A","♥4"})); // player1
		System.out.println(winnerPairOfCards(new String[]{"♣K","♥8","♥K","♠K","♣A"},new String[]{"♥K","♥4","♣K","♠4","♦K"})); // player2
		System.out.println(winnerPairOfCards(new String[]{"♥9","♠8","♦7","♣6","♦5"},new String[]{"♥9","♥8","♠7","♦6","♥4"})); // player1
		System.out.println(winnerPairOfCards(new String[]{"♥3","♠4","♦5","♣6","♦7"},new String[]{"♥2","♥3","♠5","♦6","♥7"})); // player1
		System.out.println(winnerPairOfCards(new String[]{"♥K","♠4","♦K","♣6","♦6"},new String[]{"♥6","♥K","♠K","♦6","♥7"})); // player2
		System.out.println(winnerPairOfCards(new String[]{"♥2","♠2","♦2","♣2","♦6"},new String[]{"♥2","♥2","♠2","♦2","♥7"})); // player2
		System.out.println(winnerPairOfCards(new String[]{"♥2","♠2","♦2","♣2","♦6","♠3","♦3","♣4","♦6"},new String[]{"♥2","♥2","♠2","♦3","♥7","♠2","♦3","♣6","♦6"})); // player2 
		System.out.println(winnerPairOfCards(new String[]{"♥2","♠2","♦2","♣2","♦6","♠3","♦3","♣4","♦3"},new String[]{"♥2","♥2","♠2","♦3","♥7","♠2","♦3","♣6","♦6"})); // player1 
		System.out.println(winnerPairOfCards(new String[]{"♥2","♠2","♦6"},new String[]{"♥2","♥2","♥3"})); // player1
		System.out.println(winnerPairOfCards(new String[]{"♥2","♠A","♦6"},new String[]{"♥2","♥2","♥3"})); // player2 
	}
}
