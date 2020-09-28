import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class EggWriter extends JPanel{
	
	// field Variables
	private int SIZE = 100;
	private int X = 3;
	private int Y = 2;
	private int WIDTH = X * SIZE;
	private int HEIGHT = Y * SIZE;
	private int width = WIDTH;
	private int height = HEIGHT;
	private int x = 0;
	private int y = 0;
	
	// create method
	public EggWriter() {
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Egg");
		f.setSize(WIDTH, HEIGHT+23);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	// paintComponent
	public void paintComponent(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.yellow);
		g.fillOval(x, y, width, height);
		x += X * 5;
		y += Y * 5;
		width = width - X * 10;
		height = height - Y * 10;
	}
	
	public static void main(String[] args) {
		new EggWriter();
	}
}
