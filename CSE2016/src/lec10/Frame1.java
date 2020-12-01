package lec10;

import java.awt.*;
import javax.swing.*;

public class Frame1 extends JFrame{
	
	public Frame1() {
		JLabel label = new JLabel("OK 누르세요.");
		JButton button = new JButton("OK");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label);
		c.add(button);
		
		setTitle("Button");
		setSize(200,70);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Frame1 f = new Frame1();
	}
		
}