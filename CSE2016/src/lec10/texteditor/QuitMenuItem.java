package lec10.texteditor;

import javax.swing.*; 
import java.awt.event.*;

public class QuitMenuItem extends JMenuItem implements ActionListener {
	
	public QuitMenuItem(String label) { 
		super(label); 
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) { 
		System.exit(0); 
	}
}
