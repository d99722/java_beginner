import java.awt.*;
import javax.swing.*;
import java.time.*;

public class ClockWriter extends JPanel {
	
	int width = 200;

	public ClockWriter() {
		JFrame clock_frame = new JFrame();
		clock_frame.getContentPane().add(this);
		clock_frame.setSize(width,width);
		clock_frame.setVisible(true);
		clock_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
		LocalTime now = LocalTime.now();
		int sec_angle = 90 - now.getSecond() * 6;
		int minutes_angle = 90 - now.getMinute() * 6;
		int hours_angle = 90 - now.getHour() * 30;
		
		int x = 50;
		int y = 50;
		int diameter = 100;
		
		g.setColor(Color.black);
		g.drawOval(x, y, diameter, diameter);
		
		g.fillArc(x+10, y+10, diameter-20, diameter-20, sec_angle, 3);
		
		g.setColor(Color.red);
		g.fillArc(x+5, x+5, diameter-10, diameter-10, minutes_angle, 5);
		
		g.setColor(Color.blue);
		g.fillArc(x+25, y+25, diameter-50, diameter-50, hours_angle, -8);
		
	}
	
	public static void main(String[] args) {
		new ClockWriter();
	}
	
}