package hw4;
import java.awt.*;
import javax.swing.*;

public class GameWriter extends JPanel {
	
	private int WIDTH = 400;
	private int HEIGHT = 200;
	private String text = "";
	private Dice dice;
	
	/* GameWriter
	 * 게임화면 생성
	 * @param d - 주사위 객체 */
	public GameWriter(Dice d) {
		dice = d;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Dice Game");
		f.setSize(WIDTH, HEIGHT);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);		
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, WIDTH, HEIGHT+22);
		g.setColor(Color.black);
		int text_margin = 30;
		int text_baseline = 50;
		for (String line : text.split("\n")) {
			g.drawString(line, text_margin, text_baseline);
			text_baseline += 20;
		}
	}
	
	/* showMessage
	 * 원하는 메세지 출력
	 * @param message - 원하는 메세지 */
	public void showMessage(String message) {
		text = message;
		this.repaint();
	}
}

