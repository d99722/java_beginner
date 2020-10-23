package hw4;

public class GameController {
	
	private Dice dice; // model
	private GameReader reader; // input-view
	private GameWriter writer; // output-view
	
	private String player1;
	private String player2;
	
	/* GameController
	 * 컨트롤러
	 * @param d - model 객체
	 * @param r - input-view 객체
	 * @param w - output-view 객체 */
	public GameController(Dice d, GameReader r, GameWriter w) {
		dice = d;
		reader = r;
		writer = w;
	}
	
	/* startGame
	 * 게임 실행 : 플레이어 정보 획득 */
	public void startGame() {
		String[] player = reader.readPlayerName("Player1의 이름을 입력하세요.", "Player2의 이름을 입력하세요.");
		player1 = player[0];
		player2 = player[1];
		this.doGame();
	}
	
	/* doGame
	 * 커맨드별 명령 실행 
	 * (G : 게임 / R : 규칙소개 / Q : 종료) */
	public void doGame() {
		char command = reader.readCommand("게임 진행 : G // 규칙 보기 : R // 게임 종료 : Q");
		if (command == 'G' || command == 'g') {
			writer.showMessage(dice.battle(player1, player2));
		} else if (command == 'Q' || command == 'q') {
			writer.showMessage("Dice Game을 종료합니다.");
			return;
		} else if (command == 'R' || command == 'r') {
			writer.showMessage("1. 주사위 두개가 같은 수가 나오면 승리합니다.\n"+
					"    만약 둘 다 같다면 더 큰 수를 가진 사람이 승리합니다.\n" + 
					"2. 다른 수 끼리는 두 주사위의 합이 큰 사람이 승리합니다.\n" + 
					"3. 합이 동률인 경우에는 두 수의 차이가 작은 사람이 승리합니다.\n" + 
					"4. 두수의 차이도 동률이면 비깁니다.\n");
		} else {
			writer.showMessage("잘못된 입력입니다.");
		}
		this.doGame();
	}
}
