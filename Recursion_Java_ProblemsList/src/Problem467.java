
public class Problem467 {
	public static void main(String[] args) {
		Card[] cards = new Card[] { new Card("♣", "A", "1"), new Card("♦", "K", "13"), new Card("♥", "Q", "12"),
				new Card("♠", "J", "11") };

		printCardArray(cards);
	}

	public static void printCardArray(Card[] cards) {
		for (Card card : cards) {
			System.out.println(card.suit + card.value + "(" + card.intValue + ")");
		}
	}
}

class Card {
	public String suit;
	public String value;
	public String intValue;

	public Card(String suit, String value, String intValue) {
		this.suit = suit;
		this.value = value;
		this.intValue = intValue;
	}
}