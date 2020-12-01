package lec9.cardgame;

public interface CardPlayerBehavior {
	
	public boolean wantsACard();
	
	public boolean receiveCard(Card c);
	
}
