package lec9.cardgame;

public class Dealer {
	
	private CardDeck deck;
	
	public Dealer() {
		deck = new CardDeck();
	}

	/** dealTo
	 * 그만 달라고 할 때까지 카드를 p에게 한장 씩 준다.
	 * @param p - player */
	public void dealTo(CardPlayer p) {
		while(p.wantsACard()) {
			Card c = deck.newCard();
			p.receiveCard(c);
		}
	}
	
	public static void main(String[] args) {
		Dealer d = new Dealer();
		HumanPlayer h = new HumanPlayer(3);
		d.dealTo(h);
		Card[] cards = h.showCards();
		for(int i=0; i<cards.length; i++) {
			System.out.println(cards[i].getSuit()+" "+cards[i].getRank());
		}
		
		
	}
	
	
	
}
