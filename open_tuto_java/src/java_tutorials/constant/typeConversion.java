package java_tutorials.constant;

public class typeConversion {

	public static void main(String[] args) {
		double a = 3.0F;
//		float b = 3.0;
		
		int c = 3;
		float d = 1.0F;
		double e = c + d;
		System.out.println(e);
		
		float f = (float)100.0;
		int g = (int)100.0F;

	}

}
