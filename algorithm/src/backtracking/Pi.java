package backtracking;

import java.text.DecimalFormat;

public class Pi {

	public double PiTest(int input) {
		int count = 0, circle_count=0;
		
		for(int i=0; i<input; i++) {			
			double x = (Math.random()*2)-1;
			double y = (Math.random()*2)-1;
			count++;
			if(x*x+y*y<=1) {
				circle_count++;
			}
		}		
		return (double)circle_count/(double)count*4;
	}
	
	public static void main(String[] args) {
		Pi p = new Pi();
		for (int i=1; i<1000000001; i*=3.16) {
			DecimalFormat d = new DecimalFormat("0.00000000");
			double temp = p.PiTest(i);
			String result = d.format(temp);
			double diff = Double.parseDouble(d.format(temp-Math.PI));
//			System.out.println("input "+i+" : "+result);
			System.out.println(i+"오차 : "+(Math.abs(diff)*10000));
		}
	}
	
}
