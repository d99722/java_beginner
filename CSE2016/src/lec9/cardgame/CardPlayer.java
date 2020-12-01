package lec9.cardgame;

public abstract class CardPlayer implements CardPlayerBehavior{
	
	private Card[] hand;
	private int card_count;
	
	public CardPlayer(int max_cards) {
		hand = new Card[max_cards];
		card_count = 0;
	}
	
	public abstract boolean wantsACard();	
	
	/** receiveCard
	 * 카드를 한 장 받는다. 한도(배열 hand의 크기)를 초과하면 받을 수 없다.
	 * @param c - 카드
	 * @return 성공적으로 받았으면 true, 그렇지 않으면 false */
	public boolean receiveCard(Card c) {
		if(card_count<hand.length) {			
			hand[card_count]=c;
			card_count += 1;
			return true;
		}
		else
			return false;
	}
	
	public Card[] showCards() {
		Card[] cards = new Card[card_count];
		for (int i=0; i<card_count; i++) {
			cards[i] = hand[i];
		}
		return hand;
	}
	

}
