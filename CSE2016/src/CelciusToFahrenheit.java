import java.text.DecimalFormat;

import javax.swing.*;


public class CelciusToFahrenheit {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("섭씨 온도를 정수로 입력해주세요.");
		double c = Double.parseDouble(input);
		double f = (9.0/5.0)*c+32;
		DecimalFormat formatter = new DecimalFormat("0.0");
		String output = "섭씨 "+formatter.format(c)+"도는\n";
		output += "화씨로 "+formatter.format(f)+"도 입니다.";
		JOptionPane.showMessageDialog(null, output);
		
	}

}
