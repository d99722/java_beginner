import java.awt.*;
import javax.swing.*;
import java.time.*;

public class ClockWriter extends JPanel {
	public ClockWriter() {
		int width = 200;
		JFrame clock_frame = new JFrame();
		clock_frame.getContentPane().add(this);
		clock_frame.setSize(width,width);
		clock_frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		int width = 200;
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
		LocalTime now = LocalTime.now();
		int minutes_angle = 90 - now.getMinute() * 6;
		int hours_angle = 90 - now.getHour() * 30;
		int sec_angle = 90 - now.getSecond() * 30;
		
		int x = 50;
		int y = 50;
		int diameter = 100;
		
		g.setColor(Color.black);
		g.drawOval(x, y, diameter, diameter);
		
		g.setColor(Color.red);
		g.fillArc(x+5, x+5, diameter-10, diameter-10, minutes_angle, 5);
		
		g.setColor(Color.blue);
		g.fillArc(x+25, y+25, diameter-50, diameter-50, hours_angle, -8);
		
		g.setColor(Color.black);
		g.fillArc(x+5, y+5, diameter, diameter, sec_angle, 1);
	}
	
	public static void main(String[] args) {
		new ClockWriter();
	}
	
}