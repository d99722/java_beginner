package lec5;

import java.awt.*;
import javax.swing.*;

/* Homework3
 * 꽃밭과 꽃을 보여주는 그래픽스 윈도를 만듦*/
public class Homework3 extends JPanel{
	
	/* Homework3
	 * 가로 1000픽셀, 세로 700픽셀 크기의 창을 생성
	 * (제목표시줄 문제로 세로 22픽셀 추가) */
	public Homework3() {
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Homework3");
		f.setSize(1000,722);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/* paintComponent
	 * 꽃밭과 꽃을 그림
	 * @param g - 그래픽스 g */
	public void paintComponent(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 1000, 700);
		drawFlower(g, 100, 100, 100, Color.black, Color.red);
		drawFlower(g, 600, 100, 300, Color.yellow, Color.pink);
		drawFlower(g, 300, 300, 200, Color.red, Color.white);
		drawFlower(g, 130, 500, 150, Color.darkGray, Color.gray);
		drawFlower(g, 700, 500, 120, Color.magenta, Color.lightGray);
	}
	
	/* drawPetal
	 * 꽃잎을 그림
	 * @param g - 그래픽스 g
	 * @param x - x좌표
	 * @param y - y좌표
	 * @param r - 지름
	 * @param angle - 시작위치 각도
	 * @param color - 꽃잎 색상*/
	private void drawPetal (Graphics g, int x, int y, int r, int angle, Color color) {
		g.setColor(color);
		g.fillArc(x, y, r, r, angle, 30);
	}
	
	/* drawFlower
	 * drawPetal 메서드를 활용, 꽃을 그림
	 * @param g - 그래픽스 g
	 * @param x - x좌표
	 * @param y - y좌표
	 * @param r - 지름
	 * @param c1 - 꽃잎 색상
	 * @param c2 - 꽃 색상 */
	public void drawFlower(Graphics g, int x, int y, int r, Color c1, Color c2) {
		int circleRadius = r/2;
		drawPetal(g, x, y, r, 0, c1);
		drawPetal(g, x, y, r, 72, c1);
		drawPetal(g, x, y, r, 144, c1);
		drawPetal(g, x, y, r, 216, c1);
		drawPetal(g, x, y, r, 288, c1);
		g.setColor(c2);
		g.fillOval(x+circleRadius/2, y+circleRadius/2, r-circleRadius, r-circleRadius);
	}
	
	public static void main(String[] args) {
		Homework3 flower = new Homework3();
	}
	
}
