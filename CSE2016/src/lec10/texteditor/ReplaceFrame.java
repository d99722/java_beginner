package lec10.texteditor;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class ReplaceFrame extends JFrame implements ActionListener { 
	private EditModel model;
	private JButton replace = new JButton("Replace"); 
	private JButton clear = new JButton("Clear"); 
	private JButton close = new JButton("Close"); 
	private JTextField find_text = new JTextField("", 20); 
	private JTextField replace_text = new JTextField("", 20);
	
	public ReplaceFrame(EditModel m) { 
		model = m;
		Container cp = getContentPane(); 
		cp.setLayout(new BorderLayout()); 
		JPanel p1 = new JPanel(new GridLayout(2, 1));
		JPanel p11 = new JPanel(new FlowLayout(FlowLayout.RIGHT)); 
		p11.add(new JLabel("From caret, replace ")); 
		p11.add(find_text);
		p1.add(p11); 
		JPanel p12 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p12.add(new JLabel("by "));
		p12.add(replace_text); 
		p1.add(p12);
		cp.add(p1, BorderLayout.CENTER); 
		JPanel p2 = new JPanel(new FlowLayout());
		p2.add(replace); p2.add(clear); p2.add(close);
		cp.add(p2, BorderLayout.SOUTH); 
		replace.addActionListener(this); 
		clear.addActionListener(this); 
		close.addActionListener(this); 
		setTitle("ReplaceFrame"); 
		pack();
		setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == close) {
			setVisible(false);
		}
		else if(e.getSource() == clear) {
			find_text.setText("");
			replace_text.setText("");
		}
		else if(e.getSource() == replace) {
			String find = find_text.getText();
			int location = model.findFromCaret(find);
			if (location == -1) 
				JOptionPane.showMessageDialog(this, "String " + find + " not found.");
			else
				model.replaceRange(replace_text.getText(), location, location+find.length());
		}
	}
}		