package lec7_bounceball;

import java.awt.*;
import javax.swing.*;

public class AnimationWriter extends JPanel{

	private BoxWriter box_writer;
	private BallWriter ball_writer;
	
	public AnimationWriter(BoxWriter b, BallWriter l, int size) {
		box_writer = b;
		ball_writer = l;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Bounce");
		f.setSize(size, size+22);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public void paintComponent(Graphics g) {
		box_writer.paintComponent(g);
		ball_writer.paintComponent(g);
	}
	
	
}
