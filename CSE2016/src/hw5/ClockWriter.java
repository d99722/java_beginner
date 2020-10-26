package hw5;

import java.awt.*;
import javax.swing.*;

/** ClockWriter
 * output view */
public class ClockWriter extends JPanel{

	private Clock clock;
	private int width;
	private int x;
	private int y;
	private int diameter;
	
	public ClockWriter(Clock c) {
		clock = c;
		width = clock.getWidth();
		x = clock.getX();
		y = clock.getY();
		diameter = clock.getDiameter();
		JFrame clock_frame = new JFrame();
		clock_frame.getContentPane().add(this);
		clock_frame.setSize(width,width);
		clock_frame.setVisible(true);
		clock_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/** paintComponent
	 * 시계정보에 대한 정보를 얻어 그림	 */
	public void paintComponent(Graphics g) {		
		int sec_angle = clock.moveSec();
		int minutes_angle = clock.moveMin();
		int hours_angle = clock.moveHour();
		
		String time = clock.moveTime();
		String date = clock.moveDate();
		
		// draw Clock
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
		g.setColor(Color.black);
		g.drawOval(x, y, diameter, diameter);
		for(int i=0; i<60; i++) {
			if(i%5==0)
				continue;
			g.fillArc(x, y, diameter, diameter, i*6-1, 2);
		}
		g.setColor(Color.white);
		g.fillOval(x+3, y+3, diameter-6, diameter-6);
		g.setColor(Color.black);
		for(int i=0; i<12; i++) {g.fillArc(x, y, diameter, diameter, i*30-1, 2);}
		g.setColor(Color.white);
		g.fillOval(x+5, y+5, diameter-10, diameter-10);
		
		// draw Date & Time
		g.setColor(Color.black);
		g.drawString(time, x+22, y-10);
		g.drawString(date, x-2, y+diameter+18);
		
		// draw Second
		g.setColor(Color.black);
		g.fillArc(x+10, y+10, diameter-20, diameter-20, sec_angle, 2);
		
		// draw Minute
		g.setColor(Color.red);
		g.fillArc(x+5, x+5, diameter-10, diameter-10, minutes_angle, 4);
		
		// draw Hour
		g.setColor(Color.blue);
		g.fillArc(x+25, y+25, diameter-50, diameter-50, hours_angle, 8);
		
	}
	
}
