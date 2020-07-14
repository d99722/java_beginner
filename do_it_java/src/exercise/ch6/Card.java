package exercise.ch6;

public class Card {
	private static int serialNum = 1000;
	private int cardNum;
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setcardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	


}
