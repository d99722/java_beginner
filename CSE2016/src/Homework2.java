import java.awt.*;
import javax.swing.*;
import java.time.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Homework2 extends JPanel {
	
	int width = 200;

	public Homework2() {
		JFrame clock_frame = new JFrame();
		clock_frame.getContentPane().add(this);
		clock_frame.setSize(width,width);
		clock_frame.setVisible(true);
		clock_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void paintComponent(Graphics g) {
		LocalTime now = LocalTime.now();
		Date today = new Date();
		
		int sec = now.getSecond();
		int min = now.getMinute();
		int hour = now.getHour();
		int sec_angle = 90 - sec * 6;
		int minutes_angle = 90 - min * 6;
		int hours_angle = 90 - hour * 30;

		String time = hour+":"+min+":"+sec;
		SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일");
		String formatToday = date.format(today);
		
		int x = 50;
		int y = 50;
		int diameter = 100;
		
		// fill background
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
		
		// date & time
		g.setColor(Color.black);
		g.drawString(time, x+22, y-10);
		g.drawString(formatToday, x-2, y+diameter+18);

		// draw clock border
		g.drawOval(x, y, diameter, diameter);
		
		// mark1
		for (int i=0; i<60; i++) {
			if (i%5==0) continue;
			else g.fillArc(x, y, diameter, diameter, 6*i-1, 2);
		}
		g.setColor(Color.white);
		g.fillOval(x+3, y+3, diameter-6, diameter-6);
		
		// mark2
		g.setColor(Color.black);
		for (int i=0; i<12; i++) g.fillArc(x, y, diameter, diameter, 30*i-1, 2);
		g.setColor(Color.white);
		g.fillOval(x+5, y+5, diameter-10, diameter-10);
		
		// sec
		g.setColor(Color.black);
		g.fillArc(x+10, y+10, diameter-20, diameter-20, sec_angle, 3);
		
		// min
		g.setColor(Color.red);
		g.fillArc(x+5, x+5, diameter-10, diameter-10, minutes_angle, 5);
		
		// hour
		g.setColor(Color.blue);
		g.fillArc(x+25, y+25, diameter-50, diameter-50, hours_angle, -8);
		
	}
	
	public static void main(String[] args) {
		new Homework2();
	}
	
}