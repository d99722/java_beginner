package lec9.cardgame;

public class ComputerPlayer extends CardPlayer{
	
	public ComputerPlayer(int max_cards) {
		super(max_cards);
	}

	@Override
	public boolean wantsACard() {
		// computer player's strategy
		return true;
	}
	

}
