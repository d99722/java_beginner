import java.text.*;

public class HelloWorld {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("0.0");
		double mile = Double.parseDouble(args[0]);
		String km = formatter.format(mile * 1.60934);
		System.out.println(mile+" 마일은 "+km+" 킬로미터 입니다.");
	}

}
