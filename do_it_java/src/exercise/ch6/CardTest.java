package exercise.ch6;

public class CardTest {

	public static void main(String[] args) {
		CardFactory factory = CardFactory.getInstance();
		Card c1 = factory.CreateCard();
		Card c2 = factory.CreateCard();
		System.out.println(c1.getCardNum());
		System.out.println(c2.getCardNum());
			
		}

}
