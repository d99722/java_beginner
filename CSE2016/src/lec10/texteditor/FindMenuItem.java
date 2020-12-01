package lec10.texteditor;

import java.awt.event.*; 
import javax.swing.*;

public class FindMenuItem extends EditorMenuItem {
	
	public FindMenuItem(String label, EditModel model) {
		super(label, model);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = JOptionPane.showInputDialog(this, "Type string to be found:");
		if(s != null) {
			int index = myModel().findFromCaret(s);
			if(index == -1) {
				int response = JOptionPane.showConfirmDialog(this, 
							   "String " + s + " not found. Restart search from beginning of buffer?");
				if (response == JOptionPane.YES_OPTION) {
					index = myModel().findFromStart(s);
					if (index == -1)
						JOptionPane.showMessageDialog(this, "String " + s + " not found.");
				}
			}
		}
	}
}