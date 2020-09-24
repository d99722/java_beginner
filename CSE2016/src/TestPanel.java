import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TestPanel extends JPanel{
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.drawString("Hello", 70, 40);
		g.fillRect(0, 0, 300, 200);
		g.setColor(Color.red);
		g.drawRect(100, 60, 90, 60);
		g.fillArc(100,60,90,60,135,100);
	}
}
