package test;

public class Test1{
	
	private double avg(double[] value) {
		double sum = 0;
		for (int i = 0; i<value.length; i++) {
			sum = sum+value[i];
		}
		double result = sum/value.length;
		return result;		
	}
	
	private double[] hat(double[] xValue, double[] yValue) {
		double xBar = avg(xValue);
		double yBar = avg(yValue);
		double xSum = 0, ySum=0, ysqSum=0, xySum=0, b1hat=0, b0hat = 0;
		System.out.println(yBar);
		for (double v : xValue) {
			xSum = xSum+(v-xBar);
		}
		
		for (double v : yValue) {
			ySum = ySum+(v-yBar);
			ysqSum = ysqSum + ((v-yBar) * (v-yBar));
			System.out.println(ySum);
			System.out.println(ysqSum);
		}
		
		System.out.println(ysqSum);
		
		xySum = xSum * ySum;
		
		b1hat = xySum/ysqSum;
		b0hat = yBar - (b1hat * xBar);
		
		double[] b0b1 = {b0hat, b1hat};
		
		return b0b1;
		
	}
	
	public double[] calculate(double[] xValue, double[] yValue) {
		double[] result = new double[50];
		double[] b0b1 = hat(xValue, yValue);
		double eq = 0;
		
		double b0 = b0b1[0];
		double b1 = b0b1[1];
		
		System.out.println(b1);
		System.out.println(b0);
		
//		for (double v : xValue) {
//			eq = b0 + (b1 * xValue[v]);
//			result[v] = eq;
//		}
		
		return result;
	}
	
	public static void main(String[] args) {
		double[] yValue = {106, 316, 527, 987, 1005, 1278, 1634, 1987, 2336, 2885};
		double[] xValue = {301, 232, 187, 147, 121, 105, 89, 75, 63, 44};
		
		Test1 eco = new Test1();
		eco.calculate(xValue, yValue);
		
		String a = "banana";
		String b = "banana";
		String c = new String("banana");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(a==b);
		System.out.println(b==c);
		
		
		
	}
}
