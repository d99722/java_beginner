import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.*;

public class Main extends JPanel {
	
	public Main() {
		JFrame frame = new JFrame();
		frame.getContentPane().add(this);
		frame.setTitle("test");
		frame.setSize(300,200);
		frame.setVisible(true);
	}
	
	public void paintComponent (Graphics g) {
		g.setColor(Color.red);
		g.drawOval(100, 50, 100, 100);
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		new Main();
		
	}
}