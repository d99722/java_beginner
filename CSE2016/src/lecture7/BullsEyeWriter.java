package lecture7;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BullsEyeWriter extends JPanel{
	private int rings;
	private int size;
	private int panel_width;
	private int offset = 20;
	
	public BullsEyeWriter(int number_of_rings, int total_size) {
		rings = number_of_rings;
		size = total_size;
		panel_width = size+2*offset;
		
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Bull's Eye");
		f.setSize(panel_width, panel_width+22);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(0, 0, panel_width, panel_width);
		paintBullsEye(offset, offset, rings, size, g);
	}
	
	private void paintBullsEye(int x_position, int y_position, int rings, int size, Graphics g) {
		int count =0;
		int diameter = size;
		int ring_width = size/rings;
		Color color = Color.red;
		while (count != rings) {
			// loop invariant: 지금까지 count개의 링을 그렸음
			int new_x_position = x_position + ring_width * count / 2;
			int new_y_position = y_position + ring_width * count / 2;
			g.setColor(color);
			g.fillOval(new_x_position, new_y_position, diameter, diameter);
			count++;
			diameter -= ring_width;
			if(color == Color.red) {
				color = Color.white;
			} else {
				color = Color.red;
			}
		}
	}
	
	public static void main(String[] args) {
		new BullsEyeWriter(1000, 2000);
	}
	
}
