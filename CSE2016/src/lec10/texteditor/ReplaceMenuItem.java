package lec10.texteditor;

import java.awt.event.*; import javax.swing.*;

public class ReplaceMenuItem extends JMenuItem implements ActionListener {
	private ReplaceFrame view;
	
	public ReplaceMenuItem(String label, ReplaceFrame v) {
		super(label);
		view = v;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		view.setVisible(true);
	}
}
