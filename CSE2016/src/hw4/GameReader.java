package hw4;

import javax.swing.JOptionPane;

public class GameReader {
	
	private String[] player = new String[2];
	private String input_command;
	
	/* readPlayerName
	 * 플레이어 정보 획득
	 * @param message1 - 첫번째 플레이어 안내 메세지
	 * @param message2 - 두번째 플레이어 안내 메세지
	 * @return - 플레이어 이름이 저장된 배열 */
	public String[] readPlayerName(String message1, String message2) {
		player[0] = JOptionPane.showInputDialog(message1);
		player[1] = JOptionPane.showInputDialog(message2);
		return player;
	}

	/* readCommand
	 * 요청 기능 파악
	 * @param message - 안내 메세지
	 * @return - 요청 기능 커맨드 */
	public char readCommand(String message) {
		input_command = JOptionPane.showInputDialog(message);
		return input_command.charAt(0);
	}
}
