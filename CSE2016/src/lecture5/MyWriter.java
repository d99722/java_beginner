package lecture5;

import java.awt.*;
import javax.swing.*;

/* MyWriter
 * 문장을 디스플레이할 그래픽스 윈도를 만듦*/
public class MyWriter extends JPanel{
	
	private int width;
	private int height;
	private String sentence;
	private int x_position;
	private int y_position;
	
	/* MyWriter
	 * 가로 w픽셀, 세로 h픽셀 크기의 창을 생성
	 * @param w - 창의 너비
	 * @param h - 창의 높이*/
	public MyWriter(int w, int h) {
		width = w;
		height = h;
		x_position = width / 5;
		y_position = height / 2;
		sentence = "Hello";
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("MyWriter");
		f.setSize(width,height+22);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/* paintComponent
	 * 화가 메서드
	 * @param g - 그래픽스 펜*/
	public void paintComponent(Graphics g) {
		makeBorder(g);
		g.setColor(Color.red);
		g.drawString(sentence, x_position, y_position);		
	}
	
	/* makeBorder
	 * 창 프레임에 테두리 두르기
	 * @param pen - 그래픽스 펜*/
	private void makeBorder(Graphics pen) {
		pen.setColor(Color.darkGray);
		pen.fillRect(0, 0, width, height);
		pen.setColor(Color.white);
		int borderSize = 15;
		pen.fillRect(borderSize, borderSize, width-borderSize*2, height-borderSize*2);
	}
	
	/* writeSentence
	 * s를 출력 
	 * @param s - 출력할 문자열	 */
	public void writeSentence(String s) {
		sentence = s;
		this.repaint();	
	}
	
	/* positionSentence
	 * 위치를 (x,y)로 설정하고 그 위치에 출력
	 * @param x - x 좌표
	 * @param y - y 좌표 */
	public void positionSentence(int x, int y) {
		x_position = x;
		y_position = y;
		this.repaint();
	}
	
}
