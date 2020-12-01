package lec10.tempconv;

import javax.swing.*;
import java.awt.event.*;

/** ComputeTempButton implements a button that converts temperatures */ 
public class ComputeTempButton extends JButton implements ActionListener { 
	private TempCalculator calc = new TempCalculator();
    // the model object for calculating temperatures; 
	// see Fig. 5, Ch. 6 
	private AbsTempFrame view; // address of the view object

	/** Constructor ComputeTempButton constructs the button 
	 * @param v - the address of the view object */
	public ComputeTempButton(String label, AbsTempFrame v) { 
		super("Go");
		view = v;
		addActionListener(this);
	}

	/** actionPerformed calculates the temperature */
	public void actionPerformed(ActionEvent evt) { 
		try { 
			String[] s = view.getInputs(); 
			double start_temp = Double.parseDouble(s[0].trim()); 
			String answer = "is ";
			if (s[1].equals("Celsius"))
				answer = answer + calc.celsiusIntoFahrenheit(start_temp) + " Fahrenheit";
			else 
				answer = answer + calc.fahrenheitIntoCelsius(start_temp) + " Celsius";
			view.displayAnswer(answer);
		}
		catch (RuntimeException e) {
			// if s[0] is nonnumeric, an exception occurs 
			view.displayError(e.getMessage()); 
		}
	} 
}