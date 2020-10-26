package hw5;

import javax.swing.*;
import java.time.*;

/** Clock
 * Model */
public class Clock extends JPanel {
	
	private int width = 200;
	private int x = 50;
	private int y = 50;
	private int diameter = 100;

	private int sec;
	private int min;
	private int hour;
	private int sec_angle;
	private int minutes_angle;
	private int hours_angle;

	private int year;
	private int month;
	private int day;
	
	private String time;
	private String date;
	
	/** resetNow
	 * 현재 시간을 받아옴
	 * @return - 현재시간 객체 LocalTime	 */
	public LocalTime resetNow() {
		LocalTime now = LocalTime.now();
		return now;
	}
	
	/** moveTime
	 * 현재 시간에서 시,분,초를 받아옴
	 * @return - 시,분,초가 담긴 String 객체	 */
	public String moveTime() {
		LocalTime resetNow = resetNow();
		sec = resetNow.getSecond();
		min = resetNow.getMinute();
		hour = resetNow.getHour();
		time = hour+":"+min+":"+sec;
		return time;
	}
	
	/** moveDate
	 * 현재 날짜에서 년,월,일을 받아옴
	 * @return - 년,월,일이 담긴 String 객체	 */
	public String moveDate() {
		LocalDate resetDate = LocalDate.now();
		year = resetDate.getYear();
		month = resetDate.getMonthValue();
		day = resetDate.getDayOfMonth();
		date  = year+"년 "+month+"월 "+day+"일";
		return date;
	}
	
	/** moveSec, moveMin, moveHour
	 * 현재 시간의 시,분,초를 받아옴
	 * @return - 현재 시간의 시,분,초 */
	public int moveSec() {
		moveTime();
		sec_angle = 90-sec*6-1;
		return sec_angle;
	}
	public int moveMin() {
		moveTime();
		minutes_angle = 90-min*6-2;
		return minutes_angle;
	}
	public int moveHour() {
		moveTime();
		hours_angle = 90-(hour*30)-(min-(min%12))/2-4;
		return hours_angle;
	}
	
	/** getWidth,getX,getY,getDiameter
	 * 박스 크기, 시계 크기, 반지름 의 정보를 받아옴
	 * @return - 박스 크기, 시계 크기, 반지름	 */
	public int getWidth() {
		return width;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getDiameter() {
		return diameter;
	}
	
}