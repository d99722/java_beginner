package gameLevel;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();	// 처음 생성하면 BeginnerLevel
		player.play(2);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}

}
