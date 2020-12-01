package lec10.texteditor;

import javax.swing.*; 
import java.awt.event.*; 

public abstract class EditorMenuItem extends JMenuItem implements ActionListener { 
	private EditModel buffer; 
	
	public EditorMenuItem(String label, EditModel model) { 
		super(label);
		buffer = model; 
		addActionListener(this);
	}
	
	public EditModel myModel() { 
		return buffer; 
	}
	
	public abstract void actionPerformed(ActionEvent e);
	
}