package lec8;

public class Hand {
	// 카드 놀이 하는 참여자의 손에 들고 있는 카드의 모델

	private Card[] hand; // 손에 들고 있는 카드
	private int number_of_cards; // 손에 들고 있는 카드의 장수

	/** Constructor Hand - how_many 카드를 수용가능한 Card 배열 객체를 만들어 hand 초기화 
	 * @param how_many - 들고 있을 수 있는 카드의 최대 장수 */
	public Hand(int how_many) {
		hand = new Card[how_many];
	}
	
	/** showHand - 들고 있는 카드를 모두 실행창에 프린트한다. 
	 *             카드가 없으면 카드가 없다고 프린트한다. */ 
	public void showHand() {
		if(number_of_cards == 0) {
			System.out.println("들고있는 카드가 없습니다.");
		}
		else {
			Card card;
			for(int i = 0; i<number_of_cards; i++) {
				card = hand[i];
				System.out.println("#"+(i+1)+" = "+card.getSuit()+" "+card.getRank());
			}
		}

	}
	
	/** receiveCard - 카드를 한장 받는다. 한도(배열 hand의 크기)를 초과하면 받을 수 없다.
	 * @param c - 카드
	 * @return 성공적으로 받았으면 true, 그렇지 않으면 false */
	public boolean receiveCard(Card c) {
		if(number_of_cards < hand.length) {			
			hand[number_of_cards] = c;
			number_of_cards += 1;
			return true;
		} else {
			return false;
		}
		

	}

	/** removeCard - 들고 있는 카드 중에서 하나를 버린다. 
	 *  게임에 따라 버릴 카드를 선택하는 기준이 다를 수 있음. 여기서는 무작위로 선택 
	 * @return 선택한 카드, 손에 들고 있는 카드가 없으면 null */
	public Card removeCard() {
		if (number_of_cards > 0) {
			int picked = (int)(Math.random() * number_of_cards);
			Card card_to_remove = hand[picked];
			if(number_of_cards - 1 > picked) {
				for(int i=picked+1; i<number_of_cards; i++) {
					hand[i-1]=hand[i];
				}
			}
			number_of_cards -= 1;
			return card_to_remove;
		}
		else
			return null;
	}
	
	public static void main(String[] args) {
		Hand h = new Hand(2);
		CardDeck d = new CardDeck();
		Card c1 = d.newCard();
		h.receiveCard(c1);
		Card c2 = d.newCard();
		if(h.receiveCard(c2)) {
			h.showHand();
		}
		h.removeCard();
		h.showHand();
	}
	
}
