package hw4;

public class GameManager {

	public static void main(String[] args) {
		Dice dice = new Dice();
		GameReader reader = new GameReader();
		GameWriter writer = new GameWriter(dice);
		GameController controller = new GameController(dice, reader, writer);
		controller.startGame();
	}
}
