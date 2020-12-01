package hw6;

import javax.swing.JOptionPane;

public class GameController {
	
	private GameWriter writer;
	private LifeGame game;
	
	/** startGame
	 *  사용자로부터 커맨드를 입력받아 상황에 맞는 동작을 취해주는 메서드 */
	public void startGame() {
		char cmd = JOptionPane.showInputDialog("Life Game을 시작합니다. \n깜빡이 : B, 두꺼비 : T, 등대 : L, 펄서 : P, 종료 : Q").charAt(0);
		if(cmd=='B'||cmd=='T'||cmd=='L'||cmd=='P'||cmd=='Q')
			cmd += 32;
		if(cmd=='b'||cmd=='t'||cmd=='l'||cmd=='p') {
			game = new LifeGame(cmd);
			writer = new GameWriter(game.getBoard());
			runAnimation();
		} else if (cmd=='q') {
			JOptionPane.showMessageDialog(null, "Life Game을 종료합니다.");
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
			this.startGame();
		}
	}
	
	/** runAnimation
	 * 선택한 상태를 10초간 20세대 보여줌 */
	public void runAnimation() {
		int painting_delay = 500;
		int count = 0;
		while(count<=10000) {
			count += painting_delay;
			delay(painting_delay);
			game.change();
			writer.repaint();
		}
		this.startGame();
	}
	
	/** delay
	 * 지연 시간을 설정해주는 메서드
	 * @param how_long - 지연시간(0.5초) */
	private void delay(int how_long) {
		try {Thread.sleep(how_long);}
		catch (InterruptedException e) {}
	}

}
