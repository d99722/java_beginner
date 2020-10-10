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
		LocalDate nowDate = LocalDate.now();
		
		int sec = now.getSecond();
		int min = now.getMinute();
		int hour = now.getHour();
		int sec_angle = 90 - sec * 6;
		int minutes_angle = 90 - min * 6;
		int hours_angle = 90 - hour * 30;

		int year = nowDate.getYear();
		int month = nowDate.getMonthValue();
		int day = nowDate.getDayOfMonth();
		
		String time = hour+":"+min+":"+sec;
		String date = year+"년 "+month+"월 "+day+"일";		
		
		int x = 50;
		int y = 50;
		int diameter = 100;
		
		// fill background
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
		
		// date & time
		g.setColor(Color.black);
		g.drawString(time, x+22, y-10);
		g.drawString(date, x-2, y+diameter+18);

		// draw clock border
		g.drawOval(x, y, diameter, diameter);
		
		// mark1
		g.fillArc(x, y, diameter, diameter, 5, 2);
		g.fillArc(x, y, diameter, diameter, 11, 2);
		g.fillArc(x, y, diameter, diameter, 17, 2);
		g.fillArc(x, y, diameter, diameter, 23, 2);
		g.fillArc(x, y, diameter, diameter, 35, 2);
		g.fillArc(x, y, diameter, diameter, 41, 2);
		g.fillArc(x, y, diameter, diameter, 47, 2);
		g.fillArc(x, y, diameter, diameter, 53, 2);
		g.fillArc(x, y, diameter, diameter, 65, 2);
		g.fillArc(x, y, diameter, diameter, 71, 2);
		g.fillArc(x, y, diameter, diameter, 77, 2);
		g.fillArc(x, y, diameter, diameter, 83, 2);
		g.fillArc(x, y, diameter, diameter, 95, 2);
		g.fillArc(x, y, diameter, diameter, 101, 2);
		g.fillArc(x, y, diameter, diameter, 107, 2);
		g.fillArc(x, y, diameter, diameter, 113, 2);
		g.fillArc(x, y, diameter, diameter, 125, 2);
		g.fillArc(x, y, diameter, diameter, 131, 2);
		g.fillArc(x, y, diameter, diameter, 137, 2);
		g.fillArc(x, y, diameter, diameter, 143, 2);
		g.fillArc(x, y, diameter, diameter, 155, 2);
		g.fillArc(x, y, diameter, diameter, 161, 2);
		g.fillArc(x, y, diameter, diameter, 167, 2);
		g.fillArc(x, y, diameter, diameter, 173, 2);
		g.fillArc(x, y, diameter, diameter, 185, 2);
		g.fillArc(x, y, diameter, diameter, 191, 2);
		g.fillArc(x, y, diameter, diameter, 197, 2);
		g.fillArc(x, y, diameter, diameter, 203, 2);
		g.fillArc(x, y, diameter, diameter, 215, 2);
		g.fillArc(x, y, diameter, diameter, 221, 2);
		g.fillArc(x, y, diameter, diameter, 227, 2);
		g.fillArc(x, y, diameter, diameter, 233, 2);
		g.fillArc(x, y, diameter, diameter, 245, 2);
		g.fillArc(x, y, diameter, diameter, 251, 2);
		g.fillArc(x, y, diameter, diameter, 257, 2);
		g.fillArc(x, y, diameter, diameter, 263, 2);
		g.fillArc(x, y, diameter, diameter, 275, 2);
		g.fillArc(x, y, diameter, diameter, 281, 2);
		g.fillArc(x, y, diameter, diameter, 287, 2);
		g.fillArc(x, y, diameter, diameter, 293, 2);
		g.fillArc(x, y, diameter, diameter, 305, 2);
		g.fillArc(x, y, diameter, diameter, 311, 2);
		g.fillArc(x, y, diameter, diameter, 317, 2);
		g.fillArc(x, y, diameter, diameter, 323, 2);
		g.fillArc(x, y, diameter, diameter, 335, 2);
		g.fillArc(x, y, diameter, diameter, 341, 2);
		g.fillArc(x, y, diameter, diameter, 347, 2);
		g.fillArc(x, y, diameter, diameter, 353, 2);
		g.setColor(Color.white);
		g.fillOval(x+3, y+3, diameter-6, diameter-6);
		
		// mark2
		g.setColor(Color.black);
		g.fillArc(x, y, diameter, diameter, -1, 2);
		g.fillArc(x, y, diameter, diameter, 29, 2);
		g.fillArc(x, y, diameter, diameter, 59, 2);
		g.fillArc(x, y, diameter, diameter, 89, 2);
		g.fillArc(x, y, diameter, diameter, 119, 2);
		g.fillArc(x, y, diameter, diameter, 149, 2);
		g.fillArc(x, y, diameter, diameter, 179, 2);
		g.fillArc(x, y, diameter, diameter, 209, 2);
		g.fillArc(x, y, diameter, diameter, 239, 2);
		g.fillArc(x, y, diameter, diameter, 269, 2);
		g.fillArc(x, y, diameter, diameter, 299, 2);
		g.fillArc(x, y, diameter, diameter, 329, 2);
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