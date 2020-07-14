package exercise.ch6;

public class CardFactory {
	private CardFactory() {}
	private static CardFactory instance = new CardFactory();
	
	public static CardFactory getInstance() {
		if(instance == null) {
			instance = new CardFactory();
		}
		return instance;
	}
	
	public Card CreateCard() {
		Card card = new Card();
		return card;
	}
}
