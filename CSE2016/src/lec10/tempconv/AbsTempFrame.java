package lec10.tempconv;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class AbsTempFrame extends JFrame { 
	private String START_TEXT = "0";
	private String BLANKS = "            ";
	
	private JTextField input_text = new JTextField(START_TEXT, 8); 
	private JLabel answer = new JLabel(BLANKS);
	// components for the temperature scales list:
	private String[] choices = {"Celsius", "Fahrenheit"};
	private JList scales = new JList(choices);
	
	/** AbsTempFrame constructs the frame */
	public AbsTempFrame() {
		ComputeTempButton compute_controller = new ComputeTempButton("Go", this); 
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4, 1));
		JPanel p1 = new JPanel(new FlowLayout());
		p1.add(new JLabel("Convert degrees:")); 
		cp.add(p1);
		JPanel p2 = new JPanel(new FlowLayout()); 
		p2.add(input_text);
		p2.add(scales);
		cp.add(p2); 
		JPanel p3 = new JPanel(new FlowLayout());
		p3.add(answer);
		cp.add(p3);
		JPanel p4 = new JPanel(new FlowLayout());
		p4.add(compute_controller);
		p4.add(new ResetButton("Reset", this)); // see Figure 29
		p4.add(new ExitButton("Bye"));  // see Figure 16
		cp.add(p4);
		resetFields(); // initialize the view 
		setSize(240, 180); 
		setTitle("Temperature Convertor"); 
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/** getInputs returns the inputs the user typed and selected. 
	 * @return (1) the string the user typed, and
	 *         (2) "Celsius" or "Fahrenheit" */
	public String[] getInputs() { 
		String[] input = new String[2];
		input[0] = input_text.getText();
		input[1] = choices[scales.getSelectedIndex()]; 
		return input;
	}
	
	/** displayAnswer resets the label
	 * @param s - the string used to reset the label */
	public void displayAnswer(String s) { 
		answer.setText(s);
	}

	/** displayError displays an error message
	 * @param s - the message */
	public abstract void displayError(String s);  // will be coded later
	
	/** resetFields resets the view’s text field */ 
	public void resetFields() { 
		input_text.setText(START_TEXT);
		answer.setText(BLANKS);
		scales.setSelectedIndex(0); // reset scale selection
	}
}
