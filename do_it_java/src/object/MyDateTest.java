package object;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int month, int day, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate dt = (MyDate)obj;
			return this.day == dt.day && this.month == dt.month && this.year == dt.year;
		
		}
		return false;
	}

	@Override
	public int hashCode() {
		return day + month * 100 + year * 10000;
	}
	
	

}


public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(9,18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));
		
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
