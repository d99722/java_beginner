package lec9.cardgame;

import javax.swing.JOptionPane;

public class HumanPlayer extends CardPlayer {

	public HumanPlayer(int max_cards) {
		super(max_cards);
		
	}
	
	@Override
	public boolean wantsACard() {
		String response = JOptionPane.showInputDialog("한 장 더 드릴까요? (Y/N)");
		return response.equals("Y");
	}

}
